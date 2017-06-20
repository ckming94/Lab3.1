package com.example.taruc.lab31;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class AboutUsActivity extends AppCompatActivity {

    private WebView webViewHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        webViewHome = (WebView)findViewById(R.id.webview);

        webViewHome.loadUrl("http://www.tarc.edu.my");
    }
}
