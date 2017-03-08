package com.example.alu.myfootball.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.example.alu.myfootball.R;

import java.util.ArrayList;
import java.util.List;
import com.example.alu.myfootball.bean.ItemBean.ResultBean.ViewsBean.SheshoubangBean;

/**
 * Created by alu on 2017/3/1.
 */

public class ListViewAdapter extends BaseAdapter {
    private Context context;
    private List<SheshoubangBean> list;
    public ListViewAdapter(Context context) {
        this.context=context;
        list=new ArrayList<>();

    }
    //添加数据
    public void addList(List<SheshoubangBean> list){
        if (this.list.containsAll(list)){
            return;
        }
        this.list.addAll(list);
        notifyDataSetChanged();
    }
    //更新数据
    public void updateList(List<SheshoubangBean> list){
        this.list=list;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    class ViewHolder{
        TextView tv1,tv2;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView==null){
            viewHolder=new ViewHolder();
            convertView= LayoutInflater.from(context).inflate(R.layout.item3_1,null);
            viewHolder.tv1= (TextView) convertView.findViewById(R.id.tv_title);
            viewHolder.tv2= (TextView) convertView.findViewById(R.id.tv_content);
            convertView.setTag(viewHolder);
        }else {
            viewHolder= (ViewHolder) convertView.getTag();
        }
        viewHolder.tv1.setText(list.get(position).getC1());
        viewHolder.tv2.setText(list.get(position).getC2());
        return convertView;
    }
}
