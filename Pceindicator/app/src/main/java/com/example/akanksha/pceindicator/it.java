package com.example.akanksha.pceindicator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class it extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it);

        pdfView = (PDFView) findViewById(R.id.pdfView);
        pdfView.fromAsset("ittt.pdf").load();

    }
}
