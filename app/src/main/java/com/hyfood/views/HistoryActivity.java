package com.hyfood.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.hyfood.Adapter.ChartAdapter;
import com.hyfood.Adapter.HistoryAdapter;
import com.hyfood.R;
import com.hyfood.model.HistoryModel;

import java.util.ArrayList;
import java.util.List;

public class HistoryActivity extends AppCompatActivity {
    RecyclerView rclHistory;
    HistoryAdapter historyAdapter;
    List<HistoryModel> listHistory = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        rclHistory = findViewById(R.id.rcylHistory);

        listHistory.add(new HistoryModel("2021092112","PLACED","0863723232","JALAN KENCANA"));
        listHistory.add(new HistoryModel("2021092112","PLACED","0863723232","JALAN KENCANA"));
        listHistory.add(new HistoryModel("2021092112","PLACED","0863723232","JALAN KENCANA"));
        listHistory.add(new HistoryModel("2021092112","PLACED","0863723232","JALAN KENCANA"));
        setAdapter();
    }

    public void setAdapter() {
        historyAdapter = new HistoryAdapter(listHistory, this);
        rclHistory.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        rclHistory.setAdapter(historyAdapter);
    }
}