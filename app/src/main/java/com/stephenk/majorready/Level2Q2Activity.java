package com.stephenk.majorready;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

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


        Spinner spinner1 = (Spinner) findViewById(R.id.L2Q2Spinner1);
        Spinner spinner2 = (Spinner) findViewById(R.id.L2Q2Spinner2);
        Spinner spinner3 = (Spinner) findViewById(R.id.L2Q2Spinner3);
        Spinner spinner4 = (Spinner) findViewById(R.id.L2Q2Spinner4);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.nucleotides, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner1.setAdapter(adapter);
        spinner2.setAdapter(adapter);
        spinner3.setAdapter(adapter);
        spinner4.setAdapter(adapter);


    }

}
