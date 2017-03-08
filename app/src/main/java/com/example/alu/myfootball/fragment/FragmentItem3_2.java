package com.example.alu.myfootball.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.alu.myfootball.R;
import com.example.alu.myfootball.adapter.RecyclerViewAdapter3_1;
import com.example.alu.myfootball.adapter.RecyclerViewAdapter3_2;
import com.example.alu.myfootball.bean.ItemBean;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;


/**
 * Created by alu on 2017/2/28.
 */

public class FragmentItem3_2 extends Fragment {
//    private ListView listView;
    private Retrofit retrofit;
    private String name;
//    private ListViewAdapter listViewAdapter;
    private SwipeRefreshLayout refreshLayout1,refreshLayout2;
    private RecyclerViewAdapter3_2 recyclerViewAdapter2;
    private RecyclerViewAdapter3_1 recyclerViewAdapter1;
    private RecyclerView recyclerView1,recyclerView2;
    private LinearLayout linearLayout1,linearLayout2;
    private Button btn1,btn2;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.layout_fragmentitem3,null);
        name=getArguments().getString("name");
//        listView= (ListView) view.findViewById(R.id.listView);
        recyclerView1= (RecyclerView) view.findViewById(R.id.recyclerview3);
        recyclerView2= (RecyclerView) view.findViewById(R.id.recyclerview4);
        recyclerViewAdapter1=new RecyclerViewAdapter3_1();
        recyclerViewAdapter2=new RecyclerViewAdapter3_2();
        recyclerView1.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
        linearLayout1= (LinearLayout) view.findViewById(R.id.linearLayout1);
        linearLayout2= (LinearLayout) view.findViewById(R.id.linearLayout2);
        btn1= (Button) view.findViewById(R.id.button1);
        btn2= (Button) view.findViewById(R.id.button2);
        recyclerView1.setAdapter(recyclerViewAdapter1);
        recyclerView2.setAdapter(recyclerViewAdapter2);
//        listViewAdapter=new ListViewAdapter(getContext());
//        listView.setAdapter(listViewAdapter);
        refreshLayout1= (SwipeRefreshLayout) view.findViewById(R.id.refreshlayout3);
        refreshLayout2= (SwipeRefreshLayout) view.findViewById(R.id.refreshlayout3);
        refreshLayout1.setColorSchemeResources(R.color.colorAccent,R.color.colorPrimary);
        refreshLayout2.setColorSchemeResources(R.color.colorAccent,R.color.colorPrimary);
        refreshLayout1.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                refreshLayout1.setRefreshing(true);
                getHttp(name,true);
            }
        });
        refreshLayout2.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                refreshLayout2.setRefreshing(true);
                getHttp(name,true);
            }
        });
        getHttp(name,false);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn1.setBackgroundColor(0xff0ce831);
                btn2.setBackgroundColor(0xffdddddd);
                linearLayout1.setVisibility(View.VISIBLE);
                linearLayout2.setVisibility(View.INVISIBLE);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn2.setBackgroundColor(0xff0ce831);
                btn1.setBackgroundColor(0xffdddddd);
                linearLayout2.setVisibility(View.VISIBLE);
                linearLayout1.setVisibility(View.INVISIBLE);

            }
        });

        return view;
    }
    public void getHttp(String name, final boolean isupdate){
        String url = "http://op.juhe.cn/onebox/football/";
        //初始化Retrofit对象
        retrofit=new Retrofit.Builder().baseUrl("http://op.juhe.cn/onebox/football/").addConverterFactory(GsonConverterFactory.create()).build();
        //准备请求网络
        FootBallService footBallService= retrofit.create(FootBallService.class);
        //回调获得结果
        Call<ItemBean> call=footBallService.getBean("dbd4cca3768990246f9910e97198737e",name);
        //请求加入调度
        call.enqueue(new Callback<ItemBean>() {

            @Override
            public void onResponse(Call<ItemBean> call, Response<ItemBean> response) {
                if(isupdate){
                    recyclerViewAdapter1.updateList(response.body().getResult().getViews().getJifenbang());
                    recyclerViewAdapter2.updateList(response.body().getResult().getViews().getSheshoubang());
                    refreshLayout1.setRefreshing(false);
                    refreshLayout2.setRefreshing(false);
                    Toast.makeText(getContext(),"完成刷新",Toast.LENGTH_SHORT).show();
                }else {
                    recyclerViewAdapter1.addList(response.body().getResult().getViews().getJifenbang());
                    recyclerViewAdapter2.addList(response.body().getResult().getViews().getSheshoubang());
                }

            }

            @Override
            public void onFailure(Call<ItemBean> call, Throwable t) {

            }
        });

    }
    public interface FootBallService{
        @GET("league")
        Call<ItemBean> getBean(@Query("key") String key, @Query("league") String leagus);
    }

}

