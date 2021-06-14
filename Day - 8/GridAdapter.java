package com.akashtechnolabs.manthan.mydemoapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter  extends BaseAdapter {
    Context context;
    int [] image;
    String [] name;
    LayoutInflater inflater;
    public GridAdapter (Context context,int[] image,String[] name)
    {
        this.context = context;
        this.image =   image;
        this.name = name;
        inflater     = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return image.length;
    }
    @Override
    public Object getItem(int position) {
        return null;
    }
    @Override
    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.row_gridview,null);
        ImageView iv1 = convertView.findViewById(R.id.iv1);
        TextView tv1 = convertView.findViewById(R.id.tv1);
        iv1.setImageResource(image[position]);
        tv1.setText(name[position]);
        return convertView;
    }
}




