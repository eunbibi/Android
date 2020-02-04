package com.example.studentloan;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextAmount;
    EditText editTextDuration;
    EditText editTextRate;
    Button buttonCal;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextAmount = (EditText) findViewById(R.id.editTextAmount);
        editTextDuration = (EditText) findViewById(R.id.editTextDuration);
        editTextRate = (EditText) findViewById(R.id.editTextRate);
        buttonCal = (Button) findViewById(R.id.buttonCal);
        textViewResult = (TextView) findViewById(R.id.textViewResult);

        //Button btn = (Button)findViewById(R.id.getBtn);
        buttonCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Display total loan amount?")
                        .setMessage("Are you sure, you want to continue ?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this,"Selected Option: YES",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this,"Selected Option: No",Toast.LENGTH_SHORT).show();
                            }
                        });
                //Creating dialog box
                AlertDialog dialog  = builder.create();
                dialog.show();
            }
        });
    }

    public void btnCalcul(View view){
        double amount = Double.parseDouble(editTextAmount.getText().toString());
        double duration = Double.parseDouble(editTextDuration.getText().toString());
        double rate = Double.parseDouble(editTextRate.getText().toString());

        if(amount == 0){
            Toast.makeText(MainActivity.this,
                    "There is no value",
                    Toast.LENGTH_LONG).show();
        }
        else {

            double result = amount+((amount * duration * rate)/100);
            textViewResult.setText(String.valueOf(result));
        }
    }
}
