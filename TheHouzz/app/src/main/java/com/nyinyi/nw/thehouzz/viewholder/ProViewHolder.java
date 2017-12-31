package com.nyinyi.nw.thehouzz.viewholder;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;

import com.nyinyi.nw.thehouzz.R;
import com.nyinyi.nw.thehouzz.activities.ProContactActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by User on 12/16/2017.
 */

public class ProViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.btn_call)
    RelativeLayout btnCall;
    @BindView(R.id.btn_contact)
    RelativeLayout btnContact;

    public ProViewHolder(View itemView, final Context context) {
        super(itemView);
        ButterKnife.bind(this,itemView);
        btnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = ProContactActivity.newIntent(context);
                context.startActivity(intent);
            }
        });

    }
}
