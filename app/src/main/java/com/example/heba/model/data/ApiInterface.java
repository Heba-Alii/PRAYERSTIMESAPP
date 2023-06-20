package com.example.heba.model.data;

import com.example.heba.model.pojo.DateRoot;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("calendar/2023/6")
    Call<DateRoot> getGregorian(@Query("latitude") int latitude, @Query("longitude%20") int longitude, @Query("longitude") int longitude2, @Query("method") int method);
}
