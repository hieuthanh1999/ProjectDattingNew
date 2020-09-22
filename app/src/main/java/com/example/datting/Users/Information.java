package com.example.datting.Users;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.datting.R;

public class Information extends AppCompatActivity {
    ImageView cancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        cancel = findViewById(R.id.cancel);

    }


}
