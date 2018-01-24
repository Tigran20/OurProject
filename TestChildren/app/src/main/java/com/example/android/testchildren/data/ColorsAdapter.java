package com.example.android.testchildren.data;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class ColorsAdapter extends FragmentPagerAdapter{

    public ColorsAdapter(FragmentManager mgr) {
        super(mgr);
    }
    @Override
    public int getCount() {
        return(8);
    }
    @Override
    public Fragment getItem(int position) {
        return(ColorsFragment.newInstance(position));
    }
}
