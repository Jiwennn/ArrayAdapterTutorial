package com.example.jiwen.arrayadaptertutorial;

public class User {

    public int id;
    public String name;
    public String degree;

    public User(int id, String name, String degree) {
        this.id = id;
        this.name = name;
        this.degree = degree;
    }

    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public String getDegree(){
        return degree;
    }

    @Override
    public String toString() {
        return name;
    }
}
