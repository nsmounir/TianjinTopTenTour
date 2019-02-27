package com.example.tianjintoptentour;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;

import android.util.Log;

import android.view.Menu;
import android.widget.ImageView;
import android.widget.ListView;

import android.support.v7.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class NewsDetail extends AppCompatActivity {

    public static final String EXTRA_NAME = "cheese_name";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guide_list);
        android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final ArrayList<GuideDetail> text = new ArrayList<>();
        text.add(new GuideDetail("Title", getString(R.string.news1), R.drawable.ic_launcher_background));
        text.add(new GuideDetail("Title", "Two", R.drawable.ic_launcher_background));
        text.add(new GuideDetail("Title", "Three", R.drawable.ic_launcher_background));

/**
 * Get the image of the appbar detail category
 */

        GuideDetailAdapter itemsAdapter = new GuideDetailAdapter(this, text);

        ListView listView = (ListView) findViewById(R.id.guide_list);

        listView.setAdapter(itemsAdapter);

        Log.v("NewsDetail", "HIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");


    }

}
