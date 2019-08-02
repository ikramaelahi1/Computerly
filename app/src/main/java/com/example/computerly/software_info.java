package com.example.computerly;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class software_info extends AppCompatActivity {

    RecyclerView mRecyclerView;
    List<data> myDataList;
    data mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_software_info);

        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(software_info.this,1);
        mRecyclerView.setLayoutManager(gridLayoutManager);

        myDataList = new ArrayList<>();

        mData = new data("Microsoft Office","MS-OFFICE is Essential software for presenting and preparing your presentations, Its use is world wide, it also helps you to create and save your data in MS-ACCESS, MS-EXCEL provides you to solve your calculations easily",R.drawable.office_image);
        myDataList.add(mData);

        mData = new data("Driverpack Solution","Driverpack Solution helps you by providing you the drivers which are important for your system e.g WIFI,BlueTooth,wireless connections etc. Try to download online because it provides you latest drivers",R.drawable.driver_image);
        myDataList.add(mData);

        mData = new data("Internet Download Manager","Internet Download Manager Manages your downloads and provides better choices for managing your downloaded files, It has resume capability as well as limiting your downloading speed",R.drawable.idm_image);
        myDataList.add(mData);

        mData = new data("Winrar","WinRar helps you to extract your downloaded zip files and gives you access to extract anywhere you want, It also gives you compressing option to larger files so you will easily compress and email entire folders",R.drawable.winrar_image);
        myDataList.add(mData);

        mData = new data("Firefox Browser","Browsing is common nowadays so firefox is faster and safe for any browsing experience as well as support all html contents",R.drawable.firefox_image);
        myDataList.add(mData);

        mData = new data("Antivirus","Antivirus is most essential part of your system because it protects you from harmfull softwares and malware attacks on your system",R.drawable.antivirus_image);
        myDataList.add(mData);

        MyAdapter myAdapter = new MyAdapter(software_info.this,myDataList);
        mRecyclerView.setAdapter(myAdapter);
    }
}
