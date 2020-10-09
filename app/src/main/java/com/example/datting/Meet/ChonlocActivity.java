package com.example.datting.Meet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.crystal.crystalrangeseekbar.interfaces.OnRangeSeekbarChangeListener;
import com.crystal.crystalrangeseekbar.interfaces.OnRangeSeekbarFinalValueListener;
import com.crystal.crystalrangeseekbar.widgets.CrystalRangeSeekbar;
import com.example.datting.R;

public class ChonlocActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chonloc);


        // get seekbar from view

        final CrystalRangeSeekbar rangeSeekbar = (CrystalRangeSeekbar) findViewById(R.id.rangeSeekbar1);
        final CrystalRangeSeekbar rangeSeekbar_khoangcach = (CrystalRangeSeekbar) findViewById(R.id.rangeSeekbar_khoangcach);

        // get min and max text view
        final TextView age_Min = (TextView) findViewById(R.id.textMin1);
        final TextView age_Max = (TextView) findViewById(R.id.textMax1);

        final TextView khoangcach = (TextView) findViewById(R.id.khoangcach);

        // set listener
        rangeSeekbar.setOnRangeSeekbarChangeListener(new OnRangeSeekbarChangeListener() {
            @Override
            public void valueChanged(Number minValue, Number maxValue) {
                age_Min.setText(String.valueOf(minValue));
                age_Max.setText(String.valueOf(maxValue));


            }
        });

        rangeSeekbar_khoangcach.setOnRangeSeekbarChangeListener(new OnRangeSeekbarChangeListener() {
            @Override
            public void valueChanged(Number minValue, Number maxValue) {
                int max = Integer.parseInt(maxValue.toString());
                int min = Integer.parseInt(minValue.toString());

                khoangcach.setText( String.valueOf(max - min));
            }
        });

// set final value listener
        rangeSeekbar.setOnRangeSeekbarFinalValueListener(new OnRangeSeekbarFinalValueListener() {
            @Override
            public void finalValue(Number minValue, Number maxValue) {
                Log.d("CRS=>", String.valueOf(minValue) + " : " + String.valueOf(maxValue));
            }
        });
    }
}
