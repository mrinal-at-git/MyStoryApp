package com.example.mystoryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    TextView detail_title, detail_content;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

       detail_title = findViewById(R.id.story_title);
       detail_content = findViewById(R.id.story_content);

        Intent i = getIntent();
        String z = i.getStringExtra("content");
        detail_title.setText(i.getStringExtra("title"));
        detail_content.setText(z);
        detail_content.setMovementMethod(new ScrollingMovementMethod());


    }
}
