package com.example.asus.number_shapes_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number{

        int num;

        private boolean triangularNumber(){

            int x = 1;

            int triangleNumber = 1;

            while (triangleNumber < num) {

                x++;
                triangleNumber = triangleNumber + x;

            }

            return triangleNumber == num;

        }

        private boolean squareNumber () {

            double squareRoot = Math.sqrt(num);

            return squareRoot % 1 == 0; // or we could use return squareRoot == Math.floor(squareRoot)

        }

    }

    public void clickFunction (View view) {

        Log.i("info","Button pressed!");
        EditText chk = findViewById(R.id.numberText);
        String message;
        if (chk.getText().toString().isEmpty()) {

            message = "Please enter a number";

        } else {
            Number check = new Number();
            check.num = Integer.parseInt(chk.getText().toString());
            message = chk.getText().toString();
            if (check.squareNumber() && check.triangularNumber()) {

                message = message + " is a square and a triangular number";

            } else if (check.squareNumber()) {

                message = message + " is a square number";

            } else if (check.triangularNumber()) {

                message += " is a triangular number";

            } else {

                message += " is neither square nor a triangular number";

            }
        }
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
