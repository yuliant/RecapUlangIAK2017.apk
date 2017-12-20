package com.example.android.finalproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class home extends AppCompatActivity {
//ImageView aiksby;
ImageView github;
LinearLayout face;
LinearLayout input;
LinearLayout program;
LinearLayout daftar;
//LinearLayout tugas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

//        aiksby = (ImageView) findViewById(R.id.aiksby);
//        aiksby.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent();
//                intent.setAction(Intent.ACTION_VIEW);
//                intent.addCategory(Intent.CATEGORY_BROWSABLE);
//                intent.setData(Uri.parse("https://events.withgoogle.com/indonesiaandroidkejar/"));
//                startActivity(intent);
//            }
//        });

        github = (ImageView) findViewById(R.id.github);
        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://github.com/yuliant"));
                startActivity(intent);
            }
        });

        face = (LinearLayout) findViewById(R.id.face);
        face.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.udacity.com/course/android-basics-user-interface--ud834"));
                startActivity(intent);
            }
        });

        input = (LinearLayout) findViewById(R.id.input);
        input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.udacity.com/course/android-basics-user-input--ud836"));
                startActivity(intent);
            }
        });

        program = (LinearLayout) findViewById(R.id.program);
        program.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://events.withgoogle.com/indonesiaandroidkejar/program/#content"));
                startActivity(intent);
            }
        });

        daftar = (LinearLayout) findViewById(R.id.daftar);
        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://events.withgoogle.com/indonesiaandroidkejar/daftar/#content"));
                startActivity(intent);
            }
        });

//        tugas = (LinearLayout) findViewById(R.id.tugas);
//        tugas.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent();
//                intent.setAction(Intent.ACTION_VIEW);
//                intent.addCategory(Intent.CATEGORY_BROWSABLE);
//                intent.setData(Uri.parse("https://drive.google.com/file/d/1C0_dhoOYzOtYszq-9oIGXt0AuP4AJDrw/view?usp=sharing"));
//                startActivity(intent);
//            }
//        });
    }

    public void birthday(View view) {
        Intent intent = new Intent(home.this, HappyBirthday.class);
        startActivity(intent);
    }
    public void justjava(View view) {
        Intent intent = new Intent(home.this, JustJava.class);
        startActivity(intent);
    }
    public void justjava2(View view) {
        Intent intent = new Intent(home.this, JustJava2.class);
        startActivity(intent);
    }
    public void counter(View view) {
        Intent intent = new Intent(home.this, CourtCounter.class);
        startActivity(intent);
    }
    public void pemateri(View view) {
        Intent intent = new Intent(home.this, pemateri.class);
        startActivity(intent);
    }
    public void pest(View view) {
        Intent intent = new Intent(home.this, peserta.class);
        startActivity(intent);
    }
    public void aiksby_web(View view) {
        Intent intent = new Intent(home.this, iak2017.class);
        startActivity(intent);
    }
    public void tugas1(View view) {
        Intent intent = new Intent(home.this, Tugas1.class);
        startActivity(intent);
    }

}
