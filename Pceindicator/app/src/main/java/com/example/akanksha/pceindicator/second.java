package com.example.akanksha.pceindicator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class second extends AppCompatActivity {
    public Button fe;
    public Button compsb;
    public Button itb;
    public void init()
    {
        fe =(Button)findViewById(R.id.maps);
        fe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy = new Intent(second.this , fe.class);
                startActivity(toy);
            }
        });

        compsb =(Button)findViewById(R.id.compsb);
        compsb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy = new Intent(second.this , comps.class);
                startActivity(toy);
            }
        });
        itb =(Button)findViewById(R.id.itb);
        itb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy = new Intent(second.this , it.class);
                startActivity(toy);
            }
        });


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        init();
    }
}
