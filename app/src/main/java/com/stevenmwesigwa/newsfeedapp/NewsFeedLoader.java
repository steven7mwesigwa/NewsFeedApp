package com.stevenmwesigwa.newsfeedapp;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Loads a list of newsfeeds by using an AsyncTask to perform the
 * network request to the given URL.
 */
public class NewsFeedLoader extends AsyncTaskLoader<List<NewsFeed>> {

    /** Tag for log messages */
    private static final String LOG_TAG = NewsFeedLoader.class.getName();

    /** Query URL */
    private String mGuardianApiRequestUrl;

    /**
     * Constructs a new {@link NewsFeedLoader}.
     *
     * @param context of the activity
     * @param guardianApiRequestUrl to load data from
     */
    public NewsFeedLoader(Context context, String guardianApiRequestUrl) {
        super(context);
        mGuardianApiRequestUrl = guardianApiRequestUrl;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    /**
     * This is on a background thread.
     */
    @Override
    public List<NewsFeed> loadInBackground() {
        if (mGuardianApiRequestUrl == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of newsFeeds.
        List<NewsFeed> newsFeeds = QueryUtils.fetchNewsfeedData(mGuardianApiRequestUrl);
        return newsFeeds;
    }
}
