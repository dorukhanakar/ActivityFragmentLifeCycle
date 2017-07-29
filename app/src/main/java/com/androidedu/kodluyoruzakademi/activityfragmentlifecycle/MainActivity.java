package com.androidedu.kodluyoruzakademi.activityfragmentlifecycle;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    private final String MAIN_TAG = "ActivityTag";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(MAIN_TAG, "onCreate");
        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        getSupportFragmentManager();
        Fragment CFragment = new CFragment();
        fragmentTransaction.add(R.id.headlines_fragment_c,CFragment);
        fragmentTransaction.commit();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(MAIN_TAG, "onStart");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e(MAIN_TAG, "onRestoreInstanceState");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(MAIN_TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(MAIN_TAG, "onPause");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e(MAIN_TAG, "onSaveInstanceState");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(MAIN_TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(MAIN_TAG, "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(MAIN_TAG, "onRestart");
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        Log.e(MAIN_TAG, "onAttachFragment");
    }
}
