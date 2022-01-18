package com.example.friends_book;

public class Friend {
    private String name;
    private int age;
    private double gpa;

    public Friend(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getGpa() {
        return this.gpa;
    }

    public String toString() {
        return this.name;
    }
}
