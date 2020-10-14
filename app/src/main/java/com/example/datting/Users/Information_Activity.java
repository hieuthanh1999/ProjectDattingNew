package com.example.datting.Users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.datting.R;

public class Information_Activity extends AppCompatActivity {
    ImageView cancel;
    TextView user_infor;
    LinearLayout chieucao, cannang, ruoubia, hutthuoc, ngonngu;
    TextView cong_viec, hoc_van, ve_ban, height_txt, weight_txt,  bottom_sheets;
    int  check_height, check_working, check_about, check_weight;
    String height, weight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        anhxa();
        quaylai();
        Activity_Intent();
        Cong_Viec();
        About_Me();
        setHeight_txt();
        setWeight_txt();
        bottom_sheets();

    }

    private void bottom_sheets()
    {
        bottom_sheets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheets_Dialog b = new BottomSheets_Dialog();
                b.show(getSupportFragmentManager(), "Bottom_sheets");
            }
        });
    }

    private  void setWeight_txt()
    {
        Intent intent = getIntent();
        check_weight = intent.getIntExtra("check_weight", 0);
        weight = intent.getStringExtra("weight");
        if(check_weight == 1)
        {
            weight_txt.setText(weight + " kg");
        }
        if(check_weight == 0) {
            weight_txt.setText("60 kg");
        }
    }
    private void setHeight_txt()
    {
        Intent intent = getIntent();
        check_height = intent.getIntExtra("check_height", 0);
        height = intent.getStringExtra("height");
        if(check_height == 1)
        {
            height_txt.setText(height + " cm");
        }
        if(check_height == 0) {
            height_txt.setText("180 cm");
        }
    }

    private void Cong_Viec() {

        Intent intent = getIntent();
        check_working = intent.getIntExtra("check_working", 0);
        if (check_working == 1) {

            cong_viec.setText(intent.getStringExtra("congviec"));
            cong_viec.setTextColor(Color.parseColor("#747474"));

            hoc_van.setText(intent.getStringExtra("congty"));
            hoc_van.setTextColor(Color.parseColor("#747474"));
        }
       if(check_working == 0)
       {
           cong_viec.setText(" Thêm ");
           hoc_van.setText(" ");
       }
    }
    private void About_Me()
    {
        Intent intent = getIntent();
        check_about = intent.getIntExtra("check_about", 0);
        if (check_about == 1) {

            ve_ban.setText(intent.getStringExtra("about_me"));
            ve_ban.setTextColor(Color.parseColor("#747474"));

        }
        if(check_about == 0) {
            ve_ban.setText("Giới thiệu thông tin về bạn.");
        }
    }

    private void Activity_Intent() {
        cong_viec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Information_Activity.this, Working_Activity.class));
            }
        });
        ve_ban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Information_Activity.this, AboutMe_Activity.class));
            }
        });
        chieucao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Information_Activity.this, Height_Activity.class));
            }
        });
        cannang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Information_Activity.this, Weight_Activity.class));
            }
        });
        hutthuoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Information_Activity.this, Alcohol_Activity.class));
            }
        });
        ngonngu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Information_Activity.this, Language_Activity.class));
            }
        });
        ruoubia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Information_Activity.this, Smoking_Activity.class));
            }
        });

    }

    private void anhxa() {

        bottom_sheets = findViewById(R.id.bottom_sheet_user);

        height_txt = findViewById(R.id.height_txt);
        weight_txt = findViewById(R.id.weight_txt);

        cong_viec = findViewById(R.id.cong_viec);
        hoc_van = findViewById(R.id.hoc_van);
        ve_ban = findViewById(R.id.ve_ban);

        chieucao = findViewById(R.id.chieucao);
        cannang = findViewById(R.id.cannang);
        ruoubia = findViewById(R.id.ruoubia);
        hutthuoc = findViewById(R.id.hutthuoc);
        ngonngu = findViewById(R.id.ngonngu);

        //congviec_hocvan = findViewById(R.id.cong_viec);
        user_infor = findViewById(R.id.name_infor);
        cancel = findViewById(R.id.cancel);
    }

    private void quaylai() {
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

}
