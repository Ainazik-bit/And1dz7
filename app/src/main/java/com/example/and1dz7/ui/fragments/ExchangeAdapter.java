package com.example.and1dz7.ui.fragments;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.and1dz7.R;
import com.example.and1dz7.models.ExchangeModel;

import java.util.ArrayList;

public class ExchangeAdapter extends RecyclerView.Adapter<ExchangeAdapter.ExchangeViewHolder> {

    private ArrayList<ExchangeModel> list = new ArrayList<>();

    public void addList(ArrayList<ExchangeModel> list){
        this.list.addAll(list);
    }

    @NonNull
    @Override
    public ExchangeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv, parent, false);
        return new ExchangeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExchangeViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ExchangeViewHolder extends RecyclerView.ViewHolder {

        private ImageView iconImageView;
        private TextView title;
        private TextView usd;

        public ExchangeViewHolder(@NonNull View itemView) {
            super(itemView);
            iconImageView = itemView.findViewById(R.id.image_rv);
            title = itemView.findViewById(R.id.text_rv);
            usd = itemView.findViewById(R.id.USD_rv);
        }

        public void onBind(ExchangeModel exchangeModel) {
            Glide.with(iconImageView.getContext()).load(exchangeModel.getImage()).centerCrop().circleCrop().into(iconImageView);
            title.setText(exchangeModel.getTitle());
            usd.setText("USD "+String.valueOf(exchangeModel.getUsd()));
        }
    }
}
