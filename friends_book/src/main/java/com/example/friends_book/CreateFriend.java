package com.example.friends_book;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CreateFriend {
    private static String name;
    private static int age;
    private static double gpa;
    private static FileReader fr;
    private static BufferedReader br;
    private static ArrayList<Friend> friends = new ArrayList<>();

    public static ArrayList createAllFriends(String fileName) throws IOException {
        friends = new ArrayList<>();
        fr = new FileReader(fileName);
        br = new BufferedReader(fr);
        String line;
        String friendString = "";
        while ((line = br.readLine()) != null) {
            if(!line.equals(";")) {
                friendString += line;
            } else {
                parseFriend(friendString, fileName);
                friendString = "";
            }
        }
        return friends;
    }

    private static void parseFriend (String string, String fileName) {
        int pos1 = 0;
        int pos2 = 0;
        boolean first = true;
        String name = "";
        int age = 0;
        double gpa = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.substring(i, i + 1).equals(",")) {
                if (first) {
                    pos1 = i;
                    name = string.substring(0, pos1);
                    first = false;
                } else {
                    pos2 = i;
                    age = Integer.parseInt(string.substring(pos1+1, pos2));
                    gpa = Double.parseDouble(string.substring(pos2+1));
                }
            }
        }
        friends.add(new Friend(name, age, gpa, fileName));
    }
}
