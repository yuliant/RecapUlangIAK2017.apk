package com.example.android.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;

public class Tugas1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas1);

        String text = "Aplikasi Tugas 1 IAK 2017 adalah aplikasi yang saya buat pada saat pertemuan pertama tanggal 12 November 2017 "+
                "venue MAN Sidoarjo regioanl Surabaya. Pada saat itu saya dan ke 32 peserta yang lain diberikan tugas untuk membuat "+
                "sebuah aplikasi yang menitikberatkan pada perpindahan per activity. Dari peristiwa itulah cikal bakal pembuatan aplikasi ini."+
                "Aplikasi Tugas 1 IAK 2017 memiliki tema yang hampir sama dengan aplikasi ini . Cuma pada aplikasi ini saya membahas bukan" +
                "hanya tentang IAK 2017 tapi juga membuat kumpulan aplikasi - aplikasi dan membagikan source codenya melalui akun github saya. " +
                "Penasaran dengan aplikasi Tugas 1 IAK 2017 silahkan klik button di bawah ini. !";

        WebView riwayat = (WebView) findViewById(R.id.riwayat);
        riwayat.loadData("<p style=\"text-align: justify\">"+ text +"</p>", "text/html", "UTF-8");

    }
    public void next(View view) {
        Intent intent = new Intent(Tugas1.this, Tugas1Home.class);
        startActivity(intent);
    }
}
