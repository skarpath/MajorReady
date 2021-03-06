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

public class Level1Q3Activity extends AppCompatActivity {

    Spinner sItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1_q3);

        List<String> spinnerArray =  new ArrayList<String>();
        spinnerArray.add("p + 1");
        spinnerArray.add("1 - p");
        spinnerArray.add("p^2");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_spinner_item, spinnerArray);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sItems = (Spinner) findViewById(R.id.Lvl1q3spinner);
        sItems.setAdapter(adapter);

        sItems.setSelection(1);
    }

    public void Lvl1Q3nextBtn(View view){
        String selected = sItems.getSelectedItem().toString();
        if (selected.equals("1 - p")) {
            Intent intent = new Intent(this, Level1Q4Activity.class);
            startActivity(intent);
       }else{
            Toast toast = Toast.makeText(getApplicationContext(),"Incorrect answer",Toast.LENGTH_LONG);
            toast.show();
        }
    }
}
