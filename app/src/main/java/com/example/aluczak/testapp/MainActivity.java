package com.example.aluczak.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final static String LOG_TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(LOG_TAG, "onCreate");

        TextView textView= (TextView) findViewById(R.id.top_text_view);
        ImageView kittenImg = (ImageView) findViewById(R.id.kitten_image);
        Button kittenButt = (Button) findViewById(R.id.kitten_button);

        kittenButt.setOnClickListener();
    }
}