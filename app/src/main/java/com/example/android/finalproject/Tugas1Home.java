package com.example.android.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Tugas1Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas1_home);
    }
    public void aik(View view) {
        Intent intent = new Intent(Tugas1Home.this, Tugas1_aik2017.class);
        startActivity(intent);
    }
    public void face(View view) {
        Intent intent = new Intent(Tugas1Home.this, Tugas1_userinterface.class);
        startActivity(intent);
    }
    public void input(View view) {
        Intent intent = new Intent(Tugas1Home.this, Tugas1_userinput.class);
        startActivity(intent);
    }
    public void ardasurya(View view) {
        Intent intent = new Intent(Tugas1Home.this, Tugas1_arda.class);
        startActivity(intent);
    }
    public void masrizaleka(View view) {
        Intent intent = new Intent(Tugas1Home.this, Tugas1_masrizal.class);
        startActivity(intent);
    }
    public void adesetya(View view) {
        Intent intent = new Intent(Tugas1Home.this, Tugas1_ade.class);
        startActivity(intent);
    }
}
