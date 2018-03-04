package com.example.akanksha.pceindicator;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class commitee extends AppCompatActivity {

    public Button csi;
    public Button etsa;
    public Button ieee;
    public void init(){


        Button csi = (Button)findViewById(R.id.csi);
        csi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.csi.piit.ac.in"));
                startActivity(viewIntent);
            }
        });


        Button etsa = (Button)findViewById(R.id.etsa);
        etsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.etsa.piit.ac.in"));
                startActivity(viewIntent);
            }
        });


        Button ieee = (Button)findViewById(R.id.ieee);
        ieee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://ieeepiit.esy.es/BEST/index.html"));
                startActivity(viewIntent);
            }
        });




    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commitee);
        init();
    }

}
