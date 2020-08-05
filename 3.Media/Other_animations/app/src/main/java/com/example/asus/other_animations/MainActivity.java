package com.example.asus.other_animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    public void fade(View view) {

        Log.i("info", "Image1 tapped");

        ImageView bartImage = findViewById(R.id.bartImage);

        ImageView image2 = findViewById(R.id.homerImage);

        bartImage.animate().alpha(1).translationX(500).rotation(1800).setDuration(2000);

        /*bartImage.animate().translationXBy(-1000).setDuration(2000); // translation is used for movement*/

        /*bartImage.animate().rotation(1800).alpha(0).setDuration(1000);*/

        /*bartImage.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);*/



    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView bartImage = findViewById(R.id.bartImage);

        bartImage.setX(-1000);  //we can use animate as well

        bartImage.animate().translationXBy(1000).rotation(1800).setDuration(2000);

    }
}
