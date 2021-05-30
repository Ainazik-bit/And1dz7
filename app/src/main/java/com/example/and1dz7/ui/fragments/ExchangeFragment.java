package com.example.and1dz7.ui.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.and1dz7.R;
import com.example.and1dz7.models.ExchangeModel;

import java.util.ArrayList;

public class ExchangeFragment extends Fragment {

    private RecyclerView recyclerView;
    private ExchangeAdapter exchangeAdapter;
    private ArrayList<ExchangeModel> list;


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createList();
        initRecycler(view);
    }

    private void initRecycler(View view) {
        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        exchangeAdapter = new ExchangeAdapter();
        exchangeAdapter.addList(list);
        recyclerView.setAdapter(exchangeAdapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(requireContext(), LinearLayoutManager.VERTICAL));
    }

    private void createList() {
        list = new ArrayList<>();
        list.add(new ExchangeModel(R.drawable.ic_baseline_favorite_24, "Ainazik", 4.5));
        list.add(new ExchangeModel(R.drawable.ic_baseline_cruelty_free_24, "Orozbek", 7.3));
        list.add(new ExchangeModel(R.drawable.ic_baseline_grass_24, "Nursultan", 8.3));
        list.add(new ExchangeModel(R.drawable.ic_baseline_hotel_class_24, "Aidana", 5.2));
        list.add(new ExchangeModel(R.drawable.ic_baseline_icecream_24, "Meerim", 2.8));
        list.add(new ExchangeModel(R.drawable.ic_baseline_local_florist_24, "Zlata", 5.1));
        list.add(new ExchangeModel(R.drawable.ic_baseline_favorite_24, "Bakai", 7.0));
        list.add(new ExchangeModel(R.drawable.ic_baseline_cruelty_free_24, "Atai", 4.2));
        list.add(new ExchangeModel(R.drawable.ic_baseline_grass_24, "Mahabat", 9.5));
        list.add(new ExchangeModel(R.drawable.ic_baseline_hotel_class_24, "Asel", 6.3));
        list.add(new ExchangeModel(R.drawable.ic_baseline_icecream_24, "Kairat", 2.4));
        list.add(new ExchangeModel(R.drawable.ic_baseline_local_florist_24, "Baytur", 5.4));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_exchange, container, false);
    }

}