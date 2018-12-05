package com.doyoon.androidcookbookv2.libs.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface AppServerService {

    @GET("/posts")
    Call<List<SearchResultPojo>> listRepos();
}
