package com.d_task.asus.showhideuielement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void showFunction(View view) {
        TextView textView = findViewById(R.id.textView);
        textView.setVisibility(View.VISIBLE);
    }

    public void hideFunction(View view) {
        TextView textView = findViewById(R.id.textView);
        textView.setVisibility(View.INVISIBLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
