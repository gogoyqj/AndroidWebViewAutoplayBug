package com.example.webviewdemo;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;

import java.io.ByteArrayInputStream;
import java.net.URLEncoder;


public class MainActivity extends AppCompatActivity {
    public WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();//执行初始化函数
        webView.loadUrl("https://cdn.alsgp0.fds.api.mi-img.com/mi-ads-static/wrapper-utils/auto.html");
//        webView.loadDataWithBaseURL("", html, "text/html", "UTF-8", "");
    }

    public void init() {
        webView = (WebView) findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);//使用JavaScript
        webView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        webView.getSettings().setMediaPlaybackRequiresUserGesture(true);
        webView.setWebContentsDebuggingEnabled(true);
        webView.setWebViewClient(new WebViewClient() {
        });

    }

}