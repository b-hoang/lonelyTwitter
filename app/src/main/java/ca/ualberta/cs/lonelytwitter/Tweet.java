package ca.ualberta.cs.lonelytwitter;

<<<<<<< HEAD
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
=======
import java.util.Date;

/**
 * Created by romansky on 1/12/16.
 */
public abstract class Tweet {
    protected Date date;
    protected String message;

    public abstract Boolean isImportant();

    public Tweet(Date date, String message) {
        this.date = date;
        this.message = message;
>>>>>>> a757e189330a36fefba1f16891d5406b83d2fa9d
    }

    public Tweet(String message) {
        this.message = message;
<<<<<<< HEAD
        this.date = new Date(System.currentTimeMillis());
    }

    public Date getDate(){
        return date;
    }

=======
        this.date = new Date();
    }

    public Date getDate() {
        return this.date;
    }

    public String getMessage() {
        return this.message;
    }
>>>>>>> a757e189330a36fefba1f16891d5406b83d2fa9d
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            throw new TweetTooLongException();
        }
        this.message = message;
    }

<<<<<<< HEAD
    public void setDate(Date date){
        this.date = date;
    }

    public String getMessage() {
        return this.message;
    }

    abstract public boolean isImportant();

=======
    public void setDate(Date date) {
        this.date = date;
    }

>>>>>>> a757e189330a36fefba1f16891d5406b83d2fa9d
    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }
}
