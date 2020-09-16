package com.example.datting.BottomNavigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.datting.R;
import com.example.datting.Users.Information;
import com.example.datting.Users.Setting;
import com.example.datting.Users.Setting_Fragments;

public class User_Fragments extends Fragment {

    ImageView setting;
    TextView information;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.user_fragments, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setting = view.findViewById(R.id.settings);
        information = view.findViewById(R.id.information);

        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(getContext(), Setting_Fragments.class);
//                startActivity(intent);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Setting_Fragments()).commit();

            }
        });
        information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), Information.class);
                startActivity(intent);
            }
        });

    }
}
