package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by bhoang2 on 1/28/16.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test Tweet");

        tweets.addTweet(tweet);
        tweets.addTweet(tweet);
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));


    }

    public void testHasTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Another Test Tweet");

        assertFalse(tweets.hasTweet(tweet));
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));


    }

    public void testGetTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Another Test Test");

        tweets.addTweet(tweet);
        Tweet returnedTweet = tweets.getTweet(0);

        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());
    }

    public void testDeleteTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Another Test Tweet");

        tweets.addTweet(tweet);
        tweets.removeTweet(tweet);
    }

    public void testGetTweets() {
    }

    public void testGetCount(){
        TweetList tweets = new TweetList();
        Tweet tweet1 = new NormalTweet("TWEET #1");
        Tweet tweet2 = new NormalTweet("TWEET #2");
        Tweet tweet3 = new NormalTweet("TWEET #3");
        Tweet tweet4 = new NormalTweet("TWEET #4");
        Tweet tweet5 = new NormalTweet("TWEET #5");

        tweets.addTweet(tweet1);
        tweets.addTweet(tweet2);
        tweets.addTweet(tweet3);
        tweets.addTweet(tweet4);
        tweets.addTweet(tweet5);

        assertEquals(tweets.getCount(), 5);
        tweets.removeTweet(tweet5);
        assertEquals(tweets.getCount(), 4);
    }
}

