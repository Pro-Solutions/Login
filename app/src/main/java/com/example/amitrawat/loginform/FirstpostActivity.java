package com.example.amitrawat.loginform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.*;
import android.app.*;
import android.os.*;

import android.view.*;
import android.content.*;
import android.media.*;


public class FirstpostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpost);

                WebView w=(WebView)findViewById(R.id.web4);
                w.setWebViewClient(new WebViewClient());
                w.loadUrl("http://www.firstpost.com/");
                WebSettings s=w.getSettings();
                s.setJavaScriptEnabled(true);
                s.setBuiltInZoomControls(true);
                s.setDomStorageEnabled(true);
            }
        }
