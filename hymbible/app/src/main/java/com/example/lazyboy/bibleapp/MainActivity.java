package com.example.lazyboy.bibleapp;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private static final String TAG =MainActivity.class.getSimpleName(); ;
    private List<Hymn> hymnList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MyAdapter myAdapter;
    private String queary;
    private String hymDetail;
    private GridLayoutManager gridLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar my_toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(my_toolbar);
        getSupportActionBar().setTitle(R.string.my_tb_title);
        getSupportActionBar().setIcon(R.drawable.ic_toolbar);

        getSearchResult();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        gridLayoutManager = new GridLayoutManager(this,5);
        myAdapter = new MyAdapter(hymnList,queary);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(myAdapter);
        prePareHym();

    }

    public Void getSearchResult() {
        Intent searchIntent = getIntent();
        if(Intent.ACTION_SEARCH.equals(searchIntent.getAction())){

             queary =searchIntent.getStringExtra(SearchManager.QUERY);
            Toast.makeText(MainActivity.this, queary, Toast.LENGTH_SHORT).show();

            for(int i=0; i<hymnList.size();i++){
               if ( hymnList.get(0).equals(queary)){
                    hymDetail= String.valueOf(hymnList.get(1));
                }
            }

/*
            for(Hymn nos : hymnList){
                Log.i(TAG, "onClick: " +queary);
                if(nos.getTitle().equals(queary)) {
                    hymDetail=nos.getDetail();
                    Log.i(TAG, "onClick: "+hymDetail);
                }

            }*/
            Intent intent = new Intent(MainActivity.this,HymnDetail.class);
            Bundle bundle =new Bundle();
            bundle.putString("hymnno",queary);
            bundle.putString("hymndetail",hymDetail);
            intent.putExtras(bundle);
            startActivity(intent);

        }

        return null;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        SearchView searchView = (SearchView) menu.findItem(R.id.menu_search).getActionView();
        SearchManager searchManager = (SearchManager) getSystemService(SEARCH_SERVICE);
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       if (item.equals(R.id.menu_info))
           Toast.makeText(MainActivity.this, " this app is created by suraz", Toast.LENGTH_SHORT).show();

        return super.onOptionsItemSelected(item);
    }

    public void prePareHym(){
        Hymn hymn =new Hymn("123","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("321","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("2","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("3","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("4","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("5","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("6","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("7","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("8","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("9","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("10","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("11","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("12","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("13","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("14","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymn =new Hymn("1","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("2","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("3","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("4","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("5","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("6","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("7","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("8","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("9","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("10","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("11","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("12","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("13","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("14","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymn =new Hymn("1","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("2","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("3","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("4","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("5","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("6","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("7","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("8","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("9","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("10","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("11","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("12","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("13","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("14","askjdhasjkdhksadkkjasdjasdkjasdkkj"); hymn =new Hymn("1","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("2","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("3","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("4","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("5","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("6","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("7","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("8","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("9","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("10","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("11","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("12","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("13","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("14","askjdhasjkdhksadkkjasdjasdkjasdkkj"); hymn =new Hymn("1","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("2","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("3","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("4","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("5","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("6","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("7","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("8","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("9","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("10","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("11","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("12","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("13","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("14","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymn =new Hymn("1","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("2","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("3","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("4","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("5","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("6","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("7","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("8","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("9","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("10","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("11","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("12","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("13","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("14","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymn =new Hymn("1","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("2","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("3","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("4","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("5","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("6","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("7","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("8","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("9","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("10","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("11","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("12","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("13","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("14","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymn =new Hymn("1","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("2","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("3","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("4","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("5","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("6","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("7","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("8","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("9","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("10","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("11","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("12","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("13","askjdhasjkdhksadkkjasdjasdkjasdkkj");
        hymnList.add(hymn);
        hymn =new Hymn("14","askjdhasjkdhksadkkjasdjasdkjasdkkj");



        hymnList.add(hymn);

        myAdapter.notifyDataSetChanged();

    }
}
