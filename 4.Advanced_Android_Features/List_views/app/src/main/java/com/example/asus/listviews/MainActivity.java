package com.example.asus.listviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = findViewById(R.id.myListView);

        ArrayList<String> family = new ArrayList<String>();

        family.add("Avnish");

        family.add("Tripti");

        family.add("Tushar");

        family.add("Swapnil");

    }
}
