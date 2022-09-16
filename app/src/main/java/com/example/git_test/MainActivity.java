package com.example.git_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    String s="0";
    TextView tv1,tv2;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findview();
    }
    private void findview(){
        s="bnhv";
        Toast.makeText(MainActivity.this,"hghg",Toast.LENGTH_LONG).show();


    }

}