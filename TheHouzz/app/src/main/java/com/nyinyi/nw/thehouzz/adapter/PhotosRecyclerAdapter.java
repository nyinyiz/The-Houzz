package com.nyinyi.nw.thehouzz.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nyinyi.nw.thehouzz.activities.PhotoViewActivity;
import com.nyinyi.nw.thehouzz.viewholder.PhotoViewHolder;
import com.nyinyi.nw.thehouzz.R;

/**
 * Created by User on 12/13/2017.
 */

public class PhotosRecyclerAdapter extends RecyclerView.Adapter<PhotoViewHolder> {

    Context context;
    LayoutInflater inflater;

    public PhotosRecyclerAdapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public PhotoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_list_photos,parent,false);
        PhotoViewHolder vh = new PhotoViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(PhotoViewHolder holder, int position) {

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = PhotoViewActivity.newIntent(context);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
