package com.example.heba.controller;

import com.example.heba.model.data.ApiInterface;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AppRetrofit {
    private static final String BASE_URL = "https://api.aladhan.com/v1/";
    private ApiInterface apiInterface;
    public static AppRetrofit instance;

    public AppRetrofit() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
                .build();
        apiInterface = retrofit.create(ApiInterface.class);
    }

    public static AppRetrofit getInstance() {
        if (instance == null) {
            instance = new AppRetrofit();
        }
        return instance;
    }

    public ApiInterface getApiInterface() {
        return apiInterface;
    }
}
