package ca.ualberta.cs.lonelytwitter;

/**
 * Created by bhoang2 on 1/14/16.
 */
public class SadMood extends Mood implements ABC {

    public SadMood(String mood) {
        super(mood);
    }
    public String getMood() {
        return "-- currently feeling " + mood;
    }

}
