package com.example.itaynoama.todosapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Arrays;
import android.widget.ArrayAdapter;


public class mainActivity extends AppCompatActivity {
    private Button AddTask;
    private ListView listView;
    private ArrayList<String> arrayList;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        listView =  (ListView)findViewById(R.id.listViewTODO);
        String[] items = {"Task1", "Task2", "Task3"};
        arrayList = new ArrayList<String>(Arrays.asList(items));
        adapter = new ArrayAdapter<String>(this, R.layout.listitem, R.id.taskTextView,arrayList);
        listView.setAdapter(adapter);

        AddTask = (Button) findViewById(R.id.addTask);
        AddTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mainActivity.this, CreateTaskActivity.class);
                startActivity(intent);
            }
        });

    }




}
