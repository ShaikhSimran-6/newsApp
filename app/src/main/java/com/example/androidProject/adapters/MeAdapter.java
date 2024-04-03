package com.example.androidProject.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidProject.R;
import com.example.androidProject.modalClassess.MeModalClass;

import java.util.List;

public class MeAdapter extends RecyclerView.Adapter<MeAdapter.MyViewHolder> {

    private List<MeModalClass> modalClassList;

    public MeAdapter(List<MeModalClass> modalClassList) {
        this.modalClassList = modalClassList;
    }



    @NonNull
    @Override
    public MeAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.queries_item_card, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MeAdapter.MyViewHolder holder, int position) {

        MeModalClass modalClass = modalClassList.get(position);
        holder.username.setText(modalClass.getUsername());
        holder.userId.setText(modalClass.getUserId());
        holder.question.setText(modalClass.getQuestion());
        holder.time.setText(modalClass.getTime());
        holder.qna_txt.setText(modalClass.getQna_txt());
        holder.like_txt.setText(modalClass.getLike_txt());

        holder.profile.setImageResource(modalClass.getProfile());

        holder.qna_btn.setImageResource(modalClass.getQna_btn());
        holder.like_btn.setImageResource(modalClass.getLike_btn());


    }

    @Override
    public int getItemCount() {
        return modalClassList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView username, userId, question, time, qna_txt, like_txt;
        ImageView profile;
        ImageButton qna_btn, like_btn;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            username = itemView.findViewById(R.id.username);
            userId = itemView.findViewById(R.id.userId);
            question = itemView.findViewById(R.id.question);
            time = itemView.findViewById(R.id.time);
            qna_txt = itemView.findViewById(R.id.qna_txt);
            like_txt = itemView.findViewById(R.id.like_txt);

            profile = itemView.findViewById(R.id.profile);

            qna_btn = itemView.findViewById(R.id.qna_btn);
            like_btn = itemView.findViewById(R.id.like_btn);
        }
    }
}
