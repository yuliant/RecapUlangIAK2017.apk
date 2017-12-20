package com.example.android.finalproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

public class peserta extends AppCompatActivity {
    ImageView instagram;
    ImageView facebook1;
    ImageView git;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peserta);

        String text2 = "Nama saya adalah Masrizal Eka Yulinto."+
                " Saya adalah salah satu peserta dari Indonesia Android Kejar 2017 (IAK 2017)"+
                ". Lebih tepatnya, satu dari 32 peserta IAK 3 level beginer regional Surabaya venue MAN Sidoarjo (12 dan 18 November 2017)."+
                " Lahir di Sidoarjo tanggal 04 Juli 1997, saya pernah mengenyam pendidikan di SMA Negeri 3 Sidoarjo."+
                " dan sekarang saya sedang berjuang untuk memperoleh gelar sarjana S1 teknik informatika di Universitas Muhammadiyah Sidoarjo.\n";

        WebView riwayat2 = (WebView) findViewById(R.id.riwayat2);
        riwayat2.loadData("<p style=\"text-align: justify\">"+ text2 +"</p>", "text/html", "UTF-8");

        String text3="Saya adalah developer dari aplikasi ini. "+
                "Aplikasi ini saya buat dengan tujuan untuk menyelesaikan final project program IAK 2017 yang saya ikuti. "+
                "Pada aplikasi ini saya menjelaskan segala hal tentang IAK 2017 khususnya untuk regional Surabaya venue MAN "+
                "Sidoarjo. Siapa pematerinya, apa saja yang saya kerjakan selama study grup atau selama mengikuti online "+
                "course udacity. saya juga memperlihatkan aplikasi - aplikasi yang telah saya buat lewat menu apikasi saya (Full dan tanpa edit)"+
                "dan secara khusus membagikan semua source code aplikasinya diakun github saya. "+
                "Saya harap aplikasi yang saya bagikan dapat berguna bagi orang lain dan dapat dikembangkan secara signifikan";

        WebView riwayat3 = (WebView) findViewById(R.id.riwayat3);
        riwayat3.loadData("<p style=\"text-align: justify\">"+ text3 +"</p>", "text/html", "UTF-8");

        instagram = (ImageView) findViewById(R.id.instagram);
        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.instagram.com/masrizaleka/"));
                startActivity(intent);
            }
        });

        facebook1 = (ImageView) findViewById(R.id.facebook1);
        facebook1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.facebook.com/rizal.ekayulianto"));
                startActivity(intent);
            }
        });

        git = (ImageView) findViewById(R.id.git);
        git.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://github.com/yuliant"));
                startActivity(intent);
            }
        });

    }
}
