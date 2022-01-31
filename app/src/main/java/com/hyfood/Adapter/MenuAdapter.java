package com.hyfood.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.hyfood.R;
import com.hyfood.model.MenuModel;

import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MyViewHolder> {
    final List<MenuModel> listMenu;
    final Context context;
    private Listener mListener;

    public interface Listener {
        void detailOnclick(MenuModel data);
    }

    public MenuAdapter(List<MenuModel> listMenu, Context context, Listener mListener) {
        this.listMenu = listMenu;
        this.context = context;
        this.mListener = mListener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_menu, parent, false);
        return new MyViewHolder(myView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.cardMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.detailOnclick(listMenu.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listMenu.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ConstraintLayout cardMenu;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            cardMenu = itemView.findViewById(R.id.cardListMenu);
        }
    }
}
