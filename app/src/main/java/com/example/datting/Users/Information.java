package com.example.datting.Users;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.datting.Model.User_infor;
import com.example.datting.R;

import java.util.ArrayList;

public class Information extends AppCompatActivity {
    ImageView cancel;
    RecyclerView infor_view;
    RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        //Adapter_data();
        cancel = findViewById(R.id.cancel);
        quaylai();
    }
    private void quaylai()
    {
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

}
