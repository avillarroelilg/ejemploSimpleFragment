package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        exempleFragment fragment = new exempleFragment();
        Bundle args = new Bundle();
        args.putString("argText","example text");
        args.putInt("argNumber",123);
        fragment.setArguments(args);
        fragment.setArguments(args);
*/

        exempleFragment fragment = exempleFragment.newInstance("example text",123);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();

    }
}
