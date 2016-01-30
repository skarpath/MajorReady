package com.stephenk.majorready;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Level2Q1Activity extends AppCompatActivity {

    private Spinner spinner;
    private Spinner spinner2;
    private Spinner spinner3;
    private Spinner spinner4;
    private Spinner spinner5;

    private void updateText(){
        TextView pTextView = (TextView) findViewById(R.id.liveDnaPreviewText);
        String temp = spinner.getSelectedItem().toString() + spinner2.getSelectedItem().toString() + spinner3.getSelectedItem().toString() + spinner4.getSelectedItem().toString() + spinner5.getSelectedItem().toString();
        String finalTemp = "";
        for(int i = 0; i<15; i++) {
            char aChar = temp.charAt(i);
            finalTemp = finalTemp + aChar;
            if(i != 15) {
                finalTemp = finalTemp + "  ";
            }
        }

        pTextView.setText(finalTemp);
    }
    private View.OnTouchListener Spinner_OnTouch = new View.OnTouchListener() {
        public boolean onTouch(View v, MotionEvent event) {

            if (event.getAction() == MotionEvent.ACTION_UP) {
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        updateText();
                    }
                }, 1500);
            }
            return false;
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2_q1);


        spinner = (Spinner) findViewById(R.id.level2Q1Spinner1);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.geneFirst, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        spinner2 = (Spinner) findViewById(R.id.level2Q1Spinner2);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.geneMiddle, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner2.setAdapter(adapter2);

        spinner3 = (Spinner) findViewById(R.id.level2Q1Spinner3);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.geneMiddle, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner3.setAdapter(adapter3);

        spinner4 = (Spinner) findViewById(R.id.level2Q1Spinner4);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this, R.array.geneMiddle, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner4.setAdapter(adapter3);

        spinner5 = (Spinner) findViewById(R.id.level2Q1Spinner5);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(this, R.array.geneEnd, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner5.setAdapter(adapter5);





        updateText();
        spinner.setOnTouchListener(Spinner_OnTouch);
        spinner2.setOnTouchListener(Spinner_OnTouch);
        spinner3.setOnTouchListener(Spinner_OnTouch);
        spinner4.setOnTouchListener(Spinner_OnTouch);
        spinner5.setOnTouchListener(Spinner_OnTouch);
    }

    public void Lvl2q1nextBtn(View view){
        String temp = spinner.getSelectedItem().toString() + spinner2.getSelectedItem().toString() + spinner3.getSelectedItem().toString() + spinner4.getSelectedItem().toString() + spinner5.getSelectedItem().toString();
        Data.dnaSeq = temp;
        Intent intent = new Intent(this, Level2Q2Activity.class);
        startActivity(intent);
    }

}
