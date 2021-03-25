package com.movingdots.heretaskfortantuomar23;

import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class HereMapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heremap);
        getWindow().setSoftInputMode( WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);



        String url = "file:///android_asset/HereLocationJavaScript.html";
        WebView webView = (WebView) findViewById(R.id.webview_HereMap);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
    }
}