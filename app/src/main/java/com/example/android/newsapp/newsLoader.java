package com.example.android.newsapp;

/**
 * Created by PnoD on 7/6/2017.
 */

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.util.List;

public class newsLoader extends AsyncTaskLoader<List<News>> {


    private static final String LOG_TAG = newsLoader.class.getName();

    private String mUrl;


    public newsLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        Log.i(LOG_TAG, "Test: onStartLoading() called...");
        forceLoad();
    }


    @Override
    public List<News> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        List<News> newsData = QueryUtils.fetchNewsData(mUrl);
        return newsData;
    }
}
