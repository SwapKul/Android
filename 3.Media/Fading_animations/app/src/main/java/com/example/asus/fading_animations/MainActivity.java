package com.example.asus.fading_animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean bartIsShowing = true;

    public void fade(View view) {

        Log.i("info","Image1 tapped");

        ImageView image = findViewById(R.id.bartImage);

        ImageView image2 = findViewById(R.id.homerImage);

        if (bartIsShowing) {

            bartIsShowing = false;

            image.animate().alpha(0).setDuration(1500);  //alpha sets the solid property of an object

            image2.animate().alpha(1).setDuration(1500);
        } else {

            bartIsShowing = true;

            image.animate().alpha(1).setDuration(1500);  //alpha sets the solid property of an object

            image2.animate().alpha(0).setDuration(1500);
        }
    }

    public void appear(View view) {

        Log.i("info","Image2 tapped");

        ImageView image = findViewById(R.id.bartImage);

        ImageView image2 = findViewById(R.id.homerImage);

        image2.animate().alpha(0).setDuration(2000);
        image2.setClickable(false);

        image.animate().alpha(1).setDuration(2000);  //alpha sets the solid property of an object
        image.setClickable(true);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
