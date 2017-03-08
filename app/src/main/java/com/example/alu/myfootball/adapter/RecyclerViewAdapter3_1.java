package com.example.alu.myfootball.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.alu.myfootball.R;

import com.example.alu.myfootball.bean.ItemBean.ResultBean.ViewsBean.JifenbangBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alu on 2017/3/1.
 */

public class RecyclerViewAdapter3_1 extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<JifenbangBean> list;
    public RecyclerViewAdapter3_1(){
        this.list=new ArrayList<>();
    }
    //添加数据
    public void addList( List<JifenbangBean> list){
        if(this.list.containsAll(list)){
            return;
        }
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    //更新数据
    public void updateList( List<JifenbangBean> list){
        this.list=list;
        notifyDataSetChanged();
    }


    @Override
    public  RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        RecyclerView.ViewHolder holder=null;
//        LayoutInflater.from(mContext).inflate(R.layout.item_layout, parent, false);
            view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item3_1,parent, false);
            holder=new MyViewHolder(view);
        return holder;
    }


    @Override
    public void onBindViewHolder( RecyclerView.ViewHolder holder, int position) {
        // c3 : 23* c41 : 17* c42 : 4* c43 : 2* c5 : 38* c6 : 55
        MyViewHolder holder1= (MyViewHolder) holder;
        holder1.tv_pai1.setText(list.get(position).getC1());
        holder1.tv_zhan1.setText(list.get(position).getC2());
        holder1.tv_chang.setText(list.get(position).getC3());
        holder1.tv_spf.setText(list.get(position).getC41()+"-"+list.get(position).getC42()+"-"+list.get(position).getC43());
        holder1.tv_jsq.setText(list.get(position).getC5());
        holder1.tv_jf.setText(list.get(position).getC6());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tv_pai1,tv_zhan1,tv_chang,tv_spf,tv_jsq,tv_jf;
        public MyViewHolder(View itemView) {
            super(itemView);
            tv_pai1= (TextView) itemView.findViewById(R.id.tv_pai1);
            tv_zhan1= (TextView) itemView.findViewById(R.id.tv_zhan1);
            tv_chang= (TextView) itemView.findViewById(R.id.tv_chang);
            tv_spf= (TextView) itemView.findViewById(R.id.tv_sheng);
            tv_jsq= (TextView) itemView.findViewById(R.id.tv_jsq);
            tv_jf= (TextView) itemView.findViewById(R.id.tv_jf);
        }
    }

}
