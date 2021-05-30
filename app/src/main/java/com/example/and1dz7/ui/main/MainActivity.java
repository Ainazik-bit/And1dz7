package com.example.and1dz7.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.and1dz7.R;
import com.example.and1dz7.ui.fragments.DataTimeFragment;
import com.example.and1dz7.ui.fragments.ExchangeFragment;
import com.example.and1dz7.ui.fragments.MoreFragment;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Fragment> list = new ArrayList<>();
    private ViewPager2 viewPager2;
    private ViewPagerAdapter viewPagerAdapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createList();
        initViewPager2();
    }

    private void initViewPager2() {
        tabLayout = findViewById(R.id.tablayout);
        viewPager2 = findViewById(R.id.view_pager);
        viewPagerAdapter = new ViewPagerAdapter(this);
        viewPagerAdapter.addList(list);
        viewPager2.setAdapter(viewPagerAdapter);
        new TabLayoutMediator(tabLayout, viewPager2, ((tab, position) ->tab.setText(initString(position)))).attach();
    }

    private String initString(int position) {
        String value = "";
        switch (position){
            case 0:
                value = "Exchange";
                break;
            case 1:
                value = "Data & Time";
                break;
            case 2:
                value = "More";
                break;
        }
        return value;
    }

    private void createList() {
        list = new ArrayList<>();
        list.add(new ExchangeFragment());
        list.add(new DataTimeFragment());
        list.add(new MoreFragment());
    }
}