package com.example.amitrawat.loginform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.*;
import android.app.*;
import android.os.*;

import android.view.*;
import android.content.*;
import android.media.*;


public class AltnewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altnews);

        WebView w=(WebView)findViewById(R.id.web0);
        w.setWebViewClient(new WebViewClient());
        w.loadUrl("http://www.altnews.com/");
        WebSettings s=w.getSettings();
        s.setJavaScriptEnabled(true);
        s.setBuiltInZoomControls(true);
        s.setDomStorageEnabled(true);
    }
}
