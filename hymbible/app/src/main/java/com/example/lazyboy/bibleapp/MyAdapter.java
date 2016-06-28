package com.example.lazyboy.bibleapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by lazyboy on 6/22/2016.
 */
public class MyAdapter extends RecyclerView.Adapter<HymViewHolder> {
    private List<Hymn> hymnList;
    private String SearchResults;

    public MyAdapter(List<Hymn> hymnList, String searchResults) {
        this.hymnList = hymnList;
        SearchResults = searchResults;
    }



    @Override
    public void onBindViewHolder(HymViewHolder holder, int position) {

        holder.title.setText(hymnList.get(position).getTitle());

    }

    @Override
    public HymViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View HymView = LayoutInflater.from(parent.getContext()).inflate(R.layout.hym_list,parent,false);

        return new HymViewHolder(HymView,SearchResults, hymnList);
    }

    @Override
    public int getItemCount() {
        return hymnList.size();
    }
}
