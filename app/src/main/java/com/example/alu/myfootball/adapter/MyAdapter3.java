package com.example.alu.myfootball.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alu.myfootball.R;
import com.example.alu.myfootball.bean.NewsUser1.ResultBean.DataBean;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alu on 2017/3/2.
 */

public class MyAdapter3 extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private List<DataBean> list;
    private Context context;
    public MyAdapter3(Context context){
        this.list=new ArrayList<>();
        this.context=context;
    }
    //添加数据
    public void addList( List<DataBean> list){
        if(this.list.containsAll(list)){
            return;
        }
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    //更新数据
    public void updateList( List<DataBean> list){
        this.list=list;
        notifyDataSetChanged();
    }
    @Override
    public  RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        RecyclerView.ViewHolder holder=null;
        if(viewType==1){
            view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item1_1,parent,false);
            holder=new MyViewHolder(view);
        }else if(viewType==3){
            view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item1_2,parent,false);
            holder=new MyViewHolder2(view);
        }else {
            view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item1_3,parent,false);
            holder=new MyViewHolder3(view);
        }
        return holder;
    }

    //复写类型设置方法
    @Override
    public int getItemViewType(int position) {
        int i=1;
//        Log.e("msg",list.get(position).getThumbnail_pic_s02()+"    "+list.get(position).getThumbnail_pic_s03());
        if(list.get(position).getThumbnail_pic_s02()!=null){
            i++;
        }
        if(list.get(position).getThumbnail_pic_s03()!=null){
            i++;
        }
        return i;
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {

        if(holder instanceof MyViewHolder ) {
            MyViewHolder holder1= (MyViewHolder) holder;
            holder1.t1.setText(list.get(position).getTitle());
            holder1.t2.setText(list.get(position).getAuthor_name());
            holder1.t3.setText(list.get(position).getDate());
            Picasso.with(context).load(list.get(position).getThumbnail_pic_s())
                    .into(holder1.imageView);
            holder1.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listener!=null){
                        listener.onItemClick(v,position,list.get(position).getUrl(),list.get(position).getTitle());
                    }
                }
            });
        }else if(holder instanceof MyViewHolder2){
            MyViewHolder2 holder2= (MyViewHolder2) holder;
            holder2.t1.setText(list.get(position).getTitle());
            holder2.t2.setText(list.get(position).getAuthor_name());
            holder2.t3.setText(list.get(position).getDate());
            Picasso.with(context).load(list.get(position).getThumbnail_pic_s())
                    .into(holder2.imageView1);
            Picasso.with(context).load(list.get(position).getThumbnail_pic_s02())
                    .into(holder2.imageView2);
            Picasso.with(context).load(list.get(position).getThumbnail_pic_s03())
                    .into(holder2.imageView3);
            holder2.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listener!=null){
                        listener.onItemClick(v,position,list.get(position).getUrl(),list.get(position).getTitle());
                    }
                }
            });
        }else {
            MyViewHolder3 holder3= (MyViewHolder3) holder;
            holder3.t1.setText(list.get(position).getTitle());
            holder3.t2.setText(list.get(position).getAuthor_name());
            holder3.t3.setText(list.get(position).getDate());
            Picasso.with(context).load(list.get(position).getThumbnail_pic_s())
                    .into(holder3.imageView1);
            Picasso.with(context).load(list.get(position).getThumbnail_pic_s02())
                    .into(holder3.imageView2);
            holder3.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listener!=null){
                        listener.onItemClick(v,position,list.get(position).getUrl(),list.get(position).getTitle());
                    }
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView t1,t2,t3;
        ImageView imageView;
        CardView cardView;
        public MyViewHolder(View itemView) {
            super(itemView);
            t1= (TextView) itemView.findViewById(R.id.item1_1_tv1);
            t2= (TextView) itemView.findViewById(R.id.item1_1_tv2);
            t3= (TextView) itemView.findViewById(R.id.item1_1_tv3);
            imageView= (ImageView) itemView.findViewById(R.id.item1_1_im1);
            cardView= (CardView) itemView.findViewById(R.id.card1);
        }
    }
    class MyViewHolder2 extends RecyclerView.ViewHolder{
        TextView t1,t2,t3;
        ImageView imageView1,imageView2,imageView3;
        CardView cardView;
        public MyViewHolder2(View itemView) {
            super(itemView);
            t1= (TextView) itemView.findViewById(R.id.item1_2_tv1);
            t2= (TextView) itemView.findViewById(R.id.item1_2_tv2);
            t3= (TextView) itemView.findViewById(R.id.item1_2_tv3);
            imageView1= (ImageView) itemView.findViewById(R.id.item1_2_im1);
            imageView2= (ImageView) itemView.findViewById(R.id.item1_2_im2);
            imageView3= (ImageView) itemView.findViewById(R.id.item1_2_im3);
            cardView= (CardView) itemView.findViewById(R.id.card2);
        }
    }
    class MyViewHolder3 extends RecyclerView.ViewHolder{
        TextView t1,t2,t3;
        ImageView imageView1,imageView2;
        CardView cardView;
        public MyViewHolder3(View itemView) {
            super(itemView);
            t1= (TextView) itemView.findViewById(R.id.item1_3_tv1);
            t2= (TextView) itemView.findViewById(R.id.item1_3_tv2);
            t3= (TextView) itemView.findViewById(R.id.item1_3_tv3);
            imageView1= (ImageView) itemView.findViewById(R.id.item1_3_im1);
            imageView2= (ImageView) itemView.findViewById(R.id.item1_3_im2);
            cardView= (CardView) itemView.findViewById(R.id.card3);
        }
    }

    //注册接口的方法
    private OnItemClickListener listener;
    public void setOnItemClickListener(OnItemClickListener listener){
        this.listener=listener;
    }
    //接口
    public interface OnItemClickListener{
        void onItemClick(View view,int position,String url,String title);
    }
}
