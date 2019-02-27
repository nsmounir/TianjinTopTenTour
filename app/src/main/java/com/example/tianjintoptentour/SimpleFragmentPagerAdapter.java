package com.example.tianjintoptentour;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 4;
    private String tabTitles[] = new String[] { "News", "Hotels", "Restaurants", "Landmarks" };
    private Context context;

    public SimpleFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return NewsFragment.newInstance(position+1);
        }  else if (position == 1){
            return HotelsFragment.newInstance(position+1);
        } else if (position == 2){
            return RestaurantsFragment.newInstance(position+1);
        }else {
            return LandmarksFragment.newInstance(position+1);
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        if (position == 0) {
            return "News";
        }  else if (position == 1){
            return "Hotels";
        } else if (position == 2){
            return  "Restaurants";
        }else {
            return "Landmarks";
        }

    }
}