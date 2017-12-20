package com.example.android.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Tugas1_userinput extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas1_userinput);
    }
//    public void kehome3(View view) {
//        Intent intent = new Intent(userinput.this, home.class);
//        startActivity(intent);
//    }
    public void webview_input(View view) {
        Intent intent = new Intent(Tugas1_userinput.this, webviewInput.class);
        startActivity(intent);
    }
}
