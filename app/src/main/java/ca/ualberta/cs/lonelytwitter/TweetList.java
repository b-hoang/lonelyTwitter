package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

/**
 * This class is a list of Tweets. It contains methods that <br>allows you to
 * add/remove tweets, check if a tweet <br>exists within the TweetList, get a Tweet, and check <br>
 *     size of the list.
 *
 * @see Tweet
 */
public class TweetList {
    // Instantiates an ArrayList of Tweets.
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void addTweet(Tweet tweet){
        /**
         * Adds a Tweet to the TweetList.
         *
         * @param Tweet tweet
         * @exception IllegalArgumentException
         */
        try {
            if (tweets.contains(tweet) == Boolean.FALSE) {
                tweets.add(tweet);
            }
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }

    public boolean hasTweet(Tweet tweet) {
        /**
         * <code>hasTweet()</code> checks if the Tweet already exists in the TweetList.
         * @param Tweet tweet
         * @return true or false
         */
        return tweets.contains(tweet);
    }

    public void removeTweet(Tweet tweet){
        /**
         * Removes a tweet.
         * @param Tweet tweet
         */
        tweets.remove(tweet);
    }

    public Tweet getTweet(int index){
        /**
         * Returns the index of a Tweet.
         * @param int index
         * @returns index of Tweet
         */
        return tweets.get(index);
    }

    public int getCount(){
        /**
         * Returns the size of the tweet.
         */
        return tweets.size();
    }




}
