package com.example.datting.Users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.datting.BottomNavigation.User_Fragments;
import com.example.datting.R;

public class TaiKhoan_Activity extends AppCompatActivity {
    ImageView cancel;
    TextView user_text, age_text;
    EditText user_edit, age_edit;
    TextView save_user;

    public String name, age, sex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tai_khoan_);
        anhxa();
        //quay lai man user_fragment
        setOnclic_name();
        setCancel();
        xuly();



    }
    private void xuly()
    {
            save_user.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    name = user_edit.toString();
                    age = age_edit.toString();


                }
            });
    }
    private void setOnclic_name()
    {
        user_edit.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus)
                {
                    user_text.setTextColor(Color.parseColor("#ff78bb"));
                }
                else {
                    user_text.setTextColor(Color.parseColor("#d0d0d0"));
                }
            }
        });

        age_edit.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if(hasFocus)
                {
                    age_text.setTextColor(Color.parseColor("#ff78bb"));
                }
                else {
                    age_text.setTextColor(Color.parseColor("#d0d0d0"));
                }

            }
        });

    }


    private void anhxa()
    {
        save_user = findViewById(R.id.save_user);
        cancel = findViewById(R.id.cancel);
        user_text= findViewById(R.id.hoten);
        age_text = findViewById(R.id.ngaysinh_text);
        user_edit = findViewById(R.id.hoten_edit);
        age_edit = findViewById(R.id.ngaysinh_edit);
    }
    private void setCancel()
    {
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
