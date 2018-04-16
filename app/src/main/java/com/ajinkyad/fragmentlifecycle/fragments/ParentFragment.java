package com.ajinkyad.fragmentlifecycle.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ajinkyad.fragmentlifecycle.R;


public class ParentFragment extends Fragment {


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        logEvent("onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        logEvent("onCreateView");
        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        logEvent("onActivityCreated");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        logEvent("onAttach");
    }

    @Override
    public void onAttachFragment(Fragment childFragment) {
        super.onAttachFragment(childFragment);
        logEvent("onAttachFragment");
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        logEvent("onAttach");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        logEvent("onDestroy");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        logEvent("onDestroyView");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        logEvent("onDetach");
    }

    @Override
    public void onPause() {
        super.onPause();
        logEvent("onPause");
    }

    @Override
    public void onStart() {
        super.onStart();
        logEvent("onStart");
    }

    @Override
    public void onStop() {
        super.onStop();
        logEvent("onStop");
    }

    @Override
    public void onResume() {
        super.onResume();
        logEvent("onResume");
    }

    /**
     * This function is used to fire the local Notification
     *
     * @param methodName - The Activity Life Cycle Method called
     */
    private void logEvent(String methodName) {

        //The Current Activity Name
        String activityName = this.getClass().getSimpleName();
        Log.e(activityName, methodName);

        //To Trigger the local notification to the User
        NotificationManager notificationManager = (NotificationManager) getActivity().getSystemService(Context
                .NOTIFICATION_SERVICE);

        //Build the notification with the Title as the Activity Name and Description text as the activity life cycle method name
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(getActivity())
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentTitle(activityName)
                .setContentText(methodName);

        //Trigger the notification if the notificationManager object is created successfully
        if (notificationManager != null) {
            notificationManager.notify((int) System.currentTimeMillis(), notificationBuilder.build());
        }

    }

}
