package com.example.ongk;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.NoCopySpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.LinkedList;

public class WordListAdapter  extends RecyclerView.Adapter<WordListAdapter.WordViewHolder>  {
    private ArrayList<Clothes> mItemList;
    private LayoutInflater mInflater;
    private Context context;

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.wordlist_item,parent,false);
        WordViewHolder wvh=new WordViewHolder(v);
        return wvh;
    }

    public WordListAdapter(Context context,ArrayList<Clothes> itemList) {
        mInflater = LayoutInflater.from(context);
        mItemList=itemList;
        this.context=context;
    }

    @Override
    public void onBindViewHolder(WordViewHolder holder, int position) {
        Clothes currentItem= mItemList.get(position);
        holder.imageView.setImageResource(currentItem.getImagehinh());
        holder.tvView1.setText(currentItem.getName());
        holder.tvView2.setText(currentItem.getPrice());
    }

    @Override
    public int getItemCount() {
        return mItemList.size();
    }

    public class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public ImageView imageView;
        public TextView tvView1;
        public TextView tvView2;
        private WordListAdapter mAdapter;


        public WordViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imghinh);
            tvView1=itemView.findViewById(R.id.tvName);
            tvView2=itemView.findViewById(R.id.tvPrice);
            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {
            int mPosition= getLayoutPosition();
            Clothes element= mItemList.get(mPosition);

            Intent intent= new Intent(context,SecondScreen.class);

            intent.putExtra("nameS2",element.getName());
            intent.putExtra("priceS2",element.getPrice());


            context.startActivity(intent);




        }
    }
}

