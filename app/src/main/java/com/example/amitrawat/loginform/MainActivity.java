package com.example.amitrawat.loginform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.*;
import android.os.*;

import android.view.*;
import android.content.*;
import android.media.*;
import android.widget.*;


public class MainActivity extends AppCompatActivity {

    EditText uname;
    EditText upassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Display(View v)
    {
        uname = (EditText)findViewById(R.id.uname);
        upassword = (EditText)findViewById(R.id.upassword);
        if ((uname.getText().toString().equals("admin")) && (upassword.getText().toString().equals("12345")))
        {
            Toast.makeText(getApplicationContext(), "DONE!", Toast.LENGTH_LONG).show();

            Intent i =new Intent(this, SubActivity.class);
            //Intent i=new Intent(MainActivity.this,subActivity.class);
            startActivity(i);
        }
        else
        {
            Toast.makeText(getApplicationContext(), "FAILED!", Toast.LENGTH_LONG).show();
        }
    }
    public void bye(View v)
    {
        System.exit(0);
    }
}
