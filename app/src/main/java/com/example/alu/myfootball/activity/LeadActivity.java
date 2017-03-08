package com.example.alu.myfootball.activity;

import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.alu.myfootball.R;
import com.example.alu.myfootball.adapter.ViewPagerAdapter;
import com.example.alu.myfootball.util.SharedUtil;

public class LeadActivity extends BaseActivity {

    private ViewPager viewPager;
    private int page;
    private Animation animation;
    @Override
    public void addLayout() {
        setContentView(R.layout.activity_lead);
    }
    @Override
    public void initView() {
        viewPager= (ViewPager) findViewById(R.id.viewpager);
        animation= AnimationUtils.loadAnimation(this,R.anim.alpha);
        final ImageView[] views = new ImageView[3];
        for(int i=0;i<3;i++){
            views[i]=new ImageView(this);
        }
        views[0].setBackgroundResource(R.drawable.a1);
        views[1].setBackgroundResource(R.drawable.a2);
        views[2].setBackgroundResource(R.drawable.a3);

        viewPager.setAdapter(new ViewPagerAdapter(views));
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }
            @Override
            public void onPageSelected(int position) {
                page=position;

            }
            @Override
            public void onPageScrollStateChanged(int state) {
                if(page==views.length-1&&state==0){
                    animation.start();
                }
            }
        });
        //最后一页滑动时进入Login界面
        viewPager.setOnTouchListener(new View.OnTouchListener() {
            float startX;
            float endX;
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        startX=event.getX();
                        break;
                    case MotionEvent.ACTION_UP:
                        endX=event.getX();
                        DisplayMetrics metric = new DisplayMetrics();
                        getWindowManager().getDefaultDisplay().getMetrics(metric);
                        int width=metric.widthPixels;
                        if(page==views.length-1&&(startX-endX)>width/4){
                            SharedUtil.saveTag(LeadActivity.this);
                            gotoActivity(MainActivity.class,1);
                            finish();
                        }
                        break;
                    case MotionEvent.ACTION_MOVE:
                        break;
                }
                return false;
            }
        });
    }

}

