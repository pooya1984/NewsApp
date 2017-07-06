package com.example.android.newsapp;

/**
 * Created by PnoD on 7/5/2017.
 */

public class News {
    private String mSection;
    private String mTitle;
    private long mDateTime;
    private String mUrl;

    public News(String Section , String Title, long DateTime, String Url) {
        mSection = Section;
        mTitle = Title;
        mDateTime = DateTime;
        mUrl = Url;
    }

    public String getSection() {
        return mSection;
    }

    public String getTitle() {
        return mTitle;
    }

    public long getDateTime() {
        return mDateTime;
    }

    public String getUrl() {
        return mUrl;
    }

}