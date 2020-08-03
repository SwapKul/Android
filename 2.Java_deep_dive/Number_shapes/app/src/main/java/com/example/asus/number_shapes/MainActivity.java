package com.example.asus.number_shapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void triangleFunction (View view) {

        Log.i("info","triangle");
        EditText number = findViewById(R.id.numberText);
        String numberString = number.getText().toString();
        int numberInteger = Integer.parseInt(numberString);
        int ex = 0;
        for (int i = 1; i <= numberInteger; i++){

            ex = ex + i;
            if (ex == numberInteger) {
                Log.i("number", Integer.toString(ex));
                Toast.makeText(this, "It is a Triangle number.", Toast.LENGTH_SHORT).show();
            } else {
                Log.i("result","This number is not a triangle number.");
                Toast.makeText(this, "It is a not Triangle number.", Toast.LENGTH_SHORT).show();
            }
        }

    }

    public void squareFunction (View view) {

        Log.i("info","square");
        EditText number = findViewById(R.id.numberText);
        String numberString = number.getText().toString();
        int numberInteger = Integer.parseInt(numberString);
        for (int i = 1; i <= numberInteger/2; i++) {

            int quotient = numberInteger / i;
            if (quotient == i) {
                Log.i("number", Integer.toString(i));
                Toast.makeText(this, "It is a Square number.", Toast.LENGTH_SHORT).show();
            }/* else {
                Log.i("result","This number is not a square number.");
            }*/

        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
