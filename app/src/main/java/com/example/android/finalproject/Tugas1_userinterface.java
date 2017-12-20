package com.example.android.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Tugas1_userinterface extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas1_userinterface);
    }
//    public void kehome2(View view) {
//        Intent intent = new Intent(userinterface.this, home.class);
//        startActivity(intent);
//    }
    public void webview_interface(View view) {
        Intent intent = new Intent(Tugas1_userinterface.this, webviewInterface.class);
        startActivity(intent);
    }
}
