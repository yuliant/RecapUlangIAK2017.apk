package com.example.android.finalproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

public class pemateri extends AppCompatActivity {
    ImageView facebook;
    ImageView masarda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemateri);

        facebook = (ImageView) findViewById(R.id.facebook);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://web.facebook.com/arda.editya?fref=ts"));
                startActivity(intent);
            }
        });

        String text = "Arda Surya Editya adalah salah satu pemateri dari \n" +
                "Indonesia Android Kejar 2017(IAK 2017) batch 3 level beginner. Lebih tepatnya, beliau adalah pemateri IAK venue MAN Sidoarjo (12 dan 18 November 2017). "+
                "Lahir di Surabaya 06 November 1992, \n" +
                "Arda Surya Editya pernah mengenyam pendidikan di MAN Sidoarjo, S1 pend. teknik elektro Unesa, dan \n" +
                "Pasca Sarjana Electrical Engineering and Computer Sciences di ITS. \n" +
                "Ingin tau Profile lengkapnya ?, silahkan kunjungi link di bawah ini.";

        WebView riwayat = (WebView) findViewById(R.id.riwayat);
        riwayat.loadData("<p style=\"text-align: justify\">"+ text +"</p>", "text/html", "UTF-8");


    }
}
