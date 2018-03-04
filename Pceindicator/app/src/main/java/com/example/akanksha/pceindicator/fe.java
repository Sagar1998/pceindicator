package com.example.akanksha.pceindicator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class fe extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fe);

        pdfView = (PDFView) findViewById(R.id.pdfView);
        pdfView.fromAsset("fett.pdf").load();

    }
}
