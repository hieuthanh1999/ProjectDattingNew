package com.example.datting.BottomNavigation;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;

import com.example.datting.Meet.CardStackCallback;
import com.example.datting.Meet.MeetAdapter;
import com.example.datting.Model.Meet;
import com.example.datting.R;
import com.yuyakaido.android.cardstackview.CardStackLayoutManager;
import com.yuyakaido.android.cardstackview.CardStackListener;
import com.yuyakaido.android.cardstackview.CardStackView;
import com.yuyakaido.android.cardstackview.Direction;
import com.yuyakaido.android.cardstackview.StackFrom;
import com.yuyakaido.android.cardstackview.SwipeableMethod;

import java.util.ArrayList;

public class Meet_Fragments extends Fragment {

    private static final String TAG = "Meet_Fragments";
    private CardStackLayoutManager manager;
    private MeetAdapter adapter;
    private TextView tv;
    ArrayList<Meet> meets = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.meet_fragments, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        addList();

        CardStackView cardStackView = view.findViewById(R.id.CardStackView);

        manager = new CardStackLayoutManager(getContext(), new CardStackListener() {
            @Override
            public void onCardDragging(Direction direction, float ratio) {
                Log.d(TAG, "onCardDragging: d=" + direction.name() + " ratio=" + ratio);
            }
            @Override
            public void onCardSwiped(Direction direction) {
                Log.d(TAG, "onCardSwiped: p=" + manager.getTopPosition() + " d=" + direction);
                if (direction == Direction.Right) {
                   // Toast.makeText(getContext(), "Direction Right", Toast.LENGTH_SHORT).show();
                }
                if (direction == Direction.Top) {
                   //Toast.makeText(getContext(), "Direction Top", Toast.LENGTH_SHORT).show();
                }
                if (direction == Direction.Left) {
                    //Toast.makeText(getContext(), "Direction Left", Toast.LENGTH_SHORT).show();
                }
                if (direction == Direction.Bottom) {
                    //Toast.makeText(getContext(), "Direction Bottom", Toast.LENGTH_SHORT).show();
                }

                // Paginating
                if (manager.getTopPosition() == adapter.getItemCount() - 5) {
                    paginate();
                }

            }

            @Override
            public void onCardRewound() {
                Log.d(TAG, "onCardRewound: " + manager.getTopPosition());
            }

            @Override
            public void onCardCanceled() {
                Log.d(TAG, "onCardRewound: " + manager.getTopPosition());
            }

            @Override
            public void onCardAppeared(View view, int position) {
                tv = view.findViewById(R.id.item_name);
                Log.d(TAG, "onCardAppeared: " + position + ", nama: " + tv.getText());
            }

            @Override
            public void onCardDisappeared(View view, int position) {
                tv = view.findViewById(R.id.item_name);
                Log.d(TAG, "onCardAppeared: " + position + ", nama: " + tv.getText());
            }
        });
        //

        adapter = new MeetAdapter(meets, getContext());
        cardStackView.setLayoutManager(manager);
        cardStackView.setAdapter(adapter);
        cardStackView.setItemAnimator(new DefaultItemAnimator());

    }

    private void paginate() {
        ArrayList<Meet> old = adapter.getMeets();
        ArrayList<Meet> baru = new ArrayList<>(meets);
        CardStackCallback callback = new CardStackCallback(old, baru);
        DiffUtil.DiffResult hasil = DiffUtil.calculateDiff(callback);
        adapter.setMeets(baru);
        hasil.dispatchUpdatesTo(adapter);

    }

    private void addList() {
        meets.add(new Meet(R.drawable.nhungheo, "Ji Soo", "25", "Korea"));
        meets.add(new Meet(R.drawable.thanhh, "Hieu Thanh", "25", "Korea"));
        meets.add(new Meet(R.drawable.thanhh, "Nhung hong", "25", "Korea"));
        meets.add(new Meet(R.drawable.nhung12, "Ji Soo", "25", "Korea"));
        meets.add(new Meet(R.drawable.nhunglon, "Ji Soo", "25", "Korea"));
        meets.add(new Meet(R.drawable.xinh2, "Ji Soo", "25", "Korea"));
        meets.add(new Meet(R.drawable.nhungheo, "Ji Soo", "25", "Korea"));
        meets.add(new Meet(R.drawable.thanhh, "Ji Soo", "25", "Korea"));
        meets.add(new Meet(R.drawable.thanhh, "Ji Soo", "25", "Korea"));
        meets.add(new Meet(R.drawable.nhung12, "Ji Soo", "25", "Korea"));
        meets.add(new Meet(R.drawable.nhunglon, "Ji Soo", "25", "Korea"));
        meets.add(new Meet(R.drawable.xinh2, "Ji Soo", "25", "Korea"));
        meets.add(new Meet(R.drawable.nhungheo, "Ji Soo", "25", "Korea"));
        meets.add(new Meet(R.drawable.thanhh, "Ji Soo", "25", "Korea"));
        meets.add(new Meet(R.drawable.thanhh, "Ji Soo", "25", "Korea"));
        meets.add(new Meet(R.drawable.nhung12, "Ji Soo", "25", "Korea"));
        meets.add(new Meet(R.drawable.nhunglon, "Ji Soo", "25", "Korea"));
        meets.add(new Meet(R.drawable.xinh2, "Ji Soo", "25", "Korea"));


    }

}
