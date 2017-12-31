package com.nyinyi.nw.thehouzz.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nyinyi.nw.thehouzz.R;
import com.nyinyi.nw.thehouzz.viewholder.BedRoomViewHolder;

/**
 * Created by User on 12/16/2017.
 */

public class BedRoomRecyclerAdapter extends RecyclerView.Adapter<BedRoomViewHolder> {
    Context context;
    LayoutInflater inflater;

    public BedRoomRecyclerAdapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }


    @Override
    public BedRoomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_list_bedroom,parent,false);
        BedRoomViewHolder vh = new BedRoomViewHolder(view,context);
        return vh;
    }

    @Override
    public void onBindViewHolder(BedRoomViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
