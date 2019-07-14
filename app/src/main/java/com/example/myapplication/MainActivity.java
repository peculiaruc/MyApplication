package com.example.myapplication;

import android.content.Intent;
import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void openAboutActivity(View view) {
        Intent intent = new Intent(MainActivity.this, WebpageActivity.class);
        startActivity(intent);
    }

    public void openProfileActivity(View view) {
        Intent intent = new Intent(MainActivity.this, MyProfileActivity.class);
        startActivity(intent);
    }
}
