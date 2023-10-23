package com.example.app;

public class User {
    private String name;
    private int like = 0;


    public User(String name) {
        this.name = name;    }
    public void addLike() {
        this.like +=1;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }
}

