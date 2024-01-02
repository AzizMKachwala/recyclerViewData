package com.example.recyclerviewdata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editTextName, editTextRollNo;
    Button addButton, displayButton;
    RecyclerView recyclerView;
    List<DataModel> dataModels;
    NewDataAdapter newDataAdapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextName = findViewById(R.id.editTextName);
        editTextRollNo = findViewById(R.id.editTextRollNo);
        addButton = findViewById(R.id.addButton);
        displayButton = findViewById(R.id.displayButton);
        recyclerView = findViewById(R.id.recyclerView);

        dataModels = new ArrayList<>();
        newDataAdapter = new NewDataAdapter(dataModels);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(newDataAdapter);

    }
    @Override
    public void onClick(View view) {

        newDataAdapter.notifyDataSetChanged();
        Toast.makeText(MainActivity.this, "" + dataModels.size(), Toast.LENGTH_LONG).show();
    }
}