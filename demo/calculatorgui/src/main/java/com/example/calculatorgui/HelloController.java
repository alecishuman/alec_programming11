package com.example.calculatorgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


import java.util.ArrayList;

public class HelloController {
    public Label input;
    public Label answer;
    public Button one;
    public Button two;
    public Button three;
    public Button four;
    public Button five;
    public Button six;
    public Button seven;
    public Button eight;
    public Button nine;
    public Button zero;
    public Button clear;
    public Button leftB;
    public Button rightB;
    public Button add;
    public Button subtract;
    public Button multiply;
    public Button divide;
    public Button point;
    public Button equal;
    public Button ans;
    public ArrayList<Double> numbers = new ArrayList<>();
    public ArrayList<String> symbols = new ArrayList<>();
    public Boolean curSymbol = false;

    public void one(ActionEvent actionEvent) {
        answer.setText("");
        String curInput = input.getText();
        if (curSymbol) {
            input.setText("1");
            curSymbol = false;
        } else {
            input.setText(curInput + "1");
        }

    }

    public void two(ActionEvent actionEvent) {
        answer.setText("");
        String curInput = input.getText();
        if (curSymbol) {
            input.setText("2");
            curSymbol = false;
        } else {
            input.setText(curInput + "2");
        }
    }

    public void three(ActionEvent actionEvent) {
        answer.setText("");
        String curInput = input.getText();
        if (curSymbol) {
            input.setText("3");
            curSymbol = false;
        } else {
            input.setText(curInput + "3");
        }
    }

    public void four(ActionEvent actionEvent) {
        answer.setText("");
        String curInput = input.getText();
        if (curSymbol) {
            input.setText("4");
            curSymbol = false;
        } else {
            input.setText(curInput + "4");
        }
    }

    public void five(ActionEvent actionEvent) {
        String curInput = input.getText();
        if (curSymbol) {
            input.setText("5");
            curSymbol = false;
        } else {
            input.setText(curInput + "5");
        }
    }

    public void six(ActionEvent actionEvent) {
        answer.setText("");
        String curInput = input.getText();
        if (curSymbol) {
            input.setText("6");
            curSymbol = false;
        } else {
            input.setText(curInput + "6");
        }
    }

    public void seven(ActionEvent actionEvent) {
        answer.setText("");
        String curInput = input.getText();
        if (curSymbol) {
            input.setText("7");
            curSymbol = false;
        } else {
            input.setText(curInput + "7");
        }
    }

    public void eight(ActionEvent actionEvent) {
        answer.setText("");
        String curInput = input.getText();
        if (curSymbol) {
            input.setText("8");
            curSymbol = false;
        } else {
            input.setText(curInput + "8");
        }
    }

    public void nine(ActionEvent actionEvent) {
        answer.setText("");
        String curInput = input.getText();
        if (curSymbol) {
            input.setText("9");
            curSymbol = false;
        } else {
            input.setText(curInput + "9");
        }
    }

    public void zero(ActionEvent actionEvent) {
        answer.setText("");
        String curInput = input.getText();
        if (curSymbol) {
            input.setText("0");
            curSymbol = false;
        } else {
            input.setText(curInput + "0");
        }
    }

    public void add(ActionEvent actionEvent) {
        answer.setText("");
        String curInput = input.getText();
        numbers.add(Double.parseDouble(curInput));
        symbols.add("+");
        input.setText("+");
        curSymbol = true;
    }

    public void subtract(ActionEvent actionEvent) {
        answer.setText("");
        String curInput = input.getText();
        numbers.add(Double.parseDouble(curInput));
        symbols.add("-");
        input.setText("-");
        curSymbol = true;
    }

    public void multiply(ActionEvent actionEvent) {
        answer.setText("");
        String curInput = input.getText();
        numbers.add(Double.parseDouble(curInput));
        symbols.add("*");
        input.setText("*");
        curSymbol = true;
    }

    public void divide(ActionEvent actionEvent) {
        answer.setText("");
        String curInput = input.getText();
        numbers.add(Double.parseDouble(curInput));
        symbols.add("/");
        input.setText("/");
        curSymbol = true;
    }

    public void point(ActionEvent actionEvent) {
        answer.setText("");
        String curInput = input.getText();
        input.setText(curInput + ".");
    }

    public void clear(ActionEvent actionEvent) {
        numbers = new ArrayList<>();
        symbols = new ArrayList<>();
        input.setText("");
        answer.setText("");
    }

    public void equal(ActionEvent actionEvent) {
        numbers.add(Double.parseDouble(input.getText()));
        answer.setText(Double.toString(eval()));
        numbers = new ArrayList<>();
        input.setText("");
    }

    public double eval() {
        while (symbols.size() >= 1) {
            if (symbols.get(0).equals("+")) {
                for (Double dasdf:
                        numbers) {
                    System.out.println(dasdf);
                }
                numbers.set(0, numbers.get(0) + numbers.get(1));
                numbers.remove(1);
                symbols.remove(0);
                for (Double doublasde:
                     numbers) {
                    System.out.println(doublasde);
                }
            } else if (symbols.get(0).equals("-")) {
                numbers.set(0, numbers.get(0) - numbers.get(1));
                numbers.remove(1);
                symbols.remove(0);
            } else if (symbols.get(0).equals("*")) {
                numbers.set(0, numbers.get(0) * numbers.get(1));
                numbers.remove(1);
                symbols.remove(0);
            } else if (symbols.get(0).equals("/")) {
                numbers.set(0, numbers.get(0) / numbers.get(1));
                numbers.remove(1);
                symbols.remove(0);
            }
        }
        return numbers.get(0);
    }
}