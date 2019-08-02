package com.example.computerly;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class window_installation extends AppCompatActivity {

    RecyclerView mRecyclerView;
    List<data> myDataList;
    data mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_window_installation);

        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(window_installation.this,1);
        mRecyclerView.setLayoutManager(gridLayoutManager);

        myDataList = new ArrayList<>();



        MyAdapter myAdapter = new MyAdapter(window_installation.this,myDataList);
        mRecyclerView.setAdapter(myAdapter);
    }
}
