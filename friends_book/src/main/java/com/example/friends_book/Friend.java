package com.example.friends_book;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Friend {
    private String name;
    private int age;
    private double gpa;
    private String fileName;

    public Friend(String name, int age, double gpa, String fileName) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.fileName = fileName;
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

    public void writeToFile() throws IOException {
        FileWriter fw = new FileWriter(this.fileName, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(name + ",\r" + Integer.toString(age) + ",\r" + Double.toString(gpa) + "\r" + ";\r");
        bw.close();
        fw = new FileWriter("allFriends.txt", true);
        bw = new BufferedWriter(fw);
        bw.write(name + ",\r" + Integer.toString(age) + ",\r" + Double.toString(gpa) + "\r" + ";\r");
        bw.close();
    }

    public String toString() {
        return this.name;
    }

    public boolean compareFriends(Friend f) {
        if (this.name.equals(f.name)) {
            return true;
        }
        else return false;
    }
}
