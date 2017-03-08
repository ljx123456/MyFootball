package com.example.alu.myfootball.adapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

import com.example.alu.myfootball.R;
import  com.example.alu.myfootball.bean.ItemBean.ResultBean.ViewsBean.SheshoubangBean;

/**
 * Created by alu on 2017/3/1.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<SheshoubangBean> list;
    public RecyclerViewAdapter(){
        this.list=new ArrayList<>();
    }
    //添加数据
    public void addList( List<SheshoubangBean> list){
        if(this.list.containsAll(list)){
            return;
        }
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    //更新数据
    public void updateList( List<SheshoubangBean> list){
        this.list=list;
        notifyDataSetChanged();
    }


    @Override
    public  RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        RecyclerView.ViewHolder holder=null;
//        LayoutInflater.from(mContext).inflate(R.layout.item_layout, parent, false);
        if(viewType==1){
            view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item3_1,parent, false);
            holder=new MyViewHolder(view);
        }else if(viewType==2){
            view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item2,parent, false);
            holder=new MyViewHolder(view);
        }else{
            view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item3,parent, false);
            holder=new MyViewHolder3(view);
        }

        return holder;
    }

    //复写类型设置方法
    @Override
    public int getItemViewType(int position) {
        if(position%3==0){
            return 1;
        }else if(position%3==1){
            return 2;
        }else{
            return 3;
        }
    }

    @Override
    public void onBindViewHolder( RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof MyViewHolder ) {
            MyViewHolder holder1= (MyViewHolder) holder;
            holder1.tv_title.setText(list.get(position).getC1());
            holder1.tv_content.setText(list.get(position).getC2());
        }else{
            MyViewHolder3 holder3= (MyViewHolder3) holder;
            holder3.tv_title.setText(list.get(position).getC3());
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tv_title,tv_content;
        public MyViewHolder(View itemView) {
            super(itemView);
            tv_title= (TextView) itemView.findViewById(R.id.tv_title);
            tv_content= (TextView) itemView.findViewById(R.id.tv_content);
        }
    }
    class MyViewHolder3 extends RecyclerView.ViewHolder{
        TextView tv_title;
        public MyViewHolder3(View itemView) {
            super(itemView);
            tv_title= (TextView) itemView.findViewById(R.id.tv_title);
        }
    }
}
