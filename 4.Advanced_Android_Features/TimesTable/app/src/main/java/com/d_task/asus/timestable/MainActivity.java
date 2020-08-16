package com.d_task.asus.timestable;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView tableListView;

    public void generateTimesTable (int timesTableNumber){

        ArrayList<String> tableContent = new ArrayList<>();

        for (int j = 1; j <= 10; j++) {
            tableContent.add(Integer.toString(j * timesTableNumber));
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, tableContent);

        tableListView.setAdapter(arrayAdapter);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.click);
        final SeekBar tableSeekBar = findViewById(R.id.tableSeekBar);
        tableListView = findViewById(R.id.tableListView);

        int max = 20;
        int startingPosition = 10;

        tableSeekBar.setMax(max);
        tableSeekBar.setProgress(startingPosition);

        generateTimesTable(startingPosition);

        tableSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                mediaPlayer.start();

                int min = 1;

                int timesTableNumber;

                if (i < min) {
                    timesTableNumber = min;
                    tableSeekBar.setProgress(min);
                } else {
                    timesTableNumber = i;
                }

                Log.i("Seekbar value", Integer.toString(timesTableNumber));

                generateTimesTable(timesTableNumber);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }
}
