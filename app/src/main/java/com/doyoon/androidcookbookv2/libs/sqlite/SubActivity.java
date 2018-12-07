package com.doyoon.androidcookbookv2.libs.sqlite;

import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.doyoon.androidcookbookv2.utils.Logger;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        main();
    }

    public void main() {
        // below code is ship an application with a exist database
        // https://stackoverflow.com/questions/9109438/how-to-use-an-existing-database-with-an-android-application
        // https://stackoverflow.com/questions/513084/ship-an-application-with-a-database

        // 1. prepare and locate file `{databaseName}.db` or `{databaseName}.sqlite` in `app/src/main/assets`
        //  -. not res folder. assets folder.

        this.getApplicationContext().deleteDatabase("2");

        // 2. impl code
        TestAdapter mDbHelper = new TestAdapter(getBaseContext());
        mDbHelper.createDatabase();
        mDbHelper.open();

        Cursor testdata = mDbHelper.getTestData();
        Logger.log(testdata.getCount()+ "should be 2");
    }
}
