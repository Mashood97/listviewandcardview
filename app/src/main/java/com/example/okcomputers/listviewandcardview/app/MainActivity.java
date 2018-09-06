package com.example.okcomputers.listviewandcardview.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.okcomputers.listviewandcardview.R;
import com.example.okcomputers.listviewandcardview.adapter.ModelAdapter;
import com.example.okcomputers.listviewandcardview.model.List_Details;
import com.example.okcomputers.listviewandcardview.model.Model;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

 private    ListView listView ;
    private ArrayList<Model> models;
    private  ModelAdapter movieAdaper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.list_view);
        models = List_Details.getlist();

        movieAdaper = new ModelAdapter(MainActivity.this,models);
        listView.setAdapter(movieAdaper);
    }
}
