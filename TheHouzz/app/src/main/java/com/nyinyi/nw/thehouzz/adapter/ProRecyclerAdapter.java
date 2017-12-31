package com.nyinyi.nw.thehouzz.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nyinyi.nw.thehouzz.R;
import com.nyinyi.nw.thehouzz.viewholder.ProViewHolder;

/**
 * Created by User on 12/16/2017.
 */

public class ProRecyclerAdapter extends RecyclerView.Adapter<ProViewHolder>{
    Context context;
    LayoutInflater inflater;

    public ProRecyclerAdapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public ProViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_list_find_pros,parent,false);
        ProViewHolder vh = new ProViewHolder(view,context);
        return vh;
    }

    @Override
    public void onBindViewHolder(ProViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
