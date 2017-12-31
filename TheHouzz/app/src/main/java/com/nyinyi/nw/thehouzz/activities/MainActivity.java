package com.nyinyi.nw.thehouzz.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.nyinyi.nw.thehouzz.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @BindView(R.id.btn_start)
    TextView btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this, this);

    }

    @OnClick(R.id.btn_start)
    public void getStartHome() {
        Intent intent = HomeActivity.newIntent();
        startActivity(intent);
    }
}
