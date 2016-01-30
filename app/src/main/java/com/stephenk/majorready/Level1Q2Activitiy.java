package com.stephenk.majorready;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class Level1Q2Activitiy extends AppCompatActivity {

    double pop;
    SeekBar seekBar;
    TextView pvalue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1_q2_activitiy);
        seekBar = (SeekBar) findViewById(R.id.Lvl1Q2seekbar);
        pvalue = (TextView) findViewById(R.id.Lvl1q2pvaluetxt);

        pvalue.setText("p= " + seekBar.getProgress() + "%");

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progress = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progresValue, boolean fromUser) {
                progress = progresValue;
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                pvalue.setText("p= " + seekBar.getProgress() + "%");
                pop = seekBar.getProgress();
            }
        });
    }

    public void nextBtn(View view){

    }
}
