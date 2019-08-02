package com.example.computerly;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class advice extends AppCompatActivity {

    RecyclerView mRecyclerView;
    List<data> myDataList;
    data mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advice);

        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(advice.this,1);
        mRecyclerView.setLayoutManager(gridLayoutManager);

        myDataList = new ArrayList<>();



        MyAdapter myAdapter = new MyAdapter(advice.this,myDataList);
        mRecyclerView.setAdapter(myAdapter);
    }
}
