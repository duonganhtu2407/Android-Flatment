package com.example.ongk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ThirdScreen extends AppCompatActivity  {
    private ArrayList<Clothes> exampleList = new ArrayList<>();

    private RecyclerView mRecyclerView;
    private ItemListAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ImageView imgadd;
    private ImageView imgminus;
    private TextView txtname;
    private TextView txtprice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_screen);

        String nameh=getIntent().getStringExtra("nameS2");


            exampleList.add(new Clothes(1, "GoogleGreen", "15.5", R.drawable.googlegreen));


            exampleList.add(new Clothes(2, "GoogleBlack", "20.5", R.drawable.googleblack));


            exampleList.add(new Clothes(3, "GoogleBlue", "19.5", R.drawable.googleblue));

            exampleList.add(new Clothes(4, "GoogleCode", "18.5", R.drawable.code));


        mRecyclerView = findViewById(R.id.recycleViewS3);

        mAdapter = new ItemListAdapter(this,exampleList);

        mRecyclerView.setAdapter(mAdapter);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        GridLayoutManager layoutManager = new GridLayoutManager(ThirdScreen.this,1, GridLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(layoutManager);
    }



}