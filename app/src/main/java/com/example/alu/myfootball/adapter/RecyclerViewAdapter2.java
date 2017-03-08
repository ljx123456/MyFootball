package com.example.alu.myfootball.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.alu.myfootball.R;
import com.example.alu.myfootball.bean.DuiZhanBean;
import com.example.alu.myfootball.bean.DuiZhanBean.ResultBean.ListBean;
import com.example.alu.myfootball.bean.ItemBean.ResultBean.ViewsBean.Saicheng1Bean;
import com.squareup.picasso.Picasso;


import java.util.ArrayList;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;



/**
 * Created by alu on 2017/3/1.
 */

public class RecyclerViewAdapter2 extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<Saicheng1Bean> list;
    private Context context;
    private Retrofit retrofit;
    private static String url1,url2;
    private List<ListBean> list1;
    public RecyclerViewAdapter2(Context context){
        this.context=context;
        this.list=new ArrayList<>();
    }
    //添加数据
    public void addList( List<Saicheng1Bean> list){
        if(this.list.containsAll(list)){
            return;
        }
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    //更新数据
    public void updateList( List<Saicheng1Bean> list){
        this.list=list;
        notifyDataSetChanged();
    }


    @Override
    public  RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//      LayoutInflater.from(mContext).inflate(R.layout.item_layout, parent, false);
        View  view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item2,parent, false);
        RecyclerView.ViewHolder    holder=new MyViewHolder(view);


        return holder;
    }



    @Override
    public void onBindViewHolder( RecyclerView.ViewHolder holder, int position) {
        MyViewHolder holder1= (MyViewHolder) holder;
        holder1.tv_day.setText(list.get(position).getC2());
        holder1.tv_time.setText(list.get(position).getC3());
        holder1.tv_state.setText(list.get(position).getC1());
        holder1.tv_team1.setText(list.get(position).getC4T1());
        holder1.tv_team2.setText(list.get(position).getC4T2());
        holder1.tv_fen.setText(list.get(position).getC4R());
//        Log.e("msg1",list.get(position).getC4T1());
//        Log.e("msg2",list.get(position).getC4T2());
        getHttp1(list.get(position).getC4T1(),list.get(position).getC4T2(),holder1.iv_team1,holder1.iv_team2);
//        Log.e("url1",url1);
//        Log.e("url2",url2);
//
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void getHttp1(final String team1, String team2,final ImageView iv1,final ImageView iv2){
        //http://op.juhe.cn/onebox/football/combat?key=APPKEY&hteam=%E7%9A%87%E9%A9%AC&vteam=%E9%98%BF%E5%B0%94%E6%A2%85%E9%87%8C%E4%BA%9A
        String url = "http://op.juhe.cn/onebox/football/";
        //初始化Retrofit对象
        retrofit=new Retrofit.Builder().baseUrl("http://op.juhe.cn/onebox/football/").addConverterFactory(GsonConverterFactory.create()).build();
        //准备请求网络
        FootBallService footBallService= retrofit.create(FootBallService.class);
        //回调获得结果
        Call<DuiZhanBean> call=footBallService.getBean("dbd4cca3768990246f9910e97198737e",team1,team2);
        //请求加入调度
        call.enqueue(new Callback<DuiZhanBean>() {

            @Override
            public void onResponse(Call<DuiZhanBean> call, Response<DuiZhanBean> response) {
                if(response.isSuccessful()) {
                    if(response.body().getReason().equals("查询成功")){
                            list1= response.body().getResult().getList();
                            Log.e("list",list1+"");
                        for(ListBean listBean:list1){
                            if(listBean.getTeam1().equals(team1)){
                             url1=listBean.getTeam1icon();
                             url2=listBean.getTeam2icon();
                                Picasso.with(context).load(url1).error(R.drawable.ball).resize(50,50).into(iv1);
                                Picasso.with(context).load(url2).error(R.drawable.ball).resize(50,50).into(iv2);
//                                Log.e("msg1",url1);
//                                Log.e("msg2",url2);
                            return;
                            }
                        }
                    }
                }
                else  {
                    Log.e("Response errorBody", response.errorBody().toString());
                }

            }

            @Override
            public void onFailure(Call<DuiZhanBean> call, Throwable t) {

            }
        });
    }
    public interface FootBallService{
        @GET("combat")
        Call<DuiZhanBean> getBean(@Query("key") String key, @Query("hteam") String hteam,@Query("vteam") String vteam);
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tv_day,tv_time,tv_state,tv_team1,tv_team2,tv_fen;
        ImageView iv_team1,iv_team2;
        public MyViewHolder(View itemView) {
            super(itemView);
            tv_day= (TextView) itemView.findViewById(R.id.tv_day);
            tv_time= (TextView) itemView.findViewById(R.id.tv_time);
            tv_state= (TextView) itemView.findViewById(R.id.tv_state);
            tv_team1= (TextView) itemView.findViewById(R.id.tv_team1);
            tv_team2= (TextView) itemView.findViewById(R.id.tv_team2);
            tv_fen= (TextView) itemView.findViewById(R.id.tv_fen);
            iv_team1= (ImageView) itemView.findViewById(R.id.iv_team1);
            iv_team2= (ImageView) itemView.findViewById(R.id.iv_team2);
        }
    }


}
