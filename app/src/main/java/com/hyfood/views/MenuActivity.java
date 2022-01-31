package com.hyfood.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;

import com.hyfood.Adapter.MenuAdapter;
import com.hyfood.R;
import com.hyfood.model.MenuModel;

import java.util.ArrayList;
import java.util.List;

public class MenuActivity extends AppCompatActivity implements MenuAdapter.Listener {

    RecyclerView mRcylMenu;
    List<MenuModel> listMenu = new ArrayList<>();
    private MenuAdapter menuAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        mRcylMenu =findViewById(R.id.rcyMenu);

        listMenu.add(new MenuModel("Pizza",25000,"Pizza sangat enak gaes",0));
        listMenu.add(new MenuModel("Pizza",25000,"Pizza sangat enak gaes",0));
        listMenu.add(new MenuModel("Pizza",25000,"Pizza sangat enak gaes",0));
        listMenu.add(new MenuModel("Pizza",25000,"Pizza sangat enak gaes",0));
        listMenu.add(new MenuModel("Pizza",25000,"Pizza sangat enak gaes",0));
        listMenu.add(new MenuModel("Pizza",25000,"Pizza sangat enak gaes",0));

        setAdapter();
    }

    public void setAdapter() {
        menuAdapter = new MenuAdapter(listMenu, this, this);
        mRcylMenu.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        mRcylMenu.setAdapter(menuAdapter);
    }

    @Override
    public void detailOnclick(MenuModel data) {
        Intent i = new Intent(this, DetailMenuActivity.class);
        startActivity(i);
    }
}