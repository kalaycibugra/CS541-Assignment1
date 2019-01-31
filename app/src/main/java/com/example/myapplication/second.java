package com.example.myapplication;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        final FloatingActionButton asd = findViewById(R.id.floatingActionButton3);
        asd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent homePage = new Intent(second.this,MainActivity.class);
                startActivity(homePage);

            }

        });
    }
}
