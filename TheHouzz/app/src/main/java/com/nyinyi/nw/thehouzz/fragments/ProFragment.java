package com.nyinyi.nw.thehouzz.fragments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nyinyi.nw.thehouzz.R;
import com.nyinyi.nw.thehouzz.adapter.PhotosRecyclerAdapter;
import com.nyinyi.nw.thehouzz.adapter.ProRecyclerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by User on 12/16/2017.
 */
@SuppressLint("ValidFragment")
public class ProFragment extends Fragment {

    @BindView(R.id.rv_pro_view)
    RecyclerView rvProView;

    Context context;

    @SuppressLint("ValidFragment")
    public ProFragment(Context context) {
        this.context = context;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pro,container,false);
        ButterKnife.bind(this,view);
        ProRecyclerAdapter adapter = new ProRecyclerAdapter(context);
        setupRecyclerView(adapter);
        return view;
    }

    private void setupRecyclerView(ProRecyclerAdapter adapter) {
        rvProView.setHasFixedSize(true);
        rvProView.setLayoutManager(new LinearLayoutManager(context));
        rvProView.setAdapter(adapter);
    }


}
