package com.example.datting.Users;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.datting.Model.User_infor;
import com.example.datting.R;

import java.util.ArrayList;

public class Information extends AppCompatActivity {
    ImageView cancel;
    RecyclerView infor_view;
    RecyclerView.LayoutManager layoutManager;
    TextView user_infor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        user_infor = findViewById(R.id.name_infor);
//        user_infor.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(getBaseContext(), TaiKhoan_Activity.class));
//            }
//        });



        //edit_user();
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
//    private void edit_user()
//    {
//        user_infor.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent( , TaiKhoan_Activity.class));
//            }
//        });
//    }

}
