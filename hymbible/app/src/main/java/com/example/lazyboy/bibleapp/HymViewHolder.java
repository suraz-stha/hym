package com.example.lazyboy.bibleapp;


import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lazyboy on 6/22/2016.
 */
public class HymViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private static final String TAG = HymViewHolder.class.getSimpleName();
    public TextView title;
    public TextView detail;
    private String hymDetail;
    private String hymnclikpos;
    private String searchRes;
    private List<Hymn> hymnList;



    public HymViewHolder(View view,String searchRes, List<Hymn> hymnListPassed) {
        super(view);
        this.searchRes = searchRes;
        this.hymnList = hymnListPassed;
        view.setOnClickListener(this);
        Log.i(TAG, "HymViewHolder: set value");
        title = (TextView) view.findViewById(R.id.hym_no);

    }



    @Override
    public void onClick(View v) {
        Log.i(TAG, "onClick: ");
        Toast.makeText(v.getContext(), "Hymn no :" + hymnList.get(getAdapterPosition()).getTitle(), Toast.LENGTH_SHORT).show();

        hymnclikpos=hymnList.get(getAdapterPosition()).getTitle();

        for(Hymn no : hymnList){
            if(no.getTitle().equals(hymnclikpos)) {
                hymDetail=no.getDetail();
                Log.i(TAG, "onClick: "+hymDetail);
            }

        }
        Intent intent = new Intent(v.getContext(),HymnDetail.class);
        Bundle bundle =new Bundle();
        bundle.putString("hymnno",hymnclikpos);
        bundle.putString("hymndetail",hymDetail);
        intent.putExtras(bundle);
        v.getContext().startActivity(intent);
    }

}
