package com.example.ongk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.provider.UserDictionary;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    //    private LinkedList<String> mWordList = new LinkedList<>();
    private ArrayList<Clothes> exampleList = new ArrayList<>();

    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        exampleList.add(new Clothes(1, "GoogleGreen", "15.5", R.drawable.googlegreen));
        exampleList.add(new Clothes(2, "GoogleBlack", "20.5", R.drawable.googleblack));
        exampleList.add(new Clothes(3, "GoogleBlue", "19.5", R.drawable.googleblue));
        exampleList.add(new Clothes(4, "GoogleCode", "18.5", R.drawable.code));
        exampleList.add(new Clothes(5, "GoogleGreen", "15.5", R.drawable.googlegreen));
        exampleList.add(new Clothes(6, "GoogleBlack", "20.5", R.drawable.googleblack));
        exampleList.add(new Clothes(7, "GoogleBlue", "19.5", R.drawable.googleblue));
        exampleList.add(new Clothes(8, "GoogleCode", "18.5", R.drawable.code));
        exampleList.add(new Clothes(9, "GoogleGreen", "15.5", R.drawable.googlegreen));
        exampleList.add(new Clothes(10, "GoogleBlack", "20.5", R.drawable.googleblack));
        exampleList.add(new Clothes(11, "GoogleBlue", "19.5", R.drawable.googleblue));
        exampleList.add(new Clothes(12, "GoogleCode", "18.5", R.drawable.code));
        // Get a handle to the RecyclerView.
        mRecyclerView = findViewById(R.id.recyclerview);

        mAdapter = new WordListAdapter(this,exampleList);
 
        mRecyclerView.setAdapter(mAdapter);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        GridLayoutManager layoutManager = new GridLayoutManager(MainActivity.this, 2, GridLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(layoutManager);
    }
}