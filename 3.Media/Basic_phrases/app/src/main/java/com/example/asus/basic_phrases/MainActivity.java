package com.example.asus.basic_phrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public void playPhrase (View view){

        Log.i("info","phrase clicked");

        Button buttonPressed = (Button) view;

        Log.i("Button pressed", buttonPressed.getTag().toString());

        MediaPlayer mediaPlayer = MediaPlayer.create(this, getResources().getIdentifier(buttonPressed.getTag().toString(), "raw", getPackageName()));;

        mediaPlayer.start();
    }

    /*public void click1(View view){

        Log.i("button tapped","Good Morning");

        MediaPlayer sound = MediaPlayer.create(this,R.raw.good_morning);

        sound.start();

    }

    public void click2(View view){

        Log.i("button tapped","Thank you");

        MediaPlayer sound = MediaPlayer.create(this,R.raw.thank_you__very_much);

        sound.start();

    }

    public void click3(View view){

        Log.i("button tapped","Goodbye");

        MediaPlayer sound = MediaPlayer.create(this,R.raw.goodbye);

        sound.start();

    }

    public void click4(View view){

        Log.i("button tapped","Hi");

        MediaPlayer sound = MediaPlayer.create(this,R.raw.hi_bye);

        sound.start();

    }

    public void click5(View view){

        Log.i("button tapped","I am sorry");

        MediaPlayer sound = MediaPlayer.create(this,R.raw.i_am_sorry);

        sound.start();

    }

    public void click6(View view){

        Log.i("button tapped","Pardon me");

        MediaPlayer sound = MediaPlayer.create(this,R.raw.pardon_me);

        sound.start();

    }

    public void click7(View view){

        Log.i("button tapped","Please");

        MediaPlayer sound = MediaPlayer.create(this,R.raw.please);

        sound.start();

    }

    public void click8(View view){

        Log.i("button tapped","See you later");

        MediaPlayer sound = MediaPlayer.create(this,R.raw.see_you_later);

        sound.start();

    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
