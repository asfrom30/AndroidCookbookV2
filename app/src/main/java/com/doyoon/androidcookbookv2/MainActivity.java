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


        Intent intent = new Intent(this, SubActivity.class);
        startActivity(intent);

    }
}
