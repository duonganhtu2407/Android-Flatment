package com.example.ongk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ClothesAdapter extends BaseAdapter {

    Context ctx;
    int layoutItem;
    ArrayList<Clothes> arrayList;
    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view= LayoutInflater.from(ctx).inflate(layoutItem,viewGroup,false);
        TextView tvName=view.findViewById(R.id.tvName);
        TextView tvPrice=view.findViewById(R.id.tvPrice);
        ImageView imghinh= view.findViewById(R.id.imghinh);
        tvName.setText(arrayList.get(i).getName());
        tvPrice.setText(""+arrayList.get(i).getPrice());
        imghinh.setImageResource(arrayList.get(i).getImagehinh());
        return view;
    }
}
