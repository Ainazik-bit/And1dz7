package com.example.and1dz7.ui.main;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.and1dz7.ui.fragments.ExchangeFragment;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentStateAdapter {

    private ArrayList<Fragment> list = new ArrayList<>();

    public void addList(ArrayList<Fragment> list){
        this.list.addAll(list);
        notifyDataSetChanged();
    }
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return list.get(position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
