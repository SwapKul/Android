package com.d_task.asus.trials;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView newListView = findViewById(R.id.newListView);

        final ArrayList<String> myFriends = new ArrayList<>();

        myFriends.add("Jose");
        myFriends.add("Anne");
        myFriends.add("Reno");
        myFriends.add("Slay");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, myFriends);

        newListView.setAdapter(arrayAdapter);

        /*newListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(MainActivity.this, myFriends.get(i), Toast.LENGTH_SHORT).show();

            }
        });*/

    }
}
