package com.example.datting.Home.Home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.datting.R;

import java.util.ArrayList;

public class People_Apdapter extends RecyclerView.Adapter<ViewHolder> {
    ArrayList<People> people;
    Context context;

    public People_Apdapter(ArrayList<People> people, Context context) {
        this.people = people;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.custom_home, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        final People people1 = people.get(position);

        holder.image1.setImageResource(people1.getImage());
        holder.name1.setText(people1.getName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button_Sheets_dialog button_sheets_dialog = Button_Sheets_dialog.newInstance();
            }
        });


    }

    @Override
    public int getItemCount() {
        return people.size();
    }
}
