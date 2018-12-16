package com.doyoon.androidcookbookv2.apis.start.activity;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {
    // Start Other Activity

    public void main() {
        Intent intent = new Intent(this, SubActivity.class);
        intent.putExtra("A", "ASDF");
        startActivity(intent);
    }

    // Pass Object not string
}
