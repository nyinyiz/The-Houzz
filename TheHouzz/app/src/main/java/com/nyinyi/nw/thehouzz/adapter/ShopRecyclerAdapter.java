package com.nyinyi.nw.thehouzz.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nyinyi.nw.thehouzz.R;
import com.nyinyi.nw.thehouzz.viewholder.ShopViewHolder;

/**
 * Created by User on 12/13/2017.
 */

public class ShopRecyclerAdapter extends RecyclerView.Adapter<ShopViewHolder> {
    Context context;
    LayoutInflater inflater;

    public ShopRecyclerAdapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public ShopViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_list_shop,parent,false);
        ShopViewHolder vh = new ShopViewHolder(view,context);
        return vh;
    }

    @Override
    public void onBindViewHolder(ShopViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
