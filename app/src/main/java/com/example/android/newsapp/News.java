package com.example.android.newsapp;

/**
 * Created by PnoD on 7/5/2017.
 */

public class News {
    private String mSection;
    private String mTitle;
    private String mDate;
    private String mUrl;


    public News(String title, String section, String date, String url) {
        mSection = section;
        mTitle = title;
        mDate = date;
        mUrl = url;
    }




    public String getSection() {
        return mSection;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getDate() {return mDate;}

    public String getUrl() {
        return mUrl;
    }

}