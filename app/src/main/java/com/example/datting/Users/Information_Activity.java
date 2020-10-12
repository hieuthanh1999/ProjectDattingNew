package com.example.datting.Users;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.datting.Model.User_infor;
import com.example.datting.R;

import java.util.ArrayList;

public class Information_Activity extends AppCompatActivity {
    ImageView cancel;
    TextView user_infor, congviec_hocvan;
    LinearLayout chieucao, canang, ruoubia, hutthuoc, ngonngu;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        anhxa();
        quaylai();
        Activity_Intent();
    }
    private void Activity_Intent()
    {
        congviec_hocvan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent(Information_Activity.this, Work_Activity.class));
            }
        });

        chieucao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent(Information_Activity.this, Height_Activity.class));
            }
        });
        canang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent(Information_Activity.this, Weight_Activity.class));
            }
        });
        hutthuoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent(Information_Activity.this, Alcohol_Activity.class));
            }
        });
        ngonngu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent(Information_Activity.this, Language_Activity.class));
            }
        });
        ruoubia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent(Information_Activity.this, Smoking_Activity.class));
            }
        });

    }
    private  void anhxa()
    {

        chieucao = findViewById(R.id.chieucao);
        canang = findViewById(R.id.cannang);
        ruoubia = findViewById(R.id.ruoubia);
        hutthuoc = findViewById(R.id.hutthuoc);
        ngonngu = findViewById(R.id.ngonngu);

        congviec_hocvan = findViewById(R.id.cong_viec);
        user_infor = findViewById(R.id.name_infor);
        cancel = findViewById(R.id.cancel);
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
