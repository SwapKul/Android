package com.example.asus.interactivitydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void login(View view){

        EditText userName = (EditText) findViewById(R.id.userName);

        EditText passwordText = (EditText) findViewById(R.id.passwordText);

        Log.i("Info", "Button Pressed");

        Log.i("Username", userName.getText().toString());

        Log.i("Password", passwordText.getText().toString());

        Toast.makeText(this, "Hi there", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
