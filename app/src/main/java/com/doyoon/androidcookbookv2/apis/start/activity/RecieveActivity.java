package com.doyoon.androidcookbookv2.apis.start.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.doyoon.androidcookbookv2.utils.Logger;

public class RecieveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        String word = intent.getStringExtra("A");
        Logger.log(word);
    }

}
