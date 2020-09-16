package com.example.datting.Meet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.datting.Model.Meet;
import com.example.datting.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MeetAdapter extends RecyclerView.Adapter<MeetAdapter.ViewHolder> {
    private ArrayList<Meet> meets;
    Context context;

    public ArrayList<Meet> getMeets() {
        return meets;
    }

    public void setMeets(ArrayList<Meet> meets) {
        this.meets = meets;
    }



    public MeetAdapter(ArrayList<Meet> meets, Context context) {
        this.meets = meets;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.setData(meets.get(position));
    }

    @Override
    public int getItemCount() {
        return meets.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView nama, usia, kota;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.item_image);
            nama = itemView.findViewById(R.id.item_name);
            usia = itemView.findViewById(R.id.item_age);
            kota = itemView.findViewById(R.id.item_city);
        }

        public void setData(Meet meet) {
            Picasso.get()
                    .load(meet.getImage())
                    .fit()
                    .centerCrop()
                    .into(image);
            nama.setText(meet.getName());
            usia.setText(meet.getAge());
            kota.setText(meet.getAdress());
        }
    }

}
