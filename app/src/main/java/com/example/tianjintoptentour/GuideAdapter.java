package com.example.tianjintoptentour;


import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class GuideAdapter extends ArrayAdapter<Guide> {

    public GuideAdapter(Activity context, ArrayList<Guide> Guide) {

        super(context, 0, Guide);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        final Guide currentText = getItem(position);
        /**
         * set the Image in the category list
         */
        ImageView iconImageView = listItemView.findViewById(R.id.list_item_image);
        if (currentText.hasImage()) {
            iconImageView.setImageResource(currentText.getGuideImage());
            iconImageView.setVisibility(View.VISIBLE);

        } else {
            iconImageView.setVisibility(View.GONE);
        }

        /**
         * set the text in the category list
         */

        TextView nameTextView = listItemView.findViewById(R.id.list_item_text);
        nameTextView.setText(currentText.getGuideText());




        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }


}