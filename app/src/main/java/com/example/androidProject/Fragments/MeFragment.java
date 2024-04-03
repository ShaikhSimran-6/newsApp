package com.example.androidProject.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import com.example.androidProject.R;
import com.example.androidProject.adapters.MeAdapter;
import com.example.androidProject.modalClassess.MeModalClass;

import java.util.ArrayList;
import java.util.List;

public class MeFragment extends Fragment {

    RecyclerView recyclerView;

    MeAdapter adapter;

    List<MeModalClass> modalClass;

    public MeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_me, container, false);

        recyclerView = rootView.findViewById(R.id.me_recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        modalClass = new ArrayList<>();

        modalClass.add(new MeModalClass(R.drawable.user_profile, "Shaikh Simran", "@shaikhsimran", "Question", "31-03-24", R.drawable.qna_comment, "10 answers", R.drawable.like, "40 likes"));

        modalClass.add(new MeModalClass(R.drawable.user_profile, "Shaikh Simran", "@shaikhsimran", "Question", "31-03-24", R.drawable.qna_comment, "10 answers", R.drawable.like, "40 likes"));

        modalClass.add(new MeModalClass(R.drawable.user_profile, "Shaikh Simran", "@shaikhsimran", "Question", "31-03-24", R.drawable.qna_comment, "10 answers", R.drawable.like, "40 likes"));

        modalClass.add(new MeModalClass(R.drawable.user_profile, "Shaikh Simran", "@shaikhsimran", "Question", "31-03-24", R.drawable.qna_comment, "10 answers", R.drawable.like, "40 likes"));

        modalClass.add(new MeModalClass(R.drawable.user_profile, "Shaikh Simran", "@shaikhsimran", "Question", "31-03-24", R.drawable.qna_comment, "10 answers", R.drawable.like, "40 likes"));

        modalClass.add(new MeModalClass(R.drawable.user_profile, "Shaikh Simran", "@shaikhsimran", "Question", "31-03-24", R.drawable.qna_comment, "10 answers", R.drawable.like, "40 likes"));

        modalClass.add(new MeModalClass(R.drawable.user_profile, "Shaikh Simran", "@shaikhsimran", "Question", "31-03-24", R.drawable.qna_comment, "10 answers", R.drawable.like, "40 likes"));

        modalClass.add(new MeModalClass(R.drawable.user_profile, "Shaikh Simran", "@shaikhsimran", "Question", "31-03-24", R.drawable.qna_comment, "10 answers", R.drawable.like, "40 likes"));

        modalClass.add(new MeModalClass(R.drawable.user_profile, "Shaikh Simran", "@shaikhsimran", "Question", "31-03-24", R.drawable.qna_comment, "10 answers", R.drawable.like, "40 likes"));

        modalClass.add(new MeModalClass(R.drawable.user_profile, "Shaikh Simran", "@shaikhsimran", "Question", "31-03-24", R.drawable.qna_comment, "10 answers", R.drawable.like, "40 likes"));

        modalClass.add(new MeModalClass(R.drawable.user_profile, "Shaikh Simran", "@shaikhsimran", "Question", "31-03-24", R.drawable.qna_comment, "10 answers", R.drawable.like, "40 likes"));


        adapter = new MeAdapter(modalClass);

        recyclerView.setAdapter(adapter);

        return rootView;
    }
}