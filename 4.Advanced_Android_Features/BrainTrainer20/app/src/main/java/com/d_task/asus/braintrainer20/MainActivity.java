package com.d_task.asus.braintrainer20;

import android.annotation.SuppressLint;
import android.os.CountDownTimer;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button goButton;
    ArrayList<Integer> answers = new ArrayList<>();
    int locationOfCorrectAnswer;
    TextView result;
    int score = 0;
    int numberOfQuestions = 0;
    TextView scoreTextView;
    TextView sumTextView;
    Button option1;
    Button option2;
    Button option3;
    Button option4;
    TextView timer;
    Button playAgain;
    ConstraintLayout mainGame;
    TextView highScoreView;
    EditText playerName;
    SeekBar timerSeekBar;
    TextView timerValue;
    int timerSec = 30000;


    @SuppressLint("SetTextI18n")
    public void playAgain(View view) {

        score = 0;
        numberOfQuestions = 0;
        timer.setText(timerSec/1000 + " s");
        scoreTextView.setText(Integer.toString(score) + "/" + Integer.toString(numberOfQuestions));

        newQuestion();
        playAgain.setVisibility(View.INVISIBLE);
        result.setVisibility(View.INVISIBLE);

        option1.setEnabled(true);
        option2.setEnabled(true);
        option3.setEnabled(true);
        option4.setEnabled(true);

        new CountDownTimer(timerSec, 1000) {

            @SuppressLint("SetTextI18n")
            @Override
            public void onTick(long l) {
                timer.setText(String.valueOf((l/1000)) + "s");
            }

            @SuppressLint("SetTextI18n")
            @Override

            public void onFinish() {
                result.setText("Done!");
                playAgain.setVisibility(View.VISIBLE);
                option1.setEnabled(false);
                option2.setEnabled(false);
                option3.setEnabled(false);
                option4.setEnabled(false);
                if (numberOfQuestions > 0){
                    percentage(score, numberOfQuestions);
                    if (score*100/numberOfQuestions > Integer.parseInt((String) highScoreView.getText()) )
                    highScoreView.setText(Integer.toString(score*100/numberOfQuestions));
                }
            }
        }.start();
    }

    public void percentage (int s, int n){


        Toast.makeText(MainActivity.this, "Hi " + playerName.getText().toString() + " you scored " + s*100/n + " %!", Toast.LENGTH_LONG).show();

    }

    public void startFunction(View view) {

        Log.i("Info", "Questionnaire Started");
        goButton.setVisibility(View.INVISIBLE);
        timerSeekBar.setVisibility(View.INVISIBLE);
        timerValue.setVisibility(View.INVISIBLE);
        playAgain(findViewById(R.id.timerTextView));
        mainGame.setVisibility(View.VISIBLE);
        playerName.setVisibility(View.INVISIBLE);
        Log.i("Player name:", playerName.getText().toString());
    }

    @SuppressLint("SetTextI18n")
    public void chooseAnswer(View view){
        Log.i("Tag:",view.getTag().toString());

        if (Integer.toString(locationOfCorrectAnswer).equals(view.getTag().toString())) {
            result.setVisibility(View.VISIBLE);
            result.setText("CORRECT!");
            score++;
        } else {
            result.setText("WRONG!");
        }
        numberOfQuestions++;
        scoreTextView.setText(Integer.toString(score) + "/" + Integer.toString(numberOfQuestions));
        newQuestion();
    }

    @SuppressLint("SetTextI18n")
    public  void newQuestion(){

        Random rand = new Random();

        int a = rand.nextInt(50);
        int b = rand.nextInt(50);

        sumTextView.setText(Integer.toString(a) + " + " + Integer.toString(b));

        locationOfCorrectAnswer = rand.nextInt(4);

        answers.clear();

        for (int i=0; i<4; i++){
            if (i == locationOfCorrectAnswer) {
                answers.add(a+b);
            } else {
                int wrongAnswer = rand.nextInt(100);

                while (wrongAnswer == a+b){
                    wrongAnswer = rand.nextInt(100);
                }

                answers.add(wrongAnswer);
            }
        }

        option1.setText(Integer.toString(answers.get(0)));
        option2.setText(Integer.toString(answers.get(1)));
        option3.setText(Integer.toString(answers.get(2)));
        option4.setText(Integer.toString(answers.get(3)));

    }


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.resultTextView);
        result.setText("Let's start");
        scoreTextView = findViewById(R.id.scoreTextView);
        timer = findViewById(R.id.timerTextView);
        playAgain = findViewById(R.id.playAgainButton);
        mainGame = findViewById(R.id.mainGame);
        highScoreView = findViewById(R.id.highScore);
        playerName = findViewById(R.id.nameEditText);
        timerSeekBar = findViewById(R.id.timerSeekBar);
        timerValue = findViewById(R.id.timerValue);


        sumTextView = findViewById(R.id.sumTextView);
        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        option4 = findViewById(R.id.option4);
        timerSeekBar.setMax(300);
        timerSeekBar.setProgress(30);

        timerSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                timerValue.setText(i+" seconds");
                timerSec = i*1000;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        timerSeekBar.setVisibility(View.VISIBLE);
        timerValue.setVisibility(View.VISIBLE);
        goButton = findViewById(R.id.goButton);
        goButton.setVisibility(View.VISIBLE);
        mainGame.setVisibility(View.INVISIBLE);
        playerName.setVisibility(View.VISIBLE);

        goButton.setEnabled(false);

        playerName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                goButton.setEnabled(charSequence.toString().trim().length() != 0);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }
}

