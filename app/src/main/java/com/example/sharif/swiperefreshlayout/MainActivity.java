package com.example.sharif.swiperefreshlayout;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    SwipeRefreshLayout refreshLayout;
    WebView webView;
    WebViewClient viewClient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        refreshLayout = findViewById(R.id.swipeRefresh_id);
        webView = findViewById(R.id.webView_id);
        webView.loadUrl("http://www.google.com");

        viewClient = new WebViewClient();

        webView.setWebViewClient(viewClient);
    }
}
