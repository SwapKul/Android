package com.example.asus.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int random;

    public void generateRandomNumber () {

        random = new Random().nextInt(21) + 1;

    }

    public void guessFunction(View view){

        EditText guess = findViewById(R.id.guessText);

        int guessInteger = Integer.parseInt(guess.getText().toString());

        String message;

        if (guessInteger > random){

            message = "Lower!";

        } else if (guessInteger < random){

            message = "Higher!";

        } else {

            message = "Voila!";

            generateRandomNumber(); // calling it here so that once the user has entered the correct no it automatically renews for the next set of rounds.

        }

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

        Log.i("Random Number", Integer.toString(random));

        Log.i("Entered Number", guess.getText().toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateRandomNumber(); // calling it here so that the random number is same while the app is running and only changes after rebooting the app.

    }
}
