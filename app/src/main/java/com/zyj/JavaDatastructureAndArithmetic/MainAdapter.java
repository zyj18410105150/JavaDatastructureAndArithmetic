package com.zyj.JavaDatastructureAndArithmetic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2017-10-25.
 */

public class MainAdapter extends BaseAdapter {
    String [] data;
    Context context;

    public MainAdapter(String [] data,Context context){
        this.data=data;
        this.context=context;
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int i) {
        return data[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view==null){
            holder=new ViewHolder();
            view= LayoutInflater.from(context).inflate(R.layout.item_main,null);
            holder.tv_item=(TextView) view.findViewById(R.id.tv_item);
            view.setTag(holder);
        }else{
            holder= (ViewHolder) view.getTag();
        }
        holder.tv_item.setText(data[i]);
        return view;
    }

    class ViewHolder {
        TextView tv_item;
    }
}
