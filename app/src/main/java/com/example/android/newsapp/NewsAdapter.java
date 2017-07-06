package com.example.android.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by PnoD on 7/5/2017.
 */

public class NewsAdapter extends ArrayAdapter<News> {

    private static final String Title_SEPARATOR = " of ";


    public NewsAdapter(Context context, List<News> newsList) {
        super(context, 0, newsList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        News currentNews = getItem(position);
        String originalTitle = currentNews.getTitle();

        String primaryTitle;

        if (originalTitle.contains(Title_SEPARATOR)) {

            String[] parts = originalTitle.split(Title_SEPARATOR);
            primaryTitle = parts[0];
        } else {
            primaryTitle = originalTitle;
        }


        TextView sectionView = (TextView) listItemView.findViewById(R.id.item_section);
        String formattedSection = formatSection(currentNews.getSection());
        sectionView.setText(formattedSection);

        TextView primaryTitleView = (TextView) listItemView.findViewById(R.id.item_title);
        primaryTitleView.setText(primaryTitle);

        Date dateObject = new Date(currentNews.getDateTime());


        TextView dateView = (TextView) listItemView.findViewById(R.id.item_date);
        String formattedDate = formatDate(dateObject);
        dateView.setText(formattedDate);

        TextView timeView = (TextView) listItemView.findViewById(R.id.item_time);
        String formattedTime = formatTime(dateObject);
        timeView.setText(formattedTime);

        return listItemView;
    }

    private String formatSection(String Location) {
        DecimalFormat sectionFormat = new DecimalFormat("0.0");
        return sectionFormat.format(Location);
    }
    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }
}