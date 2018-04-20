package com.ajinkyad.fragmentlifecycle.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ajinkyad.fragmentlifecycle.MainActivity;
import com.ajinkyad.fragmentlifecycle.R;

public class FirstFragment extends ParentFragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup vg, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_first, vg, false);

        view.findViewById(R.id.btnSecondFragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ((MainActivity) getActivity()).changeFragment(new SecondFragment());

            }
        });
        return view;
    }

}
