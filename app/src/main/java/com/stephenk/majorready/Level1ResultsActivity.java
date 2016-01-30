package com.stephenk.majorready;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Level1ResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1_results);

        TextView pTextView = (TextView) findViewById(R.id.pTextView);
        pTextView.setText("p = "+Data.p);
    }

    public void Level2Btn(View view){
        Intent intent = new Intent(this, Level2Q1Activity.class);
        startActivity(intent);
    }

    public void Level2Btn2(View view){
        Intent intent = new Intent(this, ConnectionResources.class);
        startActivity(intent);
    }

}
