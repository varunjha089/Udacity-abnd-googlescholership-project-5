package com.example.bharatmk257.guide;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context fragmentContext;
    int totalTabs;
    private String tabTitles[] = new String[] { "Food", "Library","Entertainment" };

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fragmentManager, int totalTab){
        super(fragmentManager);
        fragmentContext = context;
        this.totalTabs = totalTab;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){

            case 0:
                FoodFragment foodFragment =new FoodFragment();
                return foodFragment;

            case 1:
                LibraryFragment libraryFragment = new LibraryFragment();
                return libraryFragment;
            case 2:
                EntertainmentFragment entertainmentFragment = new EntertainmentFragment();
                return entertainmentFragment;

            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return totalTabs;
    }

    /**
     * This method may be called by the ViewPager to obtain a title string
     * to describe the specified page. This method may return null
     * indicating no title for this page. The default implementation returns
     * null.
     *
     * @param position The position of the title requested
     * @return A title for the requested page
     */
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}


