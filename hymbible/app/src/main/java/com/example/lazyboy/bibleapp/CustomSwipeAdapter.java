//package com.example.lazyboy.bibleapp;
//
//import android.content.Context;
//import android.support.v4.view.PagerAdapter;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.LinearLayout;
//import android.widget.TextView;
//
///**
// * Created by lazyboy on 6/23/2016.
// */
//public class CustomSwipeAdapter extends PagerAdapter {
//    Context ctx;
//    private LayoutInflater layoutInflater;
//
//
//
//    public CustomSwipeAdapter(Context ctx) {
//        this.ctx = ctx;
//    }
//
//    @Override
//    public int getCount() {
//        return 0;
//    }
//
//    @Override
//    public boolean isViewFromObject(View view, Object object) {
//        return (view==(LinearLayout)object);
//    }
//
//    @Override
//    public Object instantiateItem(ViewGroup container, int position) {
//        layoutInflater= (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        View view= layoutInflater.inflate(R.layout.swipe_layout,container,false);
//       // TextView texttitl = (TextView) view.findViewById(R.id.hymn_detail_title);
//       // TextView textdetl = (TextView) view.findViewById(R.id.hymn_detail);
//        container.addView(view);
//
//
//        return view;
//
//    }
//
//    @Override
//    public void destroyItem(ViewGroup container, int position, Object object) {
//       container.removeView((LinearLayout)object);
//    }
//}
