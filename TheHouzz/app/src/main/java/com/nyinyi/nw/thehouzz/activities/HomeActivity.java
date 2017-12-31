package com.nyinyi.nw.thehouzz.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.nyinyi.nw.thehouzz.HouzzApp;
import com.nyinyi.nw.thehouzz.R;
import com.nyinyi.nw.thehouzz.adapter.ViewPagerAdapter;
import com.nyinyi.nw.thehouzz.fragments.HomeFragment;
import com.nyinyi.nw.thehouzz.fragments.PhotosFragment;
import com.nyinyi.nw.thehouzz.fragments.ProFragment;
import com.nyinyi.nw.thehouzz.fragments.ShopFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by User on 12/12/2017.
 */

public class HomeActivity extends BaseActivity {

    @BindView(R.id.tabs)
    TabLayout tab;
    @BindView(R.id.viewpager)
    ViewPager viewPager;
    @BindView(R.id.toolbar)
    Toolbar toolbar;


    public static Intent newIntent() {
        Intent intent = new Intent(HouzzApp.getContext(), HomeActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this, this);
        setSupportActionBar(toolbar);


        setUpViewPager(viewPager);
        
        tab.setupWithViewPager(viewPager);
    }

    private void setUpViewPager(ViewPager viewPager) {

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new HomeFragment(), getResources().getString(R.string.home));
        adapter.addFragment(new PhotosFragment(this), getResources().getString(R.string.photos));
        adapter.addFragment(new ShopFragment(this), getResources().getString(R.string.shop));
        adapter.addFragment(new ProFragment(this), getResources().getString(R.string.find_pros));
        adapter.addFragment(new HomeFragment(), getResources().getString(R.string.stories));
        adapter.addFragment(new HomeFragment(), getResources().getString(R.string.advice));
        adapter.addFragment(new HomeFragment(), getResources().getString(R.string.houzz_tv));
        viewPager.setAdapter(adapter);

    }
}
