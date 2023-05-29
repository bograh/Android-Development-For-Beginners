package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private ArrayList<String> items;
    private ArrayAdapter<String> itemsAdapter;
    private ListView todosList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        todosList = (ListView) findViewById(R.id.todosList);
        items = new ArrayList<String>();
        itemsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);

        todosList.setAdapter(itemsAdapter);
        items.add("First Todo Item");
        items.add("Second Todo Item");
        items.add("Third Todo Item");
        items.add("Fourth Todo Item");
        items.add("Fifth Todo Item");
        items.add("Sixth Todo Item");

    }



//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }
}