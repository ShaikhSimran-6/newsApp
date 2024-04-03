package com.example.androidProject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.example.androidProject.Fragments.DiscussionFragment;
import com.example.androidProject.Fragments.IdeasFragment;
import com.example.androidProject.Fragments.MeFragment;
import com.example.androidProject.adapters.MyPagerAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.List;


public class ForumFragment extends Fragment{

    ViewPager2 viewPager2;
    TabLayout tabLayout;

    public ForumFragment() {
//        Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_forum, container, false);

        viewPager2 = rootView.findViewById(R.id.viewPager);
        tabLayout = rootView.findViewById(R.id.tabLayout);

        List<Fragment> fragments = new ArrayList<>();
        fragments.add(new MeFragment());
        fragments.add(new DiscussionFragment());
        fragments.add(new IdeasFragment());

        MyPagerAdapter pagerAdapter = new MyPagerAdapter(this, fragments);
        viewPager2.setAdapter(pagerAdapter);

        new TabLayoutMediator(tabLayout, viewPager2,
                (tab, position) -> tab.setText(getTabTitle(position))
                ).attach();
        return rootView;
    }

        private String getTabTitle(int position) {
            if (position == 0){
                return "Me";
            } else if (position == 1) {
                return "Discussion";
            } else {
                return "Ideas";
            }
        }


}