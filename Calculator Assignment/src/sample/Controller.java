package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

import java.awt.*;
import java.util.ArrayList;

public class Controller {
    public Label labelDisplay;


    public void addNumber(String number){
        String display = labelDisplay.getText() + number;
        labelDisplay.setText(display);
    }

    public void addOperator(String operator){
        String display = labelDisplay.getText() + operator;
        labelDisplay.setText(display);
    }

    ArrayList<Integer> numberList = new ArrayList<>();
    ArrayList<String> operatorList = new ArrayList<>();


    public void button1(ActionEvent actionEvent) {
        addNumber("1");
        numberList.add(1);
    }

    public void button2(ActionEvent actionEvent) {
        addNumber("2");
        numberList.add(2);
    }

    public void button3(ActionEvent actionEvent) {
        addNumber("3");
        numberList.add(3);
    }

    public void button4(ActionEvent actionEvent) {
        addNumber("4");
        numberList.add(4);
    }

    public void button5(ActionEvent actionEvent) {
        addNumber("5");
        numberList.add(5);
    }

    public void button6(ActionEvent actionEvent) {
        addNumber("6");
        numberList.add(6);
    }

    public void button7(ActionEvent actionEvent) {
        addNumber("7");
        numberList.add(7);
    }

    public void button8(ActionEvent actionEvent) {
        addNumber("8");
        numberList.add(8);
    }

    public void button9(ActionEvent actionEvent) {
        addNumber("9");
        numberList.add(9);
    }

    public void button0(ActionEvent actionEvent) {
        addNumber("0");
        numberList.add(0);
    }

    public void buttonEquals(ActionEvent actionEvent){

    }

    public void buttonPlus(ActionEvent actionEvent) {
        addOperator("+");
        operatorList.add("+");
    }

    public void buttonMinus(ActionEvent actionEvent) {
        addOperator("-");
        operatorList.add("-");
    }

    public void buttonMultiply(ActionEvent actionEvent) {
        addOperator("x");
        operatorList.add("x");
    }

    public void buttonClear(ActionEvent actionEvent) { ;
            numberList.clear();
            operatorList.clear();
            labelDisplay.setText("0");
            addOperator("0");

    }
}
