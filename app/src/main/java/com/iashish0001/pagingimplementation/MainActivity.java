package com.iashish0001.pagingimplementation;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.iashish0001.pagingimplementation.adapter.ItemAdapter;
import com.iashish0001.pagingimplementation.model.Item;
import com.iashish0001.pagingimplementation.model.StackApiResponse;
import com.iashish0001.pagingimplementation.network.RetrofitClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.iashish0001.pagingimplementation.ItemDataSource.Page;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        ItemViewModel itemViewModel = ViewModelProviders.of(this).get(ItemViewModel.class);

        //creating the Adapter
        final ItemAdapter adapter = new ItemAdapter(this);


        //observing the itemPagedList from view model
        itemViewModel.itemPagedList.observe(this, new Observer<PagedList<Item>>() {
            @Override
            public void onChanged(@Nullable PagedList<Item> items) {

                //in case of any changes
                //submitting the items to adapter
                adapter.submitList(items);
            }
        });


//        RetrofitClient.getInstance()
//                .getApi().getAnswers(-1, 1, 1)
//                .enqueue(new Callback<StackApiResponse>() {
//                    @Override
//                    public void onResponse(Call<StackApiResponse> call, Response<StackApiResponse> response) {
//                        Log.d(TAG, "onResponse: called " + response.code());
//                        if (response.body() != null) {
//                            Log.d(TAG, "onResponse: called" + response.body());
//
//
//
//
//                        } else {
//                            Log.d(TAG, "onResponse: response body null " + " " + response.raw().toString());
//                        }
//                    }
//
//                    @Override
//                    public void onFailure(Call<StackApiResponse> call, Throwable t) {
//                        t.printStackTrace();
//                        Log.d(TAG, "onFailure: " + call.request().headers());
//                        Log.d(TAG, "onFailure: " + call.request().url());
//                        Log.d(TAG, "onFailure: Called NULL"  + t.getMessage() +  "\n" + t.getLocalizedMessage());
//                    }
//                });
    }}