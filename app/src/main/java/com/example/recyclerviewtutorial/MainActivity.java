package com.example.recyclerviewtutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Display;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ArrayList<Model> list;
    NamesAdapter namesAdapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.names_recyclerView);

        list = new ArrayList<>();

        list.add(new Model(R.drawable.ic_image1,"Disables","Handicapped"));
        list.add(new Model(R.drawable.ic_baseline_account_box_24,"User","User PRofile"));
        list.add(new Model(R.drawable.ic_baseline_emoji_people_24,"Emoji","This is a Emoji"));
        list.add(new Model(R.drawable.ic_image1,"Disables","Handicapped"));
        list.add(new Model(R.drawable.ic_baseline_account_box_24,"User","User PRofile"));
        list.add(new Model(R.drawable.ic_baseline_emoji_people_24,"Emoji","This is a Emoji"));
        list.add(new Model(R.drawable.ic_image1,"Disables","Handicapped"));
        list.add(new Model(R.drawable.ic_baseline_account_box_24,"User","User PRofile"));
        list.add(new Model(R.drawable.ic_baseline_emoji_people_24,"Emoji","This is a Emoji"));
        list.add(new Model(R.drawable.ic_image1,"Disables","Handicapped"));
        list.add(new Model(R.drawable.ic_baseline_account_box_24,"User","User PRofile"));
        list.add(new Model(R.drawable.ic_baseline_emoji_people_24,"Emoji","This is a Emoji"));
        list.add(new Model(R.drawable.ic_image1,"Disables","Handicapped"));
        list.add(new Model(R.drawable.ic_baseline_account_box_24,"User","User PRofile"));
        list.add(new Model(R.drawable.ic_baseline_emoji_people_24,"Emoji","This is a Emoji"));
        list.add(new Model(R.drawable.ic_baseline_people_24,"People","This is a Prople"));
        list.add(new Model(R.drawable.ic_baseline_people_24,"People","This is a Prople"));
        list.add(new Model(R.drawable.ic_baseline_people_24,"People","This is a Prople"));


        namesAdapter = new NamesAdapter(list,this);
        recyclerView.setAdapter(namesAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}