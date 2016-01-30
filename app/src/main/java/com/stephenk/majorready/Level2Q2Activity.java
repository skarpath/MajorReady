package com.stephenk.majorready;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Level2Q2Activity extends AppCompatActivity {


    Button Level2Q2Activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2_q2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Level2Q2Activity = (Button) findViewById(R.id.btnNextL2Q2);
        Level2Q2Activity.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Level2Q2Activity.this, Level2Q3Activity.class);
                startActivity(intent);
            }
        });


    }

}
