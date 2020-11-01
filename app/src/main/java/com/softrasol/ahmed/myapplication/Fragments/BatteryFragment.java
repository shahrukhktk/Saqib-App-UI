package com.softrasol.ahmed.myapplication.Fragments;

import android.app.Activity;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;

import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.softrasol.ahmed.myapplication.Adapters.TabsAccessorAdapter;
import com.softrasol.ahmed.myapplication.R;
import com.softrasol.ahmed.myapplication.databinding.ActivityMainBinding;
import com.softrasol.ahmed.myapplication.databinding.FragmentBatteryBinding;

public class BatteryFragment extends Fragment {

    FragmentBatteryBinding binding;
    View mView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_battery, container, false);
        mView = binding.getRoot();

        TabsAccessorAdapter adapter = new TabsAccessorAdapter(getActivity().getSupportFragmentManager());
        adapter.setFragment(new MainBatteryFragment(), "Main Battery");
        adapter.setFragment(new StarterBatteryFragment(), "Starter Battery");
        adapter.setFragment(new MyBatteryFragment(), "My Battery");
        binding.tabLayout.setupWithViewPager(binding.viewPager);
        binding.viewPager.setAdapter(adapter);

        return mView;
    }
}