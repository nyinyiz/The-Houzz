package com.nyinyi.nw.thehouzz.viewholder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.nyinyi.nw.thehouzz.R;
import com.nyinyi.nw.thehouzz.activities.ViewProductActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by User on 12/16/2017.
 */

public class BedRoomViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.iv_bedroom)
    ImageView ivBedRoom;
    @BindView(R.id.tv_bedroom)
    TextView tvBedRoom;

    public BedRoomViewHolder(View itemView, final Context context) {
        super(itemView);
        ButterKnife.bind(this,itemView);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(ViewProductActivity.newIntent(context));
            }
        });



    }
}
