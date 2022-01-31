package com.hyfood.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hyfood.R;
import com.hyfood.model.MenuModel;

import java.util.List;

public class ChartAdapter extends RecyclerView.Adapter<ChartAdapter.MyViewHolder> {
    final List<MenuModel> listItem;
    final Context context;

    private Listener mListener;

    public interface Listener {
        void detailOnclick(MenuModel data);
    }
    public ChartAdapter(List<MenuModel> listItem, Context context,Listener mListener) {
        this.listItem = listItem;
        this.context = context;
        this.mListener = mListener;
    }

    @NonNull
    @Override
    public ChartAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new ChartAdapter.MyViewHolder(myView);
    }

    @Override
    public void onBindViewHolder(@NonNull ChartAdapter.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return listItem.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
