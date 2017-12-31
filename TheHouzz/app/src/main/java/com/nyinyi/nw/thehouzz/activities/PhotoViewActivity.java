package com.nyinyi.nw.thehouzz.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;

import com.agsw.FabricView.FabricView;
import com.nyinyi.nw.thehouzz.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by user on 12/26/17.
 */

public class PhotoViewActivity extends BaseActivity {


    @BindView(R.id.fabric_view)
    FabricView mFabricView;

    public static Intent newIntent(Context context)
    {
        Intent intent = new Intent(context,PhotoViewActivity.class);
        return intent;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_view);

        ButterKnife.bind(this,this);
        mFabricView.setColor(R.drawable.home1);

    }
}
