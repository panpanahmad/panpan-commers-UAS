package com.hyfood.views;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.hyfood.Adapter.ChartAdapter;
import com.hyfood.Adapter.MenuAdapter;
import com.hyfood.R;
import com.hyfood.model.MenuModel;

import java.util.ArrayList;
import java.util.List;

public class ChartActivity extends AppCompatActivity implements ChartAdapter.Listener {
    RecyclerView mRcylChart;
    List<MenuModel> listChart = new ArrayList<>();
    ChartAdapter chartAdapter;
    private String m_Text = "";
    Button btnPlaced;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart);

        mRcylChart = findViewById(R.id.rclChart);
        btnPlaced = findViewById(R.id.btnPlaced);
        listChart.add(new MenuModel("Pizza", 25000, "Pizza sangat enak gaes", 1));
        setAdapter();
        dialogForm();

        btnPlaced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), HistoryActivity.class);
                startActivity(i);
            }
        });
    }

    public void setAdapter() {
        chartAdapter = new ChartAdapter(listChart, this, this);
        mRcylChart.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        mRcylChart.setAdapter(chartAdapter);
    }

    private void dialogForm(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("One more stepp....");

// Set up the input
        final EditText input = new EditText(this);
// Specify the type of input expected; this, for example, sets the input as a password, and will mask the text
        input.setInputType(InputType.TYPE_CLASS_TEXT );
        input.setHint("Enter your address..");
        builder.setView(input);

// Set up the buttons
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                m_Text = input.getText().toString();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        builder.show();
    }

    @Override
    public void detailOnclick(MenuModel data) {

    }
}