package com.example.computerly;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class hardware extends AppCompatActivity {

    RecyclerView mRecyclerView;
    List<data> myDataList;
    data mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hardware);

        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(hardware.this,1);
        mRecyclerView.setLayoutManager(gridLayoutManager);

        myDataList = new ArrayList<>();

        mData = new data("RAM","RAM (Random Access Memory) is the hardware in a computing device where the operating system (OS), application programs and data in current use are kept so they can be quickly reached by the device's processor. RAM is the main memory in a computer, and it is much faster to read from and write to than other kinds of storage, such as a hard disk drive (HDD), solid-state drive (SSD) or optical drive.",R.drawable.image1);
        myDataList.add(mData);

        mData = new data("Hard Disk","A hard disk is part of a unit -- often called a disk drive, hard drive or hard disk drive -- that stores and provides relatively quick access to large amounts of data on an electromagnetically charged surface or set of surfaces. Today's computers typically come with a hard disk that can contain anywhere from billions to trillions of bytes of storage.",R.drawable.image2);
        myDataList.add(mData);

        mData = new data("Processor","A processor is the logic circuitry that responds to and processes the basic instructions that drive a computer. The four primary functions of a processor are fetch, decode, execute and writeback.",R.drawable.image3);
        myDataList.add(mData);

        mData = new data("DVD Drive","In computing, an optical disc drive (ODD) is a disc drive that uses laser light or electromagnetic waves within or near the visible light spectrum as part of the process of reading or writing data to or from optical discs.",R.drawable.image4);
        myDataList.add(mData);

        MyAdapter myAdapter = new MyAdapter(hardware.this,myDataList);
        mRecyclerView.setAdapter(myAdapter);

    }
}
