package com.ajinkyad.fragmentlifecycle.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ajinkyad.fragmentlifecycle.R;

public class SecondFragment extends ParentFragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup vg, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_second, vg, false);
        return view;
    }

}
