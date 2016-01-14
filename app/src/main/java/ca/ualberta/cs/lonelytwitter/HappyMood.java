package ca.ualberta.cs.lonelytwitter;

/**
 * Created by bhoang2 on 1/14/16.
 */
public class HappyMood extends Mood implements ABC {

    public HappyMood(String mood) {
        super(mood);
    }

     public String getMood() {
            return "-- currently feeling " + mood;
        }

}
