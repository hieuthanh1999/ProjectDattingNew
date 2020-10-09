package com.example.datting.Users;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.datting.R;

public class TaiKhoan_Activity extends AppCompatActivity {
    ImageView cancel;
    TextView user_text, age_text;
    EditText user_edit, age_edit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tai_khoan_);
        anhxa();
        //quay lai man user_fragment
        setOnclic_name();
        setCancel();



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

//        user_edit.setOnHoverListener(new View.OnHoverListener() {
//            @Override
//            public boolean onHover(View v, MotionEvent event) {
//                user_text.setTextColor(Color.RED);
//                return false;
//            }
//        });
//        user_edit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                user_text.setTextColor(Color.RED);
//                //user_text.getResources().getColor(R.color.colorAccent);
//            }
//        });
    }


    private void anhxa()
    {
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
