package com.example.android.testchildren.data;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter {

    public MyAdapter(FragmentManager mgr) {
        super(mgr);
    }
    @Override
    public int getCount() {
        return(33);
    }
    @Override
    public Fragment getItem(int position) {
        return(PageFragment.newInstance(position));
    }
}