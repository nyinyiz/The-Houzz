package com.nyinyi.nw.thehouzz.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.provider.BaseColumns;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.nyinyi.nw.thehouzz.R;
import com.nyinyi.nw.thehouzz.adapter.BedRoomRecyclerAdapter;
import com.nyinyi.nw.thehouzz.adapter.CustomGridLayoutManager;
import com.nyinyi.nw.thehouzz.adapter.ShopRecyclerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by User on 12/16/2017.
 */

public class ShopCategoryDetailActivity extends BaseActivity {

    @BindView(R.id.rv_shop_category)
    RecyclerView rvShopCategory;
    @BindView(R.id.rv_bedroom)
    RecyclerView rvBedroom;
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    private ShopRecyclerAdapter adapter;
    private BedRoomRecyclerAdapter bedRoomAdapter;

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, ShopCategoryDetailActivity.class);
        return intent;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_category_detail);
        ButterKnife.bind(this, this);
        setSupportActionBar(toolbar);

        adapter = new ShopRecyclerAdapter(this);
        setUpRecyclerView();

        bedRoomAdapter = new BedRoomRecyclerAdapter(this);
        setUpBedRoomAdapter();

    }

    private void setUpBedRoomAdapter() {
        rvBedroom.setHasFixedSize(true);
        CustomGridLayoutManager customGridLayoutManager = new CustomGridLayoutManager(this, 2);
        customGridLayoutManager.setScrollEnabled(false);
        rvBedroom.setLayoutManager(customGridLayoutManager);
        rvBedroom.setAdapter(bedRoomAdapter);
    }

    private void setUpRecyclerView() {
        rvShopCategory.setHasFixedSize(true);
        rvShopCategory.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rvShopCategory.setAdapter(adapter);
    }

    @OnClick(R.id.action_back)
    public void actionBack() {
        onBackPressed();
    }
}
