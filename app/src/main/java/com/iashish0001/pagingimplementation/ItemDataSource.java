package com.iashish0001.pagingimplementation;


import android.util.Log;

import androidx.annotation.NonNull;
import androidx.paging.PageKeyedDataSource;

import com.iashish0001.pagingimplementation.model.Item;
import com.iashish0001.pagingimplementation.model.StackApiResponse;
import com.iashish0001.pagingimplementation.network.RetrofitClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ItemDataSource  extends PageKeyedDataSource<Integer , Item> {
    private static final String TAG = "ItemDataSource";
   public static final int Page =1;
    private static final int course_id = 1;
    private static final int user = 1;


                            @Override
                            public void loadInitial(@NonNull PageKeyedDataSource.LoadInitialParams<Integer> params, @NonNull  PageKeyedDataSource.LoadInitialCallback<Integer, Item> callback) {
                                RetrofitClient.getInstance()
                                        .getApi().getAnswers(-1 , 1 ,1)
                                        .enqueue(new Callback<StackApiResponse>() {
                                            @Override
                                            public void onResponse(Call<StackApiResponse> call, Response<StackApiResponse> response) {
                                                Log.d(TAG, "onResponse: called " + response.code());
                                                if(response.body() != null){

                                                    Log.d(TAG, "onResponse: Called" + response.body().getTest_titles());
                                                    Log.d(TAG, "onResponse: Called" + response.body().getTest_titles().size());
                                                    callback.onResult(response.body().getTest_titles() ,null ,Page+1);

                        }else {
                                                    Log.d(TAG, "onResponse: response body null "  + " " + response.raw().toString());
                                                }
                    }

                    @Override
                    public void onFailure(Call<StackApiResponse> call, Throwable t) {
                        Log.d(TAG, "onFailure: Failed!" + t.getLocalizedMessage());
                    }
                });

    }

    @Override
    public void loadBefore(@NonNull  PageKeyedDataSource.LoadParams<Integer> params, @NonNull  PageKeyedDataSource.LoadCallback<Integer, Item> callback) {

                                RetrofitClient.getInstance()
                                        .getApi().getAnswers(-1, course_id ,user)
                                        .enqueue(new Callback<StackApiResponse>() {
                                            @Override
                                            public void onResponse(Call<StackApiResponse> call, Response<StackApiResponse> response) {
                                                Integer adjacentKey = (params.key > 1) ? params.key - 1 : null;
                                                if (response.body() != null) {


                                                    callback.onResult(response.body().getTest_titles(), adjacentKey);
                                                }
                                            }

                                            @Override
                                            public void onFailure(Call<StackApiResponse> call, Throwable t) {
                                                Log.d(TAG, "onFailure: Failed2 !" + t.getLocalizedMessage());
                                            }
                                        });
    }

    @Override
    public void loadAfter(@NonNull PageKeyedDataSource.LoadParams<Integer> params, @NonNull  PageKeyedDataSource.LoadCallback<Integer, Item> callback) {

        RetrofitClient.getInstance()
                .getApi()
                .getAnswers(-1, course_id ,user)
                .enqueue(new Callback<StackApiResponse>() {
                    @Override
                    public void onResponse(Call<StackApiResponse> call, Response<StackApiResponse> response) {

                        if (response.body() != null) {

                            Integer key = response.body().getTest_titles().size() >= Page ? params.key + 1 : null;

                            callback.onResult(response.body().getTest_titles(), key);
                        }
                    }

                    @Override
                    public void onFailure(Call<StackApiResponse> call, Throwable t) {

                    }
                    });
                            }}

