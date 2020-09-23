package com.example.datting.Home.Home;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.datting.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

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
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        final People people1 = people.get(position);

        holder.image1.setImageResource(people1.getImage());
        holder.name1.setText(people1.getName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    //context.startActivity(new Intent(context, Button_Sheets_dialog.class));
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(context, R.style.BottomSheetDialogTheme);
                View botton = LayoutInflater.from(context).inflate(R.layout.item_sheets_dialog, (LinearLayout) view.findViewById(R.id.bottonSheets));
                bottomSheetDialog.setContentView(botton);
                bottomSheetDialog.show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return people.size();
    }
}
