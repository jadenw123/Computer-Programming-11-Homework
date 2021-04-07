package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

import java.awt.*;

public class Controller {
    public Label labelDisplay;

    public void addNumber(int number){
        String display = labelDisplay.getText() + number;
        labelDisplay.setText(display);
    }

    public void addOperator(String operator){
        String display = labelDisplay.getText() + operator;
        labelDisplay.setText(display);
    }

    public void button1(ActionEvent actionEvent) {
        addNumber(1);
    }

    public void button2(ActionEvent actionEvent) {
        addNumber(2);
    }

    public void button3(ActionEvent actionEvent) {
        addNumber(3);
    }

    public void button4(ActionEvent actionEvent) {
        addNumber(4);
    }

    public void button5(ActionEvent actionEvent) {
        addNumber(5);
    }

    public void button6(ActionEvent actionEvent) {
        addNumber(6);
    }

    public void button7(ActionEvent actionEvent) {
        addNumber(7);
    }

    public void button8(ActionEvent actionEvent) {
        addNumber(8);
    }

    public void button9(ActionEvent actionEvent) {
        addNumber(9);
    }

    public void button0(ActionEvent actionEvent) {
        addNumber(0);
    }

    public void buttonEquals(ActionEvent actionEvent) {
    }

    public void buttonPlus(ActionEvent actionEvent) {
    }

    public void buttonMinus(ActionEvent actionEvent) {
    }

    public void buttonMultiply(ActionEvent actionEvent) {
    }

    public void buttonDivide(ActionEvent actionEvent) {
    }
}
