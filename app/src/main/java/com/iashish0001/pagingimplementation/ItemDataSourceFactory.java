package com.iashish0001.pagingimplementation;


import androidx.lifecycle.MutableLiveData;
import androidx.paging.DataSource;
import androidx.paging.PageKeyedDataSource;

import com.iashish0001.pagingimplementation.model.Item;

public class ItemDataSourceFactory  extends DataSource.Factory {

    private MutableLiveData<PageKeyedDataSource<Integer, Item>> itemLiveDataSource = new MutableLiveData<>();


    @Override
    public DataSource<Integer , Item> create() {
        ItemDataSource itemDataSource = new ItemDataSource();


        itemLiveDataSource.postValue(itemDataSource);


        return itemDataSource;
    }

    public MutableLiveData<PageKeyedDataSource<Integer, Item>> getItemLiveDataSource() {
        return itemLiveDataSource;
    }
}
