package ca.ualberta.cs.lonelytwitter;

import android.os.AsyncTask;
import android.util.Log;

import com.searchly.jestdroid.DroidClientConfig;
import com.searchly.jestdroid.JestClientFactory;
import com.searchly.jestdroid.JestDroidClient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import io.searchbox.core.DocumentResult;
import io.searchbox.core.Index;
import io.searchbox.core.Search;
import io.searchbox.core.SearchResult;

/**
 * Created by esports on 2/17/16.
 */
public class ElasticsearchTweetController {
    private static JestDroidClient client;

    //TODO: A function that gets tweets
        public static ArrayList<Tweet> getTweets() {
            verifyConfig();
            return null;
        }

    public static class GetTweetsTask extends AsyncTask<String,Void,ArrayList<NormalTweet>>{

        @Override
        protected ArrayList<NormalTweet> doInBackground(String... params) {

            ArrayList<NormalTweet> tweets = new ArrayList<NormalTweet>();

            verifyConfig();

            // NOTE: A HUGE ASSUMPTION IS ABOUT TO BE MADE!
            // Assume that only one string is passed in.

            String search_string = params[0];
            Search search = new Search.Builder(search_string).addIndex("testing").addType("tweet").build();
            try {
                SearchResult execute = client.execute(search);
                if(execute.isSucceeded()){
                    List<NormalTweet> foundTweets = execute.getSourceAsObjectList(NormalTweet.class);
                    tweets.addAll(foundTweets);
                } else {
                    Log.i("TODO", "Search was unsuccessful, do something!");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return tweets;
        }
    }

    public static class AddTweetTask extends AsyncTask<NormalTweet,Void,Void>{

        @Override
        protected Void doInBackground(NormalTweet... params) {
            verifyConfig();

            for (NormalTweet tweet : params) {
                verifyConfig();
                Index index = new Index.Builder(tweet).index("testing").type("tweet").build();

                try {
                    DocumentResult execute = client.execute(index);
                    if (execute.isSucceeded()){
                        tweet.setId(execute.getId());
                    } else {
                        Log.e("TODO", "Our insert of tweet failed, oh no!");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }
    }

    // Will create a client if no client already exists.
    public static void verifyConfig(){
        if(client == null) {
            DroidClientConfig.Builder builder = new DroidClientConfig.Builder("http://cmput301.softwareprocess.es:8080");
            DroidClientConfig config = builder.build();

            JestClientFactory factory = new JestClientFactory();
            factory.setDroidClientConfig(config);
            client = (JestDroidClient) factory.getObject();
        }
    }
}
