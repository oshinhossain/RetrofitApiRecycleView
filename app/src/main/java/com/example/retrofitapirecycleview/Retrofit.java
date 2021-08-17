package com.example.retrofitapirecycleview;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.converter.gson.GsonConverterFactory;

public class Retrofit {
    private static String BASE_URL="https://reqres.in/api/";
    static Gson gson =new GsonBuilder()
            .setLenient()
            .create();



    // 2ta retrofit make /2ta variable make
    //2ta variable mode check korar jono je  if retrofit = null hoi then  base url thike data get korbe
//base url thike data ke get korbe
    //then data ke add converter kore dibe odike json ke create kore api ke build korbe dibe


    private  static retrofit2.Retrofit retrofit;
    public static retrofit2.Retrofit getRetrofit() {

        if(retrofit == null ) {

            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
