package com.example.akanksha.pceindicator;

import android.content.Intent;
import android.drm.DrmStore;
import android.net.Uri;
import android.support.design.internal.NavigationMenu;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.NavigableMap;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    public Button but1;
    public Button maps;
    public Button result;
    public Button termcal;
    public Button contactus;
    public Button commitee;
    public Button portal;
    public Button aboutus;
    public void init()
    {
        but1=(Button)findViewById(R.id.but1);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy = new Intent(MainActivity.this , second.class);
                startActivity(toy);
            }
        });
        maps=(Button)findViewById(R.id.maps);
        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy = new Intent(MainActivity.this , map.class);
                startActivity(toy);
            }
        });


        termcal=(Button)findViewById(R.id.termcal);
        termcal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy = new Intent(MainActivity.this , termcal.class);
                startActivity(toy);
            }
        });

        contactus=(Button)findViewById(R.id.contactus);
        contactus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy = new Intent(MainActivity.this , contactus.class);
                startActivity(toy);
            }
        });




        result = (Button)findViewById(R.id.result);
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.piitexamresults.piit.ac.in/"));
                startActivity(viewIntent);
            }
        });

        commitee=(Button)findViewById(R.id.commitee);
        commitee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy = new Intent(MainActivity.this , commitee.class);
                startActivity(toy);
            }
        });


        portal=(Button)mDrawerLayout.findViewById(R.id.portal);
        portal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://203.115.126.37/pceonline/"));
                startActivity(viewIntent);
            }
        });

        aboutus=(Button)mDrawerLayout.findViewById(R.id.aboutus);
        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://pce.ac.in/about-us/contact-us/"));
                startActivity(viewIntent);
            }

            });



        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawerLayout =(DrawerLayout) findViewById(R.id.DrawerLayout);
        mToggle= new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        init();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(mToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
