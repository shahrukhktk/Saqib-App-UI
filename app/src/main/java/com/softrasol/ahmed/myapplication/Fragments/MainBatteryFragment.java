package com.softrasol.ahmed.myapplication.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.softrasol.ahmed.myapplication.R;

public class MainBatteryFragment extends Fragment {



    public MainBatteryFragment(){ }

    private View mView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_main_battery, container, false);

        return mView;
    }
}