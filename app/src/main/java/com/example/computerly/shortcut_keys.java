package com.example.computerly;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class shortcut_keys extends AppCompatActivity {

    RecyclerView mRecyclerView;
    List<data> myDataList;
    data mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shortcut_keys);

        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(shortcut_keys.this,1);
        mRecyclerView.setLayoutManager(gridLayoutManager);

        myDataList = new ArrayList<>();

        mData = new data("Ctrl + C","Just Select folder/text and press Ctrl+C for copying",R.drawable.copy_image);
        myDataList.add(mData);

        mData = new data("Ctrl + X","just select folder/text and press ctrl+X for cut.",R.drawable.cut_image);
        myDataList.add(mData);

        mData = new data("Ctrl + V","open the destination folder and press Ctrl+V for pasting",R.drawable.paste_image);
        myDataList.add(mData);

        mData = new data("Alt + F4","Quit active application or close current window.",R.drawable.alt_f4_image);
        myDataList.add(mData);

        mData = new data("Window + R","Opens the Run menu.",R.drawable.run_menu_image);
        myDataList.add(mData);

        mData = new data("Window + E","Opens Window Explorer.",R.drawable.explorer_image);
        myDataList.add(mData);

        mData = new data("Alt + Tab","Switch between open programs.",R.drawable.tab_switch_image);
        myDataList.add(mData);

        mData = new data("Windows Key + Up Arrow"," Maximize current window.",R.drawable.maximize_image);
        myDataList.add(mData);

        mData = new data("Ctrl + Shift + Esc","Opens Task Manager.",R.drawable.taskmanager_image);
        myDataList.add(mData);

        mData = new data("Windows Key + Break","Opens System Properties.",R.drawable.systemproperty_image);
        myDataList.add(mData);

        mData = new data("Windows Key + F"," Opens search for files and folders.",R.drawable.search_files_image);
        myDataList.add(mData);

        mData = new data("Windows Key + D","Hide/display the desktop.",R.drawable.hide_desktop_image);
        myDataList.add(mData);

        mData = new data("Ctrl + Esc","Open Start menu.",R.drawable.start_image);
        myDataList.add(mData);



        MyAdapter myAdapter = new MyAdapter(shortcut_keys.this,myDataList);
        mRecyclerView.setAdapter(myAdapter);
    }
}
