package com.example.datting.BottomNavigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.datting.Home.Home.CustomItemDecorator;
import com.example.datting.Home.Home.People;
import com.example.datting.Home.Home.People_Apdapter;
import com.example.datting.R;

import java.util.ArrayList;

public class Home_Fragments extends Fragment {
    ArrayList<People> people;
    LinearLayoutManager linearLayoutManager;
    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.home_fragments, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recycler);
        data();


         ///
        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        manager.setGapStrategy(StaggeredGridLayoutManager.GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS);
        recyclerView.addItemDecoration(new CustomItemDecorator(getResources().getDimensionPixelSize(R.dimen._16sdp), getResources().getDimensionPixelSize(R.dimen._90sdp)));
        recyclerView.setLayoutManager(manager);
        recyclerView.setHasFixedSize(true);

//        linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        People_Apdapter studentAdapter = new People_Apdapter(people, getContext());
        recyclerView.setAdapter(studentAdapter);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));


    }
    public  void data()
    {
        people = new ArrayList<>();
        people.add(new People("Nam Thần", R.drawable.thanhh));
        people.add(new People("Hiếu Thành", R.drawable.xinh3));
        people.add(new People("Nam Anh", R.drawable.xinh2));
        people.add(new People("Nam handsome", R.drawable.xinh1));
        people.add(new People("Thành handsome", R.drawable.jisoo01));
        people.add(new People("Đỗ Linh", R.drawable.jisso));
        people.add(new People("Hồng Nhung", R.drawable.thanhh));
        people.add(new People("Nhung", R.drawable.nhunglon));
        people.add(new People("Maria Ozawa", R.drawable.ngoctrinh));
        people.add(new People("Ngọc Trinh", R.drawable.linh));
        people.add(new People("Chi Pu", R.drawable.thanhne));
        people.add(new People("Kiên", R.drawable.thanhh));

    }
}