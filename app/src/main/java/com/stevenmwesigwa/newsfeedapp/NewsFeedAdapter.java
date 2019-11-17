package com.stevenmwesigwa.newsfeedapp;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

public class NewsFeedAdapter extends ArrayAdapter<NewsFeed> {
    /**
     * Constructs a new {@link NewsFeedAdapter}.
     *
     * @param context of the app
     * @param newsFeeds is the list of newsFeeds, which is the data source of the adapter
     */
    public NewsFeedAdapter(Context context, List<NewsFeed> newsFeeds) {
        super(context, 0, newsFeeds);
    }

    /**
     * Return the formatted date string (i.e. "Mar 3, 1984") from a Date object.
     */
    private String formatDate(String dateString) {
        DateTimeFormatter  dateTimeFormatter = DateTimeFormatter.ofPattern("LLL dd, yyyy");
        LocalDate localDate =  LocalDate.parse(dateString.substring(0, 10));
        return dateTimeFormatter.format(localDate);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.newsfeed_list_item, parent, false);
        }

        // Find the newsfeed at the given position in the list of newsfeeds
        NewsFeed currentNewsFeed = getItem(position);


        TextView newsFeedTitle = listItemView.findViewById(R.id.newsFeedTitle);
        newsFeedTitle.setText(currentNewsFeed.getNewsFeedTitle());
        TextView newsFeedBodyText = listItemView.findViewById(R.id.newsFeedBodyText);
        newsFeedBodyText.setText(currentNewsFeed.getNewsFeedBodyText());
        TextView newsFeedSection = listItemView.findViewById(R.id.newsFeedSection);
        newsFeedSection.setText(currentNewsFeed.getNewsFeedSection());
        TextView newsFeedPublicationDate = listItemView.findViewById(R.id.newsFeedPublicationDate);
        String formatedPublicationDate = formatDate(currentNewsFeed.getNewsFeedPublicationDate());
        newsFeedPublicationDate.setText(formatedPublicationDate);
        TextView newsFeedContributor = listItemView.findViewById(R.id.newsFeedContributor);
        newsFeedContributor.setText(currentNewsFeed.getNewsFeedContributor());


        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }
}
