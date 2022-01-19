package com.example.friends_book;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

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

    public void add_friend(ActionEvent actionEvent) {
        Friend temp = new Friend(add_name.getText(), Integer.parseInt(add_age.getText()), Double.parseDouble(add_gpa.getText()));
        friends.add(temp);
        friends_list.getItems().add(temp);
        add_name.clear();
        add_age.clear();
        add_gpa.clear();
        if (display_name.getText().equals("")) {
            display_title.setText("Choose Friend");
        }
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
}