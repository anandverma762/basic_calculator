package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
public void Add(View v){
    EditText e1=(EditText)findViewById(R.id.editTextNumber);
    EditText e2=(EditText)findViewById(R.id.editTextNumber2);
    EditText e3=(EditText)findViewById(R.id.editTextNumber3);

    int n1=Integer.parseInt(e1.getText().toString());
    int n2=Integer.parseInt(e2.getText().toString());
    int res=n1+n2;
    e3.setText("Result=" +res);

}
    public void sub(View v){
        EditText e1=(EditText)findViewById(R.id.editTextNumber);
        EditText e2=(EditText)findViewById(R.id.editTextNumber2);
        EditText e3=(EditText)findViewById(R.id.editTextNumber3);

        int n1=Integer.parseInt(e1.getText().toString());
        int n2=Integer.parseInt(e2.getText().toString());
        int res=n1-n2;
        e3.setText("Result=" +res);

    }
    public void MUL(View v){
        EditText e1=(EditText)findViewById(R.id.editTextNumber);
        EditText e2=(EditText)findViewById(R.id.editTextNumber2);
        EditText e3=(EditText)findViewById(R.id.editTextNumber3);

        int n1=Integer.parseInt(e1.getText().toString());
        int n2=Integer.parseInt(e2.getText().toString());
        int res=n1*n2;
        e3.setText("Result=" +res);

    }
    public void divide(View v){
        EditText e1=(EditText)findViewById(R.id.editTextNumber);
        EditText e2=(EditText)findViewById(R.id.editTextNumber2);
        EditText e3=(EditText)findViewById(R.id.editTextNumber3);

        int n1=Integer.parseInt(e1.getText().toString());
        int n2=Integer.parseInt(e2.getText().toString());
        int res=n1/n2;
        e3.setText("Result=" +res);

    }

}