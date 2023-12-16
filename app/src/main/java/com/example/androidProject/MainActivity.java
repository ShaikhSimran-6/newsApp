package com.example.androidProject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.tabs.TabLayout;

import me.ibrahimsn.lib.OnItemSelectedListener;
import me.ibrahimsn.lib.SmoothBottomBar;


public class MainActivity extends AppCompatActivity{

    SmoothBottomBar smoothBottomBar;
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Sign up and Sign In.

        smoothBottomBar = findViewById(R.id.bottomNav);
        loadFragment(new HomeFragment());

        imageButton = (ImageButton) findViewById(R.id.newsAppIcon);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, NewsDemo.class);
                startActivity(i);
            }
        });

        smoothBottomBar.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public boolean onItemSelect(int i) {

                if (i == 0){
                    loadFragment(new HomeFragment());
                } else if (i == 1) {
                    loadFragment(new ForumFragment());
                } else if (i == 2) {
                    loadFragment(new PostFragment());
                } else {
                    loadFragment(new ProfileFragment());
                }

                return true;
            }
        });

    }

    private void loadFragment(Fragment fragment){

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment).commit();

    }


}

