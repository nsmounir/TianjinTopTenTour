package com.example.tianjintoptentour;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class LandmarksFragment extends Fragment {

    public static final String ARG_PAGE = "ARG_PAGE";

    private int mPage;

    public static LandmarksFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        LandmarksFragment fragment = new LandmarksFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guide_list, container, false);

        final ArrayList<Guide> text = new ArrayList<>();
        text.add(new Guide(R.drawable.ic_launcher_background, "One"));
        text.add(new Guide(R.drawable.ic_launcher_background, "Two"));
        text.add(new Guide(R.drawable.ic_launcher_background, "Three"));
        text.add(new Guide(R.drawable.ic_launcher_background, "Four"));
        text.add(new Guide(R.drawable.ic_launcher_background, "Five"));
        text.add(new Guide(R.drawable.ic_launcher_background, "Six"));
        text.add(new Guide(R.drawable.ic_launcher_background, "Seven"));
        text.add(new Guide(R.drawable.ic_launcher_background, "Eight"));
        text.add(new Guide(R.drawable.ic_launcher_background, "Nine"));
        text.add(new Guide(R.drawable.ic_launcher_background, "Ten"));


        GuideAdapter itemsAdapter = new GuideAdapter(getActivity(), text);

        ListView listView = (ListView) rootView.findViewById(R.id.guide_list);

        listView.setAdapter(itemsAdapter);

        // Create a message handling object as an anonymous class.
         AdapterView.OnItemClickListener messageClickedHandler = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView parent, View v, int position, long id)
            {
                Log.v("NumbersActivity", "HIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
                Context context = v.getContext();
                Intent intent = new Intent(context , LandmarksDetail.class);

                context.startActivity(intent);
                // Display a messagebox.

            }
        };

     // Now hook into our object and set its onItemClickListener member
     // to our class handler object.

        listView.setOnItemClickListener(messageClickedHandler);
            return rootView;

    }



}
