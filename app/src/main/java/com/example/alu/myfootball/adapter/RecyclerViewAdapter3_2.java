package com.example.alu.myfootball.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.alu.myfootball.R;
import com.example.alu.myfootball.bean.ItemBean.ResultBean.ViewsBean.SheshoubangBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alu on 2017/3/1.
 */

public class RecyclerViewAdapter3_2 extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<SheshoubangBean> list;
    public RecyclerViewAdapter3_2(){
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
            view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item3_2,parent, false);
            holder=new MyViewHolder(view);

        return holder;
    }


    @Override
    public void onBindViewHolder( RecyclerView.ViewHolder holder, int position) {
        ///*** c1 : 1* c2 : 梅西* c3 : 巴塞罗那* c4 : 20* c5 : 3
        MyViewHolder holder1= (MyViewHolder) holder;
        holder1.tv_pai2.setText(list.get(position).getC1());
        holder1.tv_qiu.setText(list.get(position).getC2());
        holder1.tv_zhan.setText(list.get(position).getC3());
        holder1.tv_jq.setText(list.get(position).getC4());
        holder1.tv_dq.setText(list.get(position).getC5());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tv_pai2,tv_qiu,tv_zhan,tv_jq,tv_dq;
        public MyViewHolder(View itemView) {
            super(itemView);
            tv_pai2= (TextView) itemView.findViewById(R.id.tv_pai2);
            tv_qiu= (TextView) itemView.findViewById(R.id.tv_qiu);
            tv_zhan= (TextView) itemView.findViewById(R.id.tv_zhan2);
            tv_jq= (TextView) itemView.findViewById(R.id.tv_jq);
            tv_dq= (TextView) itemView.findViewById(R.id.tv_dq);
        }
    }
}
