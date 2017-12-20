package com.example.android.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Tugas1_arda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas1_arda);
    }
//    public void kehome4(View view) {
//        Intent intent = new Intent(Tugas1_arda.this, Tugas1Home.class);
//        startActivity(intent);
//    }
    public void webview_arda(View view) {
        Intent intent = new Intent(Tugas1_arda.this, webviewArda.class);
        startActivity(intent);
    }
}
