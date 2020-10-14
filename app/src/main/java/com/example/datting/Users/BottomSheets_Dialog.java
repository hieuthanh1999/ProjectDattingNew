package com.example.datting.Users;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.datting.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class BottomSheets_Dialog extends BottomSheetDialogFragment {

    RadioButton radio_1, radio_2, radio_3, radio_4;
    RadioGroup radioGroup;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_bottom_sheets__user_, container, false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        radio_1 = view.findViewById(R.id.radio_1);
//        radio_2 = view.findViewById(R.id.radio_2);
//        radio_3 = view.findViewById(R.id.radio_3);
//        radio_4 = view.findViewById(R.id.radio_4);
          radioGroup = view.findViewById(R.id.radio_group);

          radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
              @Override
              public void onCheckedChanged(RadioGroup group, int checkedId) {
                  switch (checkedId)
                  {
                      case R.id.radio_1:
                          //Toast.makeText(this, "c", Toast.LENGTH_SHORT).show();
                          break;



                  }
              }
          });


    }








}
