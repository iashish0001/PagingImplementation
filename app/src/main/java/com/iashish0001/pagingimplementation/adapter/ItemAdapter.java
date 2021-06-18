package com.iashish0001.pagingimplementation.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.paging.PagedListAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.iashish0001.pagingimplementation.R;
import com.iashish0001.pagingimplementation.model.Item;

public class ItemAdapter extends PagedListAdapter<Item, ItemAdapter.ItemViewHolder>{


    private Context mCtx;

    public ItemAdapter(Context mCtx) {
        super(DIFF_CALLBACK);
        this.mCtx = mCtx;
    }

  private static  DiffUtil.ItemCallback<Item> DIFF_CALLBACK =
          new DiffUtil.ItemCallback<Item>() {
              @Override
              public boolean areItemsTheSame( Item oldItem, Item newItem) {
                  return oldItem.getId() == newItem.getId();
              }


              @SuppressLint("DiffUtilEquals")
              @Override
              public boolean areContentsTheSame( Item oldItem,  Item newItem) {
                  return oldItem.equals(newItem);
              }
          };


    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view = LayoutInflater.from(mCtx).inflate(R.layout.recyclerview_users,parent,false);
       return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemAdapter.ItemViewHolder holder, int position) {
        Item item = getItem(position);

        if (item != null) {
            holder.textView.setText(item.getTitle());
            holder.textView1.setText(item.getId());

        }else{
            Toast.makeText(mCtx, "Item is null", Toast.LENGTH_LONG).show();
        }

    }

    class ItemViewHolder extends RecyclerView.ViewHolder{
        TextView textView , textView1;

        public ItemViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textViewName);
            textView1 = itemView.findViewById(R.id.idName);
        }
    }
}