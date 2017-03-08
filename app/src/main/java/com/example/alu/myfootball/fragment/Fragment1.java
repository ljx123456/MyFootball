package com.example.alu.myfootball.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.alu.myfootball.R;
import com.example.alu.myfootball.activity.InternetActivity;
import com.example.alu.myfootball.activity.MainActivity;
import com.example.alu.myfootball.adapter.MyAdapter3;
import com.example.alu.myfootball.bean.NewsUser1;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by alu on 2017/2/27.
 */

public class Fragment1 extends Fragment{
    private SwipeRefreshLayout refreshLayout;
    private RecyclerView recyclerView;
    private MyAdapter3 myAdapter3;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.layout_myfragment3_son,null);
        recyclerView= (RecyclerView) view.findViewById(R.id.fragment3son_recyclerview);
        refreshLayout= (SwipeRefreshLayout) view.findViewById(R.id.frament3son_refreshlayout);

        myAdapter3=new MyAdapter3(getContext());
        recyclerView.setAdapter(myAdapter3);
        refreshLayout.setColorSchemeResources(R.color.colorPrimary);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        getHttp(false);
        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                refreshLayout.setRefreshing(true);

                getHttp(true);
            }
        });
        myAdapter3.setOnItemClickListener(new MyAdapter3.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position, String url,String title) {
                Intent intent=new Intent(getContext(), InternetActivity.class);
                intent.putExtra("url",url);
                intent.putExtra("title",title);
                startActivity(intent);
            }
        });
        return view;
    }
    public void getHttp(final boolean isupat){
        //1.初始化Retrofit
        //网址、解析工具（gosn等）
        //http://v.juhe.cn/toutiao/index?type=top&key=8b41621da64fb5a7db660117a62cfa36
        final Retrofit retrofit = new Retrofit.Builder().
                baseUrl("http://v.juhe.cn/toutiao/").
                addConverterFactory(GsonConverterFactory.create())
                .build();
        //3.准备请求网络
        setWeatherService service=retrofit.create(setWeatherService.class);
        //4.通过回调获得结果
        Call<NewsUser1> call=service.getBean("tiyu","8b41621da64fb5a7db660117a62cfa36");
        //5.请求加入调度，正式排队去网络获取数据
        call.enqueue(new Callback<NewsUser1>() {

            @Override
            public void onResponse(Call<NewsUser1> call, Response<NewsUser1> response) {
                Log.e("aa","加载成功"+response.body().getResult().getData().toString());
                if(isupat){
                    myAdapter3.updateList(response.body().getResult().getData());
                    refreshLayout.setRefreshing(false);
                }else{
                    myAdapter3.addList(response.body().getResult().getData());
                }
            }
            @Override
            public void onFailure(Call<NewsUser1> call, Throwable t) {
                Log.e("aa","加载失败");
                refreshLayout.setRefreshing(false);
            }
        });
    }
    //定义接口
    public interface setWeatherService{
        @GET("index")
        Call<NewsUser1> getBean(@Query("type") String type, @Query("key") String key);
    }

}
