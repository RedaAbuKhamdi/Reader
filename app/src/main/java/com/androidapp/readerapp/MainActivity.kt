package com.androidapp.readerapp

import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.next_button)
        button.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                setContentView(R.layout.webview)
                val myWebView: WebView = findViewById(R.id.web_view)
                myWebView.webViewClient = WebViewClient()
                myWebView.loadUrl("http://www.wikipedia.com")
            }

        })
    }
}