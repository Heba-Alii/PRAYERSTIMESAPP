package com.example.heba.controller;

import android.util.Log;

import com.example.heba.model.pojo.DateRoot;
import com.example.heba.model.pojo.Gregorian;
import com.example.heba.view.home.PrayerTimeCallBack;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AppController {
    PrayerTimeCallBack prayerTimeCallBack;

    public AppController(PrayerTimeCallBack prayerTimeCallBack) {
        this.prayerTimeCallBack = prayerTimeCallBack;
    }

    public void getPrayerTime(int lat, int longitude) {
        Call<DateRoot> call = AppRetrofit.getInstance().getApiInterface().getGregorian(lat, longitude, longitude, 2);
        call.enqueue(new Callback<DateRoot>() {
            @Override
            public void onResponse(Call<DateRoot> call, Response<DateRoot> response) {
                if (response.isSuccessful()) {
                    prayerTimeCallBack.getTime(response.body());
                }
            }

            @Override
            public void onFailure(Call<DateRoot> call, Throwable t) {
                Log.e("TAG", "onFailure: " + t.getMessage());
            }
        });
    }
}
