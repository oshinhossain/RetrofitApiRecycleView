package com.example.retrofitapirecycleview;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("users")
    Call<pojo> getData();
}
