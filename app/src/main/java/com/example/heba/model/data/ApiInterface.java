package com.example.heba.model.data;

import com.example.heba.model.pojo.Gregorian;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("calendar/:year/:month")
    Call<Gregorian> getGregorian(@Query("year") int year, @Query("month") int month);
}
