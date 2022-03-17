package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button addition;
    Button subtraction;
    Button multiplication;
    Button division;
    EditText first;
    EditText second;
    TextView solution;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        addition = (Button) findViewById(R.id.button);
        subtraction = (Button) findViewById(R.id.button2);
        multiplication = (Button) findViewById(R.id.button3);
        division = (Button) findViewById(R.id.button4);

       addition.setOnClickListener(this::onSum);
       subtraction.setOnClickListener(this::doSub);
       multiplication.setOnClickListener(this::doMul);
       division.setOnClickListener(this::doDiv);


    }



    public boolean getNumbers(){
        first = (EditText) findViewById(R.id.editTextTextPersonName);
        second = (EditText) findViewById(R.id.editTextTextPersonName2);
        solution = (TextView) findViewById(R.id.textView7);
        String s1 = first.getText().toString();
        String s2 = second.getText().toString();

        if ((s1.equals(null) && s2.equals(null))
                || (s1.equals("") && s2.equals(""))) {

            String result = "Please enter a value";
            solution.setText(" ");

            return false;
        } else {
            // converting string to int.
            num1 = Integer.parseInt(s1);

            // converting string to int.
            num2 = Integer.parseInt(s2);
        }

        return true;
    }



    public void onSum(View view) {
        if (getNumbers()) {
            int sum = num1 + num2;
            solution.setText(Integer.toString(sum));
        }
    }

    public void doSub(View view) {
        if (getNumbers()) {
            int sum = num1 - num2;
            solution.setText(Integer.toString(sum));
        }
    }

    public void doMul(View view) {
        if (getNumbers()) {
            int sum = num1 * num2;
            solution.setText(Integer.toString(sum));
        }
    }

    public void doDiv(View view) {
        if (getNumbers()) {

            // displaying the text in text view assigned as t1
            double sum = num1 / (num2 * 1.0);
            solution.setText(Double.toString(sum));
        }
    }


}
