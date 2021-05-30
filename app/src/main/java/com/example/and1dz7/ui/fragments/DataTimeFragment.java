package com.example.and1dz7.ui.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.and1dz7.R;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTimeFragment extends Fragment {

    private TextView textData, textCity;
    private ImageView imageView;



    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textData = view.findViewById(R.id.text_data);
        textCity = view.findViewById(R.id.text_city);
        imageView = view.findViewById(R.id.image_view);
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm yyyy/MM/dd");
        Date date = new Date(System.currentTimeMillis());
        textData.setText(formatter.format(date));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_data_time, container, false);

    }
}