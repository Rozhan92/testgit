package com.example.git_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    String s="0";


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void findview(){
        Toast.makeText(MainActivity.this,"hghg",Toast.LENGTH_LONG).show();


    }
    private void onclick(){
        Toast.makeText(this, "test", Toast.LENGTH_SHORT).show();
    }

}