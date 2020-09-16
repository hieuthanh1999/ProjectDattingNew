package com.example.datting.Home.Home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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

        View view = LayoutInflater.from(context).inflate(R.layout.custem_home, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        People people1 = people.get(position);

        holder.image1.setImageResource(people1.getImage());
        holder.name1.setText(people1.getName());

        holder.image2.setImageResource(people1.getImage());
        holder.name1.setText(people1.getName());

        holder.image3.setImageResource(people1.getImage());
        holder.name1.setText(people1.getName());

        holder.image4.setImageResource(people1.getImage());
        holder.name1.setText(people1.getName());

        holder.image5.setImageResource(people1.getImage());
        holder.name1.setText(people1.getName());

        holder.image6.setImageResource(people1.getImage());
        holder.name1.setText(people1.getName());

        holder.image7.setImageResource(people1.getImage());
        holder.name1.setText(people1.getName());

        holder.image8.setImageResource(people1.getImage());
        holder.name1.setText(people1.getName());

        holder.image9.setImageResource(people1.getImage());
        holder.name1.setText(people1.getName());

        holder.image10.setImageResource(people1.getImage());
        holder.name1.setText(people1.getName());

        holder.image11.setImageResource(people1.getImage());
        holder.name1.setText(people1.getName());

        holder.image12.setImageResource(people1.getImage());
        holder.name1.setText(people1.getName());


    }

    @Override
    public int getItemCount() {
        return people.size();
    }
}
