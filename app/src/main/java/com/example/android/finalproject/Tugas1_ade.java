package com.example.android.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Tugas1_ade extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas1_ade);
    }
//    public void kehome6(View view) {
//        Intent intent = new Intent(Tugas1_ade.this, home.class);
//        startActivity(intent);
//    }
    public void webview_ade(View view) {
        Intent intent = new Intent(Tugas1_ade.this, webviewAde.class);
        startActivity(intent);
    }
}
