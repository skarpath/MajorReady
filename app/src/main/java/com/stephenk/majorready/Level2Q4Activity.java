package com.stephenk.majorready;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Level2Q4Activity extends AppCompatActivity {

    Spinner sItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2_q4);

        List<String> spinnerArray =  new ArrayList<String>();
        spinnerArray.add("A new protein");
        spinnerArray.add("The same number of ribosomes");
        spinnerArray.add("Its complementary DNA nucleotide base");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_spinner_item, spinnerArray);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sItems = (Spinner) findViewById(R.id.Lvl2q4spinner);
        sItems.setAdapter(adapter);
    }

    public void finishBtn(View view){
        String selected = sItems.getSelectedItem().toString();
        if (selected.equals("Its complementary DNA nucleotide base")) {
            Intent intent = new Intent(this, Level2ResultsActivity.class);
            startActivity(intent);
        }else{
            Toast toast = Toast.makeText(getApplicationContext(),"Incorrect answer",Toast.LENGTH_LONG);
            toast.show();
        }
    }
}
