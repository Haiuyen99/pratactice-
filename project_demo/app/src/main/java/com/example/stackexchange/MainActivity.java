package com.example.stackexchange;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
         RelativeLayout rl_1 ,rl_2;
         Handler handler= new Handler();
         Runnable runnable = new Runnable() {
             @Override
             public void run() {
              rl_1.setVisibility(View.VISIBLE);
              rl_2.setVisibility(View.VISIBLE);
             }
         };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rl_1 = (RelativeLayout) findViewById(R.id.rl_1);
        rl_2 = (RelativeLayout) findViewById(R.id.rl_2);
        handler.postDelayed(runnable,2000 );

        findViewById(R.id.activity_tsingup).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),SingupActivity.class));
            }
        });

    }
}