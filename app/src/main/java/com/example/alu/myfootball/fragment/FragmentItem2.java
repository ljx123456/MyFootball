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
import android.widget.Toast;

import com.example.alu.myfootball.R;
import com.example.alu.myfootball.adapter.RecyclerViewAdapter2;
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

public class FragmentItem2 extends Fragment {
//    private ListView listView;
    private Retrofit retrofit;
    private String name;
//    private ListViewAdapter listViewAdapter;
    private SwipeRefreshLayout refreshLayout;
    private RecyclerViewAdapter2 recyclerViewAdapter;
    private RecyclerView recyclerView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.layout_fragmentitem,null);
        name=getArguments().getString("name");
//        listView= (ListView) view.findViewById(R.id.listView);
        recyclerView= (RecyclerView) view.findViewById(R.id.recyclerview);
        recyclerViewAdapter=new RecyclerViewAdapter2(getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(recyclerViewAdapter);
//        listViewAdapter=new ListViewAdapter(getContext());
//        listView.setAdapter(listViewAdapter);
        refreshLayout= (SwipeRefreshLayout) view.findViewById(R.id.refreshlayout);
        refreshLayout.setColorSchemeResources(R.color.colorAccent,R.color.colorPrimary);
        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                refreshLayout.setRefreshing(true);
                getHttp(name,true);
            }
        });
        getHttp(name,false);
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
                    recyclerViewAdapter.updateList(response.body().getResult().getViews().getSaicheng1());
                    refreshLayout.setRefreshing(false);
                    Toast.makeText(getContext(),"完成刷新",Toast.LENGTH_SHORT).show();
                }else {
                    recyclerViewAdapter.addList(response.body().getResult().getViews().getSaicheng1());
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

