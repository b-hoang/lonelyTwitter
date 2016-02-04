package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * This class is the main object we will be using in this app. <br> A tweet comprises of
 * a message, date, and mood. <br>
 *
 *
 */
public abstract class Tweet {
    // Instantiates variables
    protected String message;
    private Date date;
    private ArrayList<Mood> mood ;

    public Tweet(String message, Date date) {
        /**
         *
         * @param String message, Date date
         *
         */
        this.message = message;
        this.date = date;
        Mood happy = new HappyMood("happy");
        mood.add(happy);
    }

    public Tweet(String message) {
        this.message = message;
        this.date = new Date(System.currentTimeMillis());
    }

    public Date getDate(){
        return date;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public String getMessage() {
        return this.message;
    }

    abstract public boolean isImportant();

    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }
}
