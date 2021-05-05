package com.example.ongk;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemListAdapter extends RecyclerView.Adapter<ItemListAdapter.WordViewHolder> {
    private ArrayList<Clothes> mItemList;
    private LayoutInflater mInflater;
    private Context context;

    @NonNull
    @Override
    public ItemListAdapter.WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemlist_thirdscreen, parent, false);
        ItemListAdapter.WordViewHolder wvh = new ItemListAdapter.WordViewHolder(v);
        return wvh;
    }

    public ItemListAdapter(Context context, ArrayList<Clothes> itemList) {
        mInflater = LayoutInflater.from(context);
        mItemList = itemList;
        this.context = context;
    }

    @Override
    public void onBindViewHolder(ItemListAdapter.WordViewHolder holder, int position) {
        Clothes currentItem = mItemList.get(position);
        holder.imageView.setImageResource(currentItem.getImagehinh());
        holder.tvView1.setText(currentItem.getName());
        holder.tvView2.setText(currentItem.getPrice());
    }

    @Override
    public int getItemCount() {
        return mItemList.size();
    }

    public class WordViewHolder extends RecyclerView.ViewHolder   {

        public ImageView imageView;
        public TextView tvView1;
        public TextView tvView2;
        private ItemListAdapter mAdapter;


        public WordViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imgHinhS3);
            tvView1 = itemView.findViewById(R.id.tvNameS3);
            tvView2 = itemView.findViewById(R.id.tvPriceS3);

        }



    }
}