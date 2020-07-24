package com.example.asus.currency_convertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertRupee(View view){

        Log.i("Info", "Working!");

        EditText amount = (EditText) findViewById(R.id.amountText);

        Log.i("Amount in Rupees", amount.getText().toString());

        String amountInRupees = amount.getText().toString();

        double amountInRupeesDouble = Double.parseDouble(amountInRupees);

        double amountInDollarsDouble = amountInRupeesDouble / 75;

        String amountInDollarsString = Double.toString(amountInDollarsDouble);

        Log.i("Amount in Dollars", amountInDollarsString);

        Toast.makeText(this, "₹ " + amountInRupees + " is $ " + amountInDollarsString, Toast.LENGTH_LONG).show();

    }

    public void convertDollar(View view){

        Log.i("Info", "Working!");

        EditText amount = (EditText) findViewById(R.id.amountText);

        Log.i("Amount in Dollars", amount.getText().toString());

        String amountInDollars = amount.getText().toString();

        double amountInDollarsDouble = Double.parseDouble(amountInDollars);

        double amountInRupeesDouble = amountInDollarsDouble * 75;

        String amountInRupeesString = Double.toString(amountInRupeesDouble);

        Log.i("Amount in Rupees", amountInRupeesString);

        Toast.makeText(this, "$ " + amountInDollars + " is ₹ " + amountInRupeesString, Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
