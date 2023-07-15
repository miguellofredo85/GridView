package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);
//Data displayed on gridView

        ArrayList<ModelClass> modelClassArrayList = new ArrayList<ModelClass>();
        modelClassArrayList.add(new ModelClass(R.drawable.course1, "alsarmendia papalau"));
        modelClassArrayList.add(new ModelClass(R.drawable.course2, "alsarmendia papalau"));
        modelClassArrayList.add(new ModelClass(R.drawable.course3, "alsarmendia papalau"));
        modelClassArrayList.add(new ModelClass(R.drawable.course4, "alsarmendia papalau"));
//Attach adapter
        MyAdapter myAdapter = new MyAdapter(this, modelClassArrayList);
        gridView.setAdapter(myAdapter);

    }
}