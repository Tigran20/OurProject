package com.example.android.testchildren.data;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class LettersAdapter extends FragmentPagerAdapter {

    public LettersAdapter(FragmentManager mgr) {
        super(mgr);
    }
    @Override
    public int getCount() {
        return(33);
    }
    @Override
    public Fragment getItem(int position) {
        return(LettersFragment.newInstance(position));
    }
}