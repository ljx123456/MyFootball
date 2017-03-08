package com.example.alu.myfootball.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.alu.myfootball.R;
import com.example.alu.myfootball.adapter.Myadapter;

import java.util.ArrayList;

/**
 * Created by alu on 2017/2/27.
 */

public class Fragment3 extends Fragment{
    private ViewPager viewPager;
    private Myadapter myadapter;
    private TabLayout tabLayout;

    private String[] names = {"英超","德甲","意甲","法甲","西甲"};
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.layout_fragment3,null);
        viewPager = (ViewPager) view.findViewById(R.id.viewpager3);
        viewPager.setOffscreenPageLimit(2);
        tabLayout= (TabLayout) view.findViewById(R.id.tablayout3);
        myadapter = new Myadapter(getFragmentManager(),getData(),names);
        viewPager.setAdapter(myadapter);
        tabLayout.setupWithViewPager(viewPager);
        return view;
    }
    //关于btn的监听修改等写在下面
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
    public ArrayList<Fragment> getData(){
        ArrayList<Fragment> list = new ArrayList<>();
        FragmentItem3_2 fragmentItem2;
        Bundle bundle;
        for(int i =0;i<5;i++){
            fragmentItem2 =new FragmentItem3_2();
            bundle=new Bundle();
            bundle.putString("name",names[i]);
            fragmentItem2.setArguments(bundle);
            list.add(fragmentItem2);
        }
        return list;
    }
}
