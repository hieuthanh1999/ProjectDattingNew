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
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.datting.Model.User_infor;
import com.example.datting.R;
import com.example.datting.Users.Information;
import com.example.datting.Users.Setting;
import com.example.datting.Users.Setting_Fragments;

import java.util.ArrayList;

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

        anhxa(view);


        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(getContext(), Setting_Fragments.class);
//                startActivity(intent);
                Setting_Fragments setting_fragments = new Setting_Fragments();
                //setting_fragments.setA(1);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, setting_fragments).commit();
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
    private void anhxa(View view)
    {

        setting = view.findViewById(R.id.settings);
        information = view.findViewById(R.id.information);


    }

}
