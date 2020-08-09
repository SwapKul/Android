package com.example.asus.listviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = findViewById(R.id.myListView);

        final ArrayList<String> myFamily = new ArrayList<>();

        myFamily.add("Avnish");

        myFamily.add("Tripti");

        myFamily.add("Tushar");

        myFamily.add("Swapnil");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, myFamily);

        myListView.setAdapter(arrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //adapterView.setVisibility(View.GONE); it makes the whole view disappear
                //view.setVisibility(View.GONE); it makes just the tapped view disappear
                Log.i("Person tapped", myFamily.get(i));
            }
        });

    }
}
