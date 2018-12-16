package com.doyoon.androidcookbookv2.libs.retrofit;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.doyoon.androidcookbookv2.utils.Logger;

import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        main();
    }

    private String baseUrl = "https://jsonplaceholder.typicode.com/";

    public void main() {

        // 1. Add dependency first
        // implementation 'com.google.code.gson:gson:2.8.5'
        // implementation 'com.squareup.retrofit2:retrofit:2.5.0'
        // implementation 'com.squareup.retrofit2:converter-gson:2.5.0'

        // 2. Add Internet Permission
        // <uses-permission android:name="android.permission.INTERNET" />

        // 3. Impl Code
        fetchDummyJsonFromHttp();
    }

    private void fetchDummyJsonFromHttp() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        AppServerService service = retrofit.create(AppServerService.class);
        Call<List<SearchResultPojo>> repos = service.listRepos();

        repos.enqueue(new retrofit2.Callback<List<SearchResultPojo>>() {
            @Override
            public void onResponse(Call<List<SearchResultPojo>> call, Response<List<SearchResultPojo>> response) {
                List searchResultPojoList = response.body();

                //TODO: handling when fetch data success
                Logger.log("NETWORK SUCCESS");
                Logger.log(searchResultPojoList.size() + "");
            }

            @Override
            public void onFailure(Call<List<SearchResultPojo>> call, Throwable t) {
                //TODO: handling when fetch data failure
                Logger.log("NETWORK Failure");
            }
        });
    }
}
