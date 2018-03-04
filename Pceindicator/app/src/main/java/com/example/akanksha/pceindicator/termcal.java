package com.example.akanksha.pceindicator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class termcal extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_termcal);

        pdfView = (PDFView) findViewById(R.id.pdfView);
        pdfView.fromAsset("termcalendar.pdf").load();

    }
}
