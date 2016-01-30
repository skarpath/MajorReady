package com.stephenk.majorready;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Level2Q3Activity extends AppCompatActivity {

    Spinner sItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2_q3);

        List<String> spinnerArray =  new ArrayList<String>();
        spinnerArray.add("25 mRNA nucleotides");
        spinnerArray.add("The amount of DNA nucleotides");
        spinnerArray.add("5 less than the DNA nucleotides");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_spinner_item, spinnerArray);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sItems = (Spinner) findViewById(R.id.lvl2q3spinner);
        sItems.setAdapter(adapter);
    }

    public void nextQuestion(View view){
        String selected = sItems.getSelectedItem().toString();
        if (selected.equals("The amount of DNA nucleotides")) {
            Intent intent = new Intent(this, Level2Q4Activity.class);
            startActivity(intent);
        }else{
            Toast toast = Toast.makeText(getApplicationContext(),"Incorrect answer",Toast.LENGTH_LONG);
            toast.show();
        }
    }
}
