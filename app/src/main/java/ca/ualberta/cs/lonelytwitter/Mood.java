package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by bhoang2 on 1/14/16.
 */
public abstract class Mood {
    protected String mood;
    private Date date;

    public Mood(String mood, Date date){
        this.mood = mood;
        this.date = new Date(System.currentTimeMillis());
    }

    public Date getDate(){
        return date;
    }

    public Mood(String mood) {
        this.mood = mood;
        this.date = new Date(System.currentTimeMillis());
    }

    public void setDate(Date date){
        this.date = date;
    }
}
