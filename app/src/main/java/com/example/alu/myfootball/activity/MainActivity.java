package com.example.alu.myfootball.activity;

import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.TextView;

import com.example.alu.myfootball.fragment.Fragment2;
import com.example.alu.myfootball.fragment.Fragment1;
import com.example.alu.myfootball.fragment.Fragment3;
import com.example.alu.myfootball.fragment.Fragment4;
import com.example.alu.myfootball.R;
import com.example.alu.myfootball.util.SharedUtil;

public class MainActivity extends BaseActivity {
    private FragmentManager fragmentManager;//fragment的管理者
    private FragmentTransaction transaction;//fragment管理事物
    private TextView[] textView=new TextView[4];
    private int now_count;
    private Fragment[] fragments = new Fragment[4];

    @Override
    public void initView() {
        textView[0]= (TextView) findViewById(R.id.main_tv1);
        textView[1]= (TextView) findViewById(R.id.main_tv2);
        textView[2]= (TextView) findViewById(R.id.main_tv3);
        textView[3]= (TextView) findViewById(R.id.main_tv4);

        fragmentManager = getSupportFragmentManager();
        transaction = fragmentManager.beginTransaction();
        fragments[0] = new Fragment1();
        transaction.add(R.id.main_layout,fragments[0]);
        Drawable img = getResources().getDrawable(R.drawable.c1);
        // 调用setCompoundDrawables时，必须调用Drawable.setBounds()方法,否则图片不显示
        img.setBounds(0, 0, img.getMinimumWidth(), img.getMinimumHeight());
        textView[0].setCompoundDrawables(null, img, null, null); //设置上图标
        textView[0].setTextColor(0xff16b13a);
        transaction.commit();
        now_count=0;
        textView[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choice(0);
                initialize(0);
                choiceFragment(0);
            }
        });
        textView[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choice(1);
                initialize(1);
                choiceFragment(1);
            }
        });
        textView[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choice(2);
                initialize(2);
                choiceFragment(2);
            }
        });
        textView[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choice(3);
                initialize(3);
                choiceFragment(3);
            }
        });

    }

    @Override
    public void addLayout() {
        if(!SharedUtil.getTag(this)){//默认是false
            gotoActivity(LeadActivity.class,1);
            finish();
        }
        setContentView(R.layout.activity_main);
    }
    //恢复默认
    public void  initialize(int textView_index){
        for(int i=0;i<textView.length;i++){
            if (i!=textView_index){
                Drawable img=null;
                switch (i){
                    case 0:
                        img = getResources().getDrawable(R.drawable.b1);
                        break;
                    case 1:
                        img = getResources().getDrawable(R.drawable.b2);
                        break;
                    case 2:
                        img = getResources().getDrawable(R.drawable.b3);
                        break;
                    case 3:
                        img = getResources().getDrawable(R.drawable.b4);
                        break;
                }
                // 调用setCompoundDrawables时，必须调用Drawable.setBounds()方法,否则图片不显示
                img.setBounds(0, 0, img.getMinimumWidth(), img.getMinimumHeight());
                textView[i].setCompoundDrawables(null, img, null, null); //设置上图标
                textView[i].setTextColor(0xff000000);
            }
        }
    }
    //切换效果
    public void choice(int textView_index){
        Drawable img=null;
        switch (textView_index){
            case 0:
                img = getResources().getDrawable(R.drawable.c1);
                break;
            case 1:
                img = getResources().getDrawable(R.drawable.c2);
                break;
            case 2:
                img = getResources().getDrawable(R.drawable.c3);
                break;
            case 3:
                img = getResources().getDrawable(R.drawable.c4);
                break;
        }
        // 调用setCompoundDrawables时，必须调用Drawable.setBounds()方法,否则图片不显示
        img.setBounds(0, 0, img.getMinimumWidth(), img.getMinimumHeight());
        textView[textView_index].setCompoundDrawables(null, img, null, null); //设置上图标
        textView[textView_index].setTextColor(0xff16b13a);

    }

    //判断方法
    public void choiceFragment(int textView_index){
        if(now_count!=textView_index){
            transaction = fragmentManager.beginTransaction();
            if(fragments[textView_index]==null){
                fragments[textView_index] =newFragment(textView_index);
                transaction.add(R.id.main_layout,fragments[textView_index]);
            }else{
                transaction.show(fragments[textView_index]);
            }
            transaction.hide(fragments[now_count]);
            transaction.commit();
            now_count=textView_index;
        }
    }
    public Fragment newFragment(int textView_index){
        switch (textView_index){
            case  0:
                return  new Fragment1();
            case  1:
                return  new Fragment2();
            case  2:
                return  new Fragment3();
            case 3:
                return new Fragment4();
        }
        return  null;
    }
}
