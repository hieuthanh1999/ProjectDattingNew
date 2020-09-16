package com.example.datting.Users;

import android.animation.Animator;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.datting.BottomNavigation.User_Fragments;
import com.example.datting.R;

public class Setting_Fragments extends Fragment {
    ImageView cancel;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_setting, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        cancel = view.findViewById(R.id.cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new User_Fragments()).addToBackStack(null).commit();

            }
        });

    }

}
