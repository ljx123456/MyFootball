package com.example.alu.myfootball.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by alu on 2017/2/28.
 */

public class Myadapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> list;
    private String[] names;
    public Myadapter(FragmentManager fm, ArrayList<Fragment> list,String[] names) {
        super(fm);
        this.list = list;
        this.names=names;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return names[position];
    }
}
