package com.example.prownage.guessme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Button to get to the Activity MyData

        Button MyDatabtn = (Button)findViewById(R.id.MyDataBtn);

        MyDatabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MyData.class));
            }
        });


        //Button to go to the Activity MyStatistics

        Button MyStatisticsbtn = (Button)findViewById(R.id.MyStatisticsBtn);

        MyStatisticsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MyStatistics.class));
            }
        });


        //Button to go to the Activity StartGuessing

        Button StartGuessingbtn = (Button)findViewById(R.id.StartGuessingBtn);

        StartGuessingbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, StartGuessing.class));
            }
        });


    }





}
