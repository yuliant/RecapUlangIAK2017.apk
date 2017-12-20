package com.example.android.finalproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class iak2017 extends AppCompatActivity {
    Button web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iak2017);

        String text = "Indonesia Android Kejar (IAK) adalah program yang diinisiasi oleh Google Developers untuk mengasah"+
                " kemampuan developer Indonesia dalam mengembangkan aplikasi mobile. Program berbasis komunitas ini menggunakan"+
                " materi online dari Udacity yang dipadukan dengan kelompok belajar secara offline (study group).";

        WebView riwayat = (WebView) findViewById(R.id.riwayat);
        riwayat.loadData("<p style=\"text-align: justify\">"+ text +"</p>", "text/html", "UTF-8");

        String text2 = "Baru - baru ini IAK sudah memasuki batchnya yang ke 3 atau lebih tepatnya IAK 2017 Batch 3. "+
                "Untuk regional Surabaya sendiri, sudah menyelesaikan kegiatannya di beberapa venue salah satunya di venue MAN Sidoarjo "+
                "tepat pada tanggal 12 dan 18 November 2017. Ingin tau lebih banyak tentang IAK 2017 silahkan kunjungi website dibawah ini !";

        WebView riwayat2 = (WebView) findViewById(R.id.riwayat2);
        riwayat2.loadData("<p style=\"text-align: justify\">"+ text2 +"</p>", "text/html", "UTF-8");

        web = (Button) findViewById(R.id.web);
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://events.withgoogle.com/indonesiaandroidkejar/"));
                startActivity(intent);
            }
        });
    }
}
