package ca.ualberta.cs.lonelytwitter;

/**
 * Created by bhoang2 on 1/14/16.
 */
public class ImportantTweet extends Tweet implements Tweetable {
    public ImportantTweet(String message){
        super(message);
    }

    @Override
    public boolean isImportant(){
        return false;
    }

    public String getMessage() {
        return "IMPORTANT!! " + this.message;
    }
}
