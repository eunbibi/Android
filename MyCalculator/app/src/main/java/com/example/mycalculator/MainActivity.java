package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText fNum;
    EditText sNum;

    Button buttonMultiple;
    Button buttonPlus;
    Button buttonMinus;
    Button buttonDevide;

    TextView textViewOutput;

    int value1 = 0;
    int value2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fNum = (EditText) findViewById(R.id.fNum);
        sNum = (EditText) findViewById(R.id.sNum);

        buttonPlus = (Button) findViewById(R.id.buttonPlus);
        buttonMinus = (Button) findViewById(R.id.buttonMinus);
        buttonMultiple = (Button) findViewById(R.id.buttonMultiple);
        buttonDevide = (Button) findViewById(R.id.buttonDivide);

        textViewOutput = (TextView) findViewById(R.id.textViewOutput);
    }

    public void buttonPlus_clicked(View view) {
        String s1 = fNum.getText().toString();
        String s2 = sNum.getText().toString();

        if(s1.equals("")|| s2.equals("")){
            Toast.makeText(MainActivity.this,
                    "There is no value",
                    Toast.LENGTH_LONG).show();
        }
        else {
            int result = Integer.parseInt(s1) + Integer.parseInt(s2);
            textViewOutput.setText("Result: " + result);
        }
    }

    public void buttonMultiple_clicked(View view) {
        String s1 = fNum.getText().toString();
        String s2 = sNum.getText().toString();

        if(s1.equals("")|| s2.equals("")){
            Toast.makeText(MainActivity.this,
                    "There is no value",
                    Toast.LENGTH_LONG).show();
        }
        else {
            int result = Integer.parseInt(s1) * Integer.parseInt(s2);
            textViewOutput.setText("Result: " + result);
        }
    }

    public void buttonDivide_clicked(View view) {
        String s1 = fNum.getText().toString();
        String s2 = sNum.getText().toString();

        if(s1.equals("")|| s2.equals("")){
            Toast.makeText(MainActivity.this,
                    "There is no value",
                    Toast.LENGTH_LONG).show();
        }
        else {
            int result = Integer.parseInt(s1) / Integer.parseInt(s2);
            textViewOutput.setText("Result: " + result);
        }
    }

    public void buttonMinus_clicked(View view) {
        String s1 = fNum.getText().toString();
        String s2 = sNum.getText().toString();

        if(s1.equals("")|| s2.equals("")){
            Toast.makeText(MainActivity.this,
                    "There is no value",
                    Toast.LENGTH_LONG).show();
        }
        else {
            int result = Integer.parseInt(s1) - Integer.parseInt(s2);
            textViewOutput.setText("Result: " + result);
        }
    }
}
