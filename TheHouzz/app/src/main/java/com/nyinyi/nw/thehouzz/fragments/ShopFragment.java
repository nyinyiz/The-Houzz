package com.nyinyi.nw.thehouzz.fragments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nyinyi.nw.thehouzz.R;
import com.nyinyi.nw.thehouzz.adapter.ShopRecyclerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by User on 12/13/2017.
 */

@SuppressLint("ValidFragment")
public class ShopFragment extends Fragment {

    @BindView(R.id.rv_shop)
    RecyclerView rvShop;

    Context context;

    public ShopFragment(Context context) {
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_shop,container,false);
        ButterKnife.bind(this,view);
        ShopRecyclerAdapter adapter = new ShopRecyclerAdapter(context);
        setUpRecyclerView(adapter);
        return view;
    }

    private void setUpRecyclerView(ShopRecyclerAdapter adapter) {
        rvShop.setHasFixedSize(true);
        rvShop.setLayoutManager(new GridLayoutManager(context,3));
        rvShop.setAdapter(adapter);
    }
}
