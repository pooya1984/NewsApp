package com.example.android.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {
    private static final String LOG_TAG = NewsAdapter.class.getName();

    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        News currentNews = getItem(position);

        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText(currentNews.getTitle());

        TextView date = (TextView) listItemView.findViewById(R.id.item_date);
        date.setText(currentNews.getDate());

        TextView section = (TextView) listItemView.findViewById(R.id.item_section);
        section.setText(currentNews.getSection());

        return listItemView;
    }
}