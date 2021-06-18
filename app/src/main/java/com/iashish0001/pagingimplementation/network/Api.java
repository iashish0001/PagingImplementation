package com.iashish0001.pagingimplementation.network;
import com.iashish0001.pagingimplementation.model.StackApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface Api {
    @Headers({"Client-Service: Appx",
            "Auth-Key: appxapi",
            "User-ID: 1"})
    @GET("test_titlebycourseidv2")
    Call<StackApiResponse> getAnswers(@Query("start") int start, @Query("courseid") int courseid, @Query("userid") int userid);
}
