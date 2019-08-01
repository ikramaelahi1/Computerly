package com.example.computerly;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class detailActivity extends AppCompatActivity {

    private TextView itemDescription;
    private ImageView itemImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        itemDescription = (TextView)findViewById(R.id.txtDescription);
        itemImage = (ImageView)findViewById(R.id.ivImage2);

        Bundle mBundle = getIntent().getExtras();

        if(mBundle!=null){

            itemDescription.setText(mBundle.getString("Description"));
            itemImage.setImageResource(mBundle.getInt("Image"));

        }

    }
}
