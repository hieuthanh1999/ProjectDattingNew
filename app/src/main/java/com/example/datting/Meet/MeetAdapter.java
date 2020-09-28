package com.example.datting.Meet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.datting.Home.Home.People;
import com.example.datting.Model.Meet;
import com.example.datting.R;
import com.squareup.picasso.Picasso;
import com.yuyakaido.android.cardstackview.CardStackLayoutManager;
import com.yuyakaido.android.cardstackview.Direction;
import com.yuyakaido.android.cardstackview.StackFrom;
import com.yuyakaido.android.cardstackview.SwipeableMethod;

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
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        final Meet meet = meets.get(position);
        holder.linearLayout.setVisibility(View.VISIBLE);
        holder.nama.setVisibility(View.VISIBLE);
        holder.setData(meets.get(position));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.linearLayout.setVisibility(View.GONE);
                //holder.cardView.setVisibility(View.VISIBLE);
                holder.nama.setVisibility(View.GONE);
                if(holder.itemView.callOnClick())
                {


                    holder.manager.setStackFrom(StackFrom.None);
                    holder.manager.setVisibleCount(3);
                    holder.manager.setTranslationInterval(8.0f);
                    holder.manager.setScaleInterval(0.95f);
                    holder.manager.setSwipeThreshold(0.3f);
                    holder.manager.setMaxDegree(20.0f);
                    holder.manager.setDirections(Direction.HORIZONTAL);
                    holder.manager.setCanScrollHorizontal(true);
                    holder.manager.setSwipeableMethod(SwipeableMethod.AutomaticAndManual);
                    holder.manager.setOverlayInterpolator(new LinearInterpolator());
                    holder.manager.setSwipeableMethod(SwipeableMethod.None);
                }
                else {
                    holder.manager.setStackFrom(StackFrom.None);
                    holder.manager.setVisibleCount(3);
                    holder.manager.setTranslationInterval(8.0f);
                    holder.manager.setScaleInterval(0.95f);
                    holder.manager.setSwipeThreshold(0.3f);
                    holder.manager.setMaxDegree(20.0f);
                    holder.manager.setDirections(Direction.HORIZONTAL);
                    holder.manager.setCanScrollHorizontal(true);
                    holder.manager.setSwipeableMethod(SwipeableMethod.AutomaticAndManual);
                    holder.manager.setOverlayInterpolator(new LinearInterpolator());
                }

            }
        });
}

    @Override
    public int getItemCount() {
        return meets.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        CardStackLayoutManager manager;
        ImageView image;
        TextView nama, usia, kota;
        CardView cardView;
        LinearLayout linearLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.item_image);
            nama = itemView.findViewById(R.id.item_name);
            usia = itemView.findViewById(R.id.item_age);
            kota = itemView.findViewById(R.id.item_city);
            linearLayout = itemView.findViewById(R.id.infor);
            cardView = itemView.findViewById(R.id.cardview);

        }

        public void setData(Meet meet) {
            Glide.with(context).load(meet.getImage()).into(image);
//            Picasso.get()
//                    .load(meet.getImage())
//                    .fit()
//                    .centerCrop()
//                    .into(image);
            nama.setText(meet.getName());
            usia.setText(meet.getAge());
            kota.setText(meet.getAdress());
        }
    }

}
