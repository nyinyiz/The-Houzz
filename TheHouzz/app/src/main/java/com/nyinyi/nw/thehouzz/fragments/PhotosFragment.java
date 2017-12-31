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
import com.nyinyi.nw.thehouzz.adapter.PhotosRecyclerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by User on 12/12/2017.
 */

@SuppressLint("ValidFragment")
public class PhotosFragment extends Fragment {

    @BindView(R.id.rv_view)
    RecyclerView rvView;

    Context context;

    public PhotosFragment(Context context) {
        this.context = context;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_photos,container,false);
        ButterKnife.bind(this,view);
        PhotosRecyclerAdapter adapter = new PhotosRecyclerAdapter(context);
        setupRecyclerView(adapter);
        return view;
    }

    private void setupRecyclerView(PhotosRecyclerAdapter adapter) {
        rvView.setHasFixedSize(true);
        rvView.setLayoutManager(new GridLayoutManager(context,2));
        rvView.setAdapter(adapter);
    }

}
