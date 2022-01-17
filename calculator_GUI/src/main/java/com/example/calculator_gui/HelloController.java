package com.example.calculator_gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    public Label input;
    public Label answer;
    private String strAns;
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

    public void one(ActionEvent actionEvent) {
        answer.setText("");
        String curInput = input.getText();
        input.setText(curInput + "1");
        System.out.println("1");
    }

    public void two(ActionEvent actionEvent) {
        answer.setText("");
        String curInput = input.getText();
        input.setText(curInput + "2");
    }

    public void three(ActionEvent actionEvent) {
        answer.setText("");
        String curInput = input.getText();
        input.setText(curInput + "3");
    }

    public void four(ActionEvent actionEvent) {
        answer.setText("");
        String curInput = input.getText();
        input.setText(curInput + "4");
    }

    public void five(ActionEvent actionEvent) {
        String curInput = input.getText();
        input.setText(curInput + "5");
    }

    public void six(ActionEvent actionEvent) {
        answer.setText("");
        String curInput = input.getText();
        input.setText(curInput + "6");
    }

    public void seven(ActionEvent actionEvent) {
        answer.setText("");
        String curInput = input.getText();
        input.setText(curInput + "7");
    }

    public void eight(ActionEvent actionEvent) {
        answer.setText("");
        String curInput = input.getText();
        input.setText(curInput + "8");
    }

    public void nine(ActionEvent actionEvent) {
        answer.setText("");
        String curInput = input.getText();
        input.setText(curInput + "9");
    }

    public void zero(ActionEvent actionEvent) {
        answer.setText("");
        String curInput = input.getText();
        input.setText(curInput + "0");
    }

    public void leftB(ActionEvent actionEvent) {
        answer.setText("");
        String curInput = input.getText();
        input.setText(curInput + "(");
    }

    public void rightB(ActionEvent actionEvent) {
        answer.setText("");
        String curInput = input.getText();
        input.setText(curInput + ")");
    }

    public void add(ActionEvent actionEvent) {
        answer.setText("");
        String curInput = input.getText();
        input.setText(curInput + "+");
    }

    public void subtract(ActionEvent actionEvent) {
        answer.setText("");
        String curInput = input.getText();
        input.setText(curInput + "-");
    }

    public void multiply(ActionEvent actionEvent) {
        answer.setText("");
        String curInput = input.getText();
        input.setText(curInput + "*");
    }

    public void divide(ActionEvent actionEvent) {
        answer.setText("");
        String curInput = input.getText();
        input.setText(curInput + "/");
    }

    public void point(ActionEvent actionEvent) {
        answer.setText("");
        String curInput = input.getText();
        input.setText(curInput + ".");
    }

    public void ans(ActionEvent actionEvent) {
        String curInput = input.getText();
        input.setText(curInput + strAns);
    }

    public void clear(ActionEvent actionEvent) {
        input.setText("");
        answer.setText("");
    }

    public void equal(ActionEvent actionEvent) {
        answer.setText(Double.toString(eval(input.getText())));
        input.setText("");
    }

    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }

}