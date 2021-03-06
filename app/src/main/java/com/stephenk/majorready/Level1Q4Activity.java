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

public class Level1Q4Activity extends AppCompatActivity {

    Spinner sItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1_q4);

        List<String> spinnerArray =  new ArrayList<String>();
        spinnerArray.add("Dominant Frequency ^2");
        spinnerArray.add("2 * Dominant Frequency * Recessive Frequency");
        spinnerArray.add("Recessive Frequency ^2");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_spinner_item, spinnerArray);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sItems = (Spinner) findViewById(R.id.lvl1q4spinner);
        sItems.setAdapter(adapter);

        sItems.setSelection(0);
    }

    public void Lvl1Q4nextBtn(View view){
        String selected = sItems.getSelectedItem().toString();
       if (selected.equals("Dominant Frequency ^2")) {
            Intent intent = new Intent(this, Level1Q5Activity.class);
            startActivity(intent);
        }else{
            Toast toast = Toast.makeText(getApplicationContext(),"Incorrect answer",Toast.LENGTH_LONG);
            toast.show();
        }
    }
}
