package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
<<<<<<< HEAD
 * Created by bhoang2 on 1/14/16.
 */
public class NormalTweet extends Tweet implements Tweetable{
=======
 * Created by romansky on 1/12/16.
 */
public class NormalTweet extends Tweet implements Tweetable {
    public NormalTweet(Date date, String message) {
        super(date, message);
    }

>>>>>>> a757e189330a36fefba1f16891d5406b83d2fa9d
    public NormalTweet(String message) {
        super(message);
    }

<<<<<<< HEAD
    @Override
    public boolean isImportant() {
        return false;
=======
    public Date getDate() {
        return this.date;
>>>>>>> a757e189330a36fefba1f16891d5406b83d2fa9d
    }

    public String getMessage() {
        return this.message;
    }
<<<<<<< HEAD
}
=======

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
>>>>>>> a757e189330a36fefba1f16891d5406b83d2fa9d
