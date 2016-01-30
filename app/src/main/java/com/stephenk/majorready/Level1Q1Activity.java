package com.stephenk.majorready;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Level1Q1Activity extends AppCompatActivity {
    Spinner sItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1_q1);
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/



        List<String> spinnerArray =  new ArrayList<String>();
        spinnerArray.add("Tall(D)/Short(R)");
        spinnerArray.add("Brown Eyes(D)/Green Eyes(R)");
        spinnerArray.add("Black Hair(D)/Blonde Hair(R)");
        spinnerArray.add("No Hithhiker's Thumb(D)/Hitchhiker's Thumb(R)");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_spinner_item, spinnerArray);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sItems = (Spinner) findViewById(R.id.level1Q1DropDown);
        sItems.setAdapter(adapter);
    }

    public void nextQuestion(View view){
        String selected = sItems.getSelectedItem().toString();
        if (selected.equals("The amount of DNA nucleotides")) {

        }else{
            Toast toast = Toast.makeText(getApplicationContext(),"Incorrect answer",Toast.LENGTH_LONG);
            toast.show();
        }
    }

}
