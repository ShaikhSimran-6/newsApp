package com.example.androidProject.modalClassess;

import android.widget.ImageButton;

public class MeModalClass {

    private int profile;
    private String username;
    private String userId;
    private String question;
    private String time;
    private int qna_btn;
    private String qna_txt;
    private int like_btn;
    private String like_txt;

    public MeModalClass(int profile, String username, String userId, String question, String time, int qna_btn, String qna_txt, int like_btn, String like_txt) {
        this.profile = profile;
        this.username = username;
        this.userId = userId;
        this.question = question;
        this.time = time;
        this.qna_btn = qna_btn;
        this.qna_txt = qna_txt;
        this.like_btn = like_btn;
        this.like_txt = like_txt;
    }

    public int getProfile() {
        return profile;
    }

    public String getUsername() {
        return username;
    }

    public String getUserId() {
        return userId;
    }

    public String getQuestion() {
        return question;
    }

    public String getTime() {
        return time;
    }

    public int getQna_btn() {
        return qna_btn;
    }

    public String getQna_txt() {
        return qna_txt;
    }

    public int getLike_btn() {
        return like_btn;
    }

    public String getLike_txt() {
        return like_txt;
    }
}
