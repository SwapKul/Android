package com.d_task.asus.timers;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(10000, 100) {

          public void onTick(long millisecondsUntilDone) {

              //Toast.makeText(MainActivity.this, "Seconds left " + millisecondsUntilDone/1000 , Toast.LENGTH_SHORT).show();
              Log.i("Seconds left", String.valueOf(millisecondsUntilDone / 1000));

          }

          public void onFinish(){

              //Toast.makeText(MainActivity.this, "We're done! No more Countdown.", Toast.LENGTH_SHORT).show();
              Log.i("We're done!", "No more countdown");

          }

        }.start();

        /*
        final Handler handler = new Handler();

        Runnable run = new Runnable() {
            @Override
            public void run() {
                Log.i("Hey it's us", "A second has passed by");

                handler.postDelayed(this, 1000);
            }
        };

        handler.post(run);*/
    }
}
