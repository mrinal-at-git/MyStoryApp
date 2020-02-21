package com.example.mystoryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;



public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    storyAdapter adp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



       String[] titles = getResources().getStringArray(R.array.stories_title);
       String[] contents = getResources().getStringArray(R.array.stories_content);

       recyclerView = findViewById(R.id.recyclerView);
       recyclerView.setLayoutManager(new LinearLayoutManager(this));
       adp = new storyAdapter(this, titles, contents);
       recyclerView.setAdapter(adp);


    }
}
