package com.example.friends_book;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

import java.io.*;
import java.util.ArrayList;

public class HelloController {
    public TextField add_name;
    public TextField add_age;
    public TextField add_gpa;
    public Button add;
    public TextField delete_name;
    public Button delete;
    public Label display_name;
    public Label display_age;
    public Label display_gpa;
    public ArrayList<Friend> friends = new ArrayList<Friend>();
    public ListView<Friend> friends_list = new ListView<Friend>();
    public Label display_title;
    public String currentFile = "";
    public ListView<String> book_list = new ListView<>();
    public Button load2;
    public VBox vbox1;
    public VBox vbox2;
    public Button saveBtn;
    public Button delete_friend2;
    public Button loadBtn;
    public Button newGroup;
    public Button loadAll;

    public void add_friend(ActionEvent actionEvent) throws IOException {
        if (friends_list.getItems().size() == 0) {
            add_file();
        }
        Friend temp = new Friend(add_name.getText(), Integer.parseInt(add_age.getText()), Double.parseDouble(add_gpa.getText()), currentFile);
        friends.add(temp);
        friends_list.getItems().add(temp);
        add_name.clear();
        add_age.clear();
        add_gpa.clear();
        if (display_name.getText().equals("")) {
            display_title.setText("Choose Friend");
        }
    }

    public void add_file() throws IOException {
        FileReader fr = new FileReader("books.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        int numBooks = 0;
        while ((line = br.readLine()) != null) {
            numBooks = Integer.parseInt(line.substring(6));
        }
        br.close();
        numBooks++;
        FileWriter fw = new FileWriter("books.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Group " + numBooks + "\r");
        bw.close();
        currentFile = "group" + numBooks + ".txt";
    }

    public void delete_friend(ActionEvent actionEvent) {
        for (int i = 0; i < friends.size(); i++) {
            if (friends.get(i).getName().equals(delete_name.getText())) {
                if (friends.get(i).getName().equals(display_name.getText())) {
                    display_name.setText("");
                    display_age.setText("");
                    display_gpa.setText("");
                }
                friends.remove(i);
                friends_list.getItems().remove(i);
                break;
            }
        }
        delete_name.clear();
        if (friends.size() == 0) {
            display_title.setText("Add Friend");
        }
    }

    public void displayFriend(MouseEvent mouseEvent) {
        Friend temp = friends_list.getSelectionModel().getSelectedItem();
        display_title.setText("Friend Info");
        display_name.setText(temp.getName());
        display_age.setText(Integer.toString(temp.getAge()));
        display_gpa.setText(Double.toString(temp.getGpa()));
    }

    public void delete_friend2(ActionEvent actionEvent) {
        for (int i = 0; i < friends.size(); i++) {
            if (friends.get(i).getName().equals(display_name.getText())) {
                friends.remove(i);
                friends_list.getItems().remove(i);
                break;
            }
        }
        display_name.setText("");
        display_age.setText("");
        display_gpa.setText("");
        if (friends.size() == 0) {
            display_title.setText("Add Friend");
        }
    }

    public void save(ActionEvent actionEvent) throws IOException {
        PrintWriter writer = new PrintWriter(currentFile);
        writer.print("");
        writer.close();
        ObservableList<Friend> myList = friends_list.getItems();
        for (Friend f:
             myList) {
            f.writeToFile();
        }
        friends_list.getItems().clear();
    }

    public void load(ActionEvent actionEvent) throws IOException {
        book_list.setVisible(false);
        load2.setVisible(false);
        newGroup.setVisible(false);
        display_title.setVisible(true);
        vbox1.setVisible(true);
        vbox2.setVisible(true);
        saveBtn.setVisible(true);
        delete_friend2.setVisible(true);
        loadBtn.setVisible(true);
        loadAll.setVisible(true);
        currentFile = "group" + book_list.getSelectionModel().getSelectedItem().substring(6) + ".txt";
        friends_list.getItems().clear();
        ArrayList<Friend> loadFriends = CreateFriend.createAllFriends(currentFile);
        for (Friend f : loadFriends) {
            friends_list.getItems().add(f);
        }
    }

    public void loadBooks(ActionEvent actionEvent) throws IOException {
        FileReader fr = new FileReader("books.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        book_list.getItems().clear();
        while((line = br.readLine()) != null) {
            book_list.getItems().add(line);
        }
        book_list.setVisible(true);
        load2.setVisible(true);
        newGroup.setVisible(true);
        loadAll.setVisible(false);
        display_title.setVisible(false);
        vbox1.setVisible(false);
        vbox2.setVisible(false);
        saveBtn.setVisible(false);
        delete_friend2.setVisible(false);
        loadBtn.setVisible(false);
    }

    public void new_file(ActionEvent actionEvent) throws IOException {
        friends_list.getItems().clear();
        book_list.setVisible(false);
        load2.setVisible(false);
        newGroup.setVisible(false);
        loadAll.setVisible(true);
        display_title.setVisible(true);
        vbox1.setVisible(true);
        vbox2.setVisible(true);
        saveBtn.setVisible(true);
        delete_friend2.setVisible(true);
        loadBtn.setVisible(true);
    }

    public void loadAllFriends(ActionEvent actionEvent) throws IOException {
        currentFile = "allFriends.txt";
        friends_list.getItems().clear();
        ArrayList<Friend> loadFriends = CreateFriend.createAllFriends(currentFile);
        for (Friend f : loadFriends) {
            friends_list.getItems().add(f);
        }
    }
}