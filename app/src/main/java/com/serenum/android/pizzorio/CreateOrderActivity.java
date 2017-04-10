package com.serenum.android.pizzorio;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by Serenum on 10.04.2017.
 */

public class CreateOrderActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedOnInstanceState) {
        super.onCreate(savedOnInstanceState);
        setContentView(R.layout.create_order);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}
