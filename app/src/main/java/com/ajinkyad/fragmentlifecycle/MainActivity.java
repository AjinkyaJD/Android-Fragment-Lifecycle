package com.ajinkyad.fragmentlifecycle;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ajinkyad.fragmentlifecycle.fragments.FirstFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeFragment(new FirstFragment());

    }

    public void changeFragment(Fragment currentFragment) {
        try {
            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.add(R.id.fragmentHolder, currentFragment, "");
            fragmentTransaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
