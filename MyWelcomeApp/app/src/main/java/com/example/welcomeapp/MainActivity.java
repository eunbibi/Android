package com.example.welcomeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextFname;
    EditText editTextLname;
    Button buttonHello;
    TextView textViewOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //method: findviewbyid
        editTextFname = (EditText) findViewById(R.id.editTextFname);
        editTextLname = (EditText) findViewById(R.id.editTextLname);
        buttonHello = (Button) findViewById(R.id.buttonHello);
        textViewOutput = (TextView) findViewById(R.id.textViewOutput);
    }

    public void buttonHello_clicked(View view) {
        String s1 = editTextFname.getText().toString();
        String s2 = editTextLname.getText().toString();

        if(s1.equals("")|| s2.equals("")){
            Toast.makeText(MainActivity.this,
                    "There is no value",
                    Toast.LENGTH_LONG).show();
        }
        else {
            textViewOutput.setText(editTextFname.getText());
            textViewOutput.append(" " + editTextLname.getText());
        }
    }
}
