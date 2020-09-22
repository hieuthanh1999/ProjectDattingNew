package com.example.datting.Home.Home;


import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.datting.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.zip.Inflater;

public class Button_Sheets_dialog extends BottomSheetDialogFragment {

    public static Button_Sheets_dialog newInstance() {

        Bundle args = new Bundle();

        Button_Sheets_dialog fragment = new Button_Sheets_dialog();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.item_sheets_dialog, container, false);
    }



}
