package com.example.tianjintoptentour;


import android.app.Activity;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import java.util.ArrayList;

public class GuideDetailAdapter extends ArrayAdapter<GuideDetail> {

    public GuideDetailAdapter(Activity context, ArrayList<GuideDetail> GuideDetail) {

        super(context, 0, GuideDetail);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.scroll_detail, parent, false);
        }

        final GuideDetail currentDetailText = getItem(position);

        /**
         * set the text in the category list
         */

        TextView detail_title = listItemView.findViewById(R.id.detail_title);
        detail_title.setText(currentDetailText.getGuideDetailTitle());


        TextView detail_body = listItemView.findViewById(R.id.detail_body);
        detail_body.setText(currentDetailText.getGuideDetailBody());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;

    }



}