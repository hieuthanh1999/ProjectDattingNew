package com.example.datting.Home.Home;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.datting.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class ViewHolder extends RecyclerView.ViewHolder {

    public CircleImageView image1, image2, image3, image4, image5, image6, image7, image8, image9, image10, image11, image12;
    public TextView name1, name2, name3, name4, name5, name6, name7, name8, name9, name10, name11, name12;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        image1 = itemView.findViewById(R.id.image1);
        name1 = itemView.findViewById(R.id.name1);

        image2 = itemView.findViewById(R.id.image2);
        name2 = itemView.findViewById(R.id.name2);

        image3 = itemView.findViewById(R.id.image3);
        name3 = itemView.findViewById(R.id.name3);

        image4 = itemView.findViewById(R.id.image4);
        name4 = itemView.findViewById(R.id.name4);

        image5 = itemView.findViewById(R.id.image5);
        name5 = itemView.findViewById(R.id.name5);

        image6 = itemView.findViewById(R.id.image6);
        name6 = itemView.findViewById(R.id.name6);

        image7 = itemView.findViewById(R.id.image7);
        name7 = itemView.findViewById(R.id.name7);

        image8 = itemView.findViewById(R.id.image8);
        name8 = itemView.findViewById(R.id.name8);

        image9 = itemView.findViewById(R.id.image9);
        name9 = itemView.findViewById(R.id.name9);

        image10 = itemView.findViewById(R.id.image10);
        name10 = itemView.findViewById(R.id.name10);

        image11 = itemView.findViewById(R.id.image11);
        name11 = itemView.findViewById(R.id.name11);

        image12 = itemView.findViewById(R.id.image12);
        name12 = itemView.findViewById(R.id.name12);


    }
}
