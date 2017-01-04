package com.kubilaykocabal.android.retrofitdeneme;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by user on 30.12.2016.
 */

public class RetroClient {
    private static final String ROOT_URL="https://api.github.com/";

    private static Retrofit getRetrofitInstance(){
        Retrofit rf = new Retrofit.Builder().baseUrl(ROOT_URL).addConverterFactory(GsonConverterFactory.create()).build();
        return rf;
    }

    public static ApiService getApiService(){
        ApiService api = getRetrofitInstance().create(ApiService.class);
        return api;
    }
}
