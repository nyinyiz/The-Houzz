package com.nyinyi.nw.thehouzz.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.nyinyi.nw.thehouzz.R;

import butterknife.BindView;

/**
 * Created by User on 12/16/2017.
 */

public class ViewProductActivity extends BaseActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, ViewProductActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_product);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_share_and_add_to_cart, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                break;
            case R.id.action_share:
                return true;
            case R.id.action_add_to_cart:
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
