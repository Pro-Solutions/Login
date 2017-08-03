package com.example.amitrawat.loginform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.*;

public class IndiatodayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indiatoday);

        WebView w=(WebView)findViewById(R.id.web1);
        w.setWebViewClient(new WebViewClient());
        w.loadUrl("http://www.indiatoday.com/");
        WebSettings s=w.getSettings();
        s.setJavaScriptEnabled(true);
        s.setBuiltInZoomControls(true);
        s.setDomStorageEnabled(true);
    }
}
