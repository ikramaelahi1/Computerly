package com.example.computerly;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

private Button ram,soft,shortcut,learn,window,error,speedup,io,advice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ram = (Button)findViewById(R.id.ram_btn);
        soft = (Button)   findViewById(R.id.software_btn);
        shortcut = (Button)findViewById(R.id.shortcut_btn);
        learn = (Button)findViewById(R.id.learn_btn);
        window = (Button)findViewById(R.id.window_btn);
        error = (Button)findViewById(R.id.error_btn);
        speedup = (Button)findViewById(R.id.speedup_btn);
        io = (Button)findViewById(R.id.input_output_btn);
        advice = (Button)findViewById(R.id.advice_btn);

        ram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,hardware.class);
                startActivity(intent);
            }
        });
        soft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,software_info.class);
                startActivity(intent);
            }
        });

    }
}
