package com.nyinyi.nw.thehouzz.viewholder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.nyinyi.nw.thehouzz.R;
import com.nyinyi.nw.thehouzz.activities.ShopCategoryDetailActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by User on 12/13/2017.
 */

public class ShopViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.iv_shop_category)
    ImageView ivShopCategory;
    @BindView(R.id.tv_shop_category)
    TextView tvShopCategory;

    public ShopViewHolder(final View itemView, final Context context) {
        super(itemView);
        ButterKnife.bind(this,itemView);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(ShopCategoryDetailActivity.newIntent(context));
            }
        });

    }
}
