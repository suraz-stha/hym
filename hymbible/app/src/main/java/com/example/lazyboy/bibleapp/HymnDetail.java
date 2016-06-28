package com.example.lazyboy.bibleapp;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class HymnDetail extends AppCompatActivity {
    ViewPager viewPager;
    private List<Hymn> hymnList;
    //CustomSwipeAdapter adapter;

    private static final String TAG =HymnDetail.class.getSimpleName() ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hymn_detail);

        Toolbar my_toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(my_toolbar);
        getSupportActionBar().setTitle(R.string.my_tb_title);
        getSupportActionBar().setIcon(R.drawable.ic_toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        /*viewPager = (ViewPager) findViewById(R.id.view_pager);
        adapter =new CustomSwipeAdapter(this);
        viewPager.setAdapter(adapter);*/

        TextView texthymnno = (TextView) findViewById(R.id.hymn_detail_title);
        TextView textdetail = (TextView) findViewById(R.id.hymn_detail);


        Intent intent = getIntent();
        Bundle bundle =null;
        bundle= intent.getExtras();
        String hymnNo =bundle.getString("hymnno");
        String hymnDetail =bundle.getString("hymndetail");
        texthymnno.setText(hymnNo);
        textdetail.setText(hymnDetail);


        /*Toolbar toolbar= (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Hymn detail");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);*/
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.equals(R.id.menu_info))
            Toast.makeText(HymnDetail.this, " this app is created by suraz", Toast.LENGTH_SHORT).show();

        return super.onOptionsItemSelected(item);
    }
}
