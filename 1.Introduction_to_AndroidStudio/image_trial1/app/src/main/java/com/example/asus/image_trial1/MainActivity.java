package com.example.asus.image_trial1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void switchFunction(View view) {

        Log.i("Info", "Button Pressed!");

        Toast.makeText(this, "Success!!", Toast.LENGTH_SHORT).show();

        ImageView image = (ImageView) findViewById(R.id.catImageView);
        image.setImageResource(R.drawable.cat2);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
