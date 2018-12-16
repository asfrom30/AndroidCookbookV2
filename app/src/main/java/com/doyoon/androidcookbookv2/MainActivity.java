package com.doyoon.androidcookbookv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.doyoon.androidcookbookv2.apis.recycler.view.SubActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Intent intent =  getSQLiteIntent();
        Intent intent = getViewPagerIntent();
        startActivity(intent);
    }

    private Intent getRecyclerViewIntent() {
        return new Intent(this, SubActivity.class);
    }

    private Intent getRetrofitIntent() {
        return new Intent(this, com.doyoon.androidcookbookv2.libs.retrofit.SubActivity.class);
    }

    private Intent getSQLiteIntent() {
        return new Intent(this, com.doyoon.androidcookbookv2.libs.sqlite.SubActivity.class);
    }

    private Intent getViewPagerIntent() {
        return new Intent(this, com.doyoon.androidcookbookv2.apis.view.pager.SubActivity.class);
    }
}
