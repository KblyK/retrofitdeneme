package com.kubilaykocabal.android.retrofitdeneme;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("search/users")
    Call<User> getGithubUser(@Query("q") String name);
}
