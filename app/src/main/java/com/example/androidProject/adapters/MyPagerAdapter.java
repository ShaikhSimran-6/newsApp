package com.example.androidProject.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.androidProject.ForumFragment;

import java.util.List;

public class MyPagerAdapter extends FragmentStateAdapter {

    private final List<Fragment> fragments;

    public MyPagerAdapter(ForumFragment fragmentActivity, List<Fragment> fragments) {
        super(fragmentActivity);
        this.fragments = fragments;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return fragments.get(position);
    }

    @Override
    public int getItemCount() {
        return fragments.size();
    }
}
