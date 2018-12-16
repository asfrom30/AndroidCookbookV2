package com.doyoon.androidcookbookv2.apis.view.pager;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.doyoon.androidcookbookv2.R;

import java.util.ArrayList;
import java.util.List;

public class SubActivity extends AppCompatActivity implements FragmentInViewPager.OnFragmentInteractionListener{

    List<String> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        main();
    }


    private void main () {
        itemList = new ArrayList<>();
        itemList.add("A");
        itemList.add("B");
        itemList.add("C");
        itemList.add("D");
        itemList.add("E");

        LocalFragmentPagerAdapter pagerAdapter = new LocalFragmentPagerAdapter(getSupportFragmentManager());
        ((ViewPager) findViewById(R.id.viewpager_in_view_pager_activity)).setAdapter(pagerAdapter);

        // WARNING : you must implement OnFragmentInteractionListener in Parent activity
    }

    private class LocalFragmentPagerAdapter extends FragmentPagerAdapter {

        public LocalFragmentPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            String item = itemList.get(i);
            return FragmentInViewPager.newInstance("Hello Doyoon, ", "index is [" + i + "]" + "String is [" + item + "]");
        }

        @Override
        public int getCount() {
            return itemList.size();
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {
        // Nothing to do
    }
}
