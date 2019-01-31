package com.example.user.idowebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    WebView webView;
    EditText etA, etB, etC;
    Button btn0, button1;
    int a, b, c;
    String url="https://www.google.co.il/search?ei=DXVCXKS6LbHrxgPV-YGYDw&q=";
    String str,str1,str2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = findViewById(R.id.wv);
        webView.getSettings().setJavaScriptEnabled(true);
        etA = findViewById(R.id.editTextA);
        etB = findViewById(R.id.editTextB);
        etC = findViewById(R.id.editTextC);
        btn0 = findViewById(R.id.btn0);
        button1 = findViewById(R.id.btn1);

    }

    public void StartPage(View view) {
        str = etA.getText().toString();
        a= Integer.parseInt(str);
        str1 = etB.getText().toString();
        b= Integer.parseInt(str1);
        str2 = etC.getText().toString();
        c= Integer.parseInt(str2);
        url="https://www.google.co.il/search?ei=DXVCXKS6LbHrxgPV-YGYDw&q=";
        url = url+a+"x%5E2%2B"+b+"x%2B"+c+"&oq";
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url);
    }

    public void NewSolution(View view) {
        etA.setText("");
        etB.setText("");
        etC.setText("");
        url = "";
        webView.loadUrl(url);

    }
}