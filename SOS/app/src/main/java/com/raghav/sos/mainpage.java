package com.raghav.sos;

import android.content.Intent;
import android.os.Bundle;
import android.os.Process;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class mainpage extends AppCompatActivity {

    ImageView redbutton,emergency;
    Button stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);

        getSupportActionBar().hide();

        redbutton = findViewById(R.id.redbutton);
        stop = findViewById(R.id.stop);
        emergency=findViewById(R.id.emergency);

        emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(mainpage.this,emergencycontact.class);
                startActivity(intent);

            }
        });

        redbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mainpage.this, MainActivity.class);
                startActivity(intent);
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    protected void onDestroy() {
        Process.killProcess(Process.myPid());
        super.onDestroy();
    }
}