package com.nyinyi.nw.thehouzz.adapter;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.widget.GridLayout;

/**
 * Created by User on 12/16/2017.
 */
public class CustomGridLayoutManager extends GridLayoutManager {
    private boolean isScrollEnabled = true;

    public CustomGridLayoutManager(Context context,int col) {
        super(context,col);
    }

    public void setScrollEnabled(boolean flag) {
        this.isScrollEnabled = flag;
    }

    @Override
    public boolean canScrollVertically() {
        //Similarly you can customize "canScrollHorizontally()" for managing horizontal scroll
        return isScrollEnabled && super.canScrollVertically();
    }
}
