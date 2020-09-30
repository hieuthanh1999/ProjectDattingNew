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

import static android.view.View.VISIBLE;

public class MeetAdapter extends RecyclerView.Adapter<MeetAdapter.ViewHolder> {
    private ArrayList<Meet> meets;
    Context context;
    CardStackLayoutManager manager;
    public ArrayList<Meet> getMeets() {
        return meets;
    }

    public void setMeets(ArrayList<Meet> meets) {
        this.meets = meets;
    }


    public MeetAdapter(ArrayList<Meet> meets, Context context, CardStackLayoutManager manager) {
        this.meets = meets;
        this.context = context;
        this.manager = manager;
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

        holder.setData(meets.get(position));
        holder.linearLayout.setVisibility(VISIBLE);
       holder.linearLayout_infor.setVisibility(View.GONE);
//        }
//        else{
//            holder.linearLayout.setVisibility(VISIBLE);
//            holder.setData(meets.get(position));
//        }


       holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (holder.linearLayout.getVisibility() == VISIBLE) {

                    holder.linearLayout.setVisibility(View.GONE);
                    manager.setSwipeableMethod(SwipeableMethod.None);
                    manager.setStackFrom(StackFrom.None);
//                    manager.setVisibleCount(3);
                  //  manager.setTranslationInterval(8.0f);
                    manager.setScaleInterval(0.4f);
                    manager.setSwipeThreshold(0.3f);
                    manager.setMaxDegree(20.0f);
                    manager.setDirections(Direction.HORIZONTAL);
                    manager.setCanScrollHorizontal(true);
                    manager.setSwipeableMethod(SwipeableMethod.AutomaticAndManual);
                    manager.setOverlayInterpolator(new LinearInterpolator());
                    manager.setSwipeableMethod(SwipeableMethod.None);
                   holder.linearLayout_infor.setVisibility(View.VISIBLE);
                } else {
                    holder.linearLayout.setVisibility(VISIBLE);
                    manager.setSwipeableMethod(SwipeableMethod.None);
                    manager.setStackFrom(StackFrom.None);
//                    manager.setVisibleCount(3);
                    //  manager.setTranslationInterval(8.0f);
                    manager.setScaleInterval(0.4f);
                    manager.setSwipeThreshold(0.3f);
                    manager.setMaxDegree(20.0f);
                    manager.setDirections(Direction.HORIZONTAL);
                    manager.setCanScrollHorizontal(true);
                    manager.setSwipeableMethod(SwipeableMethod.AutomaticAndManual);
                    manager.setOverlayInterpolator(new LinearInterpolator());

                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return meets.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {


        ImageView image;
        TextView nama, usia, kota;
        CardView cardView;
        LinearLayout linearLayout;
        LinearLayout linearLayout_infor;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.item_image);
            nama = itemView.findViewById(R.id.item_name);
            usia = itemView.findViewById(R.id.item_age);
            kota = itemView.findViewById(R.id.item_city);
            linearLayout = itemView.findViewById(R.id.infor);
            cardView = itemView.findViewById(R.id.cardview);
            linearLayout_infor = itemView.findViewById(R.id.infor_user);

        }

        public void setData(Meet meet) {

            Glide.with(context).load(meet.getImage()).into(image);
            nama.setText(meet.getName());
            usia.setText(meet.getAge());
            kota.setText(meet.getAdress());

        }
    }

}
