package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.*;
import java.util.ArrayList;

public class Controller {


    public TextField textScreen;
    private int operators;
    private int answer;
    private int number;
    public void operation(){
        switch (operators){
            case 1:
                answer = number + Integer.parseInt(textScreen.getText());
                textScreen.setText(Integer.toString(answer));
                break;

            case 2:
                answer = number - Integer.parseInt(textScreen.getText());
                textScreen.setText(Integer.toString(answer));
                break;

            case 3:
                answer = number * Integer.parseInt(textScreen.getText());

                textScreen.setText(Integer.toString(answer));
                break;

            case 4:
                answer = number / Integer.parseInt(textScreen.getText());
                textScreen.setText(Integer.toString(answer));
                break;
        }
    }


    public void addNumber(String number){
        String display = textScreen.getText() + number;
        textScreen.setText(display);
    }

    public void addOperator(String operator){
        String display = textScreen.getText() + operator;
        textScreen.setText(display);
    }

    ArrayList<String> numberList = new ArrayList<>();
    ArrayList<String> operatorList = new ArrayList<>();


    public void button1(ActionEvent actionEvent) {
        addNumber("1");
        numberList.add("1");
    }

    public void button2(ActionEvent actionEvent) {
        addNumber("2");
        numberList.add("2");
    }

    public void button3(ActionEvent actionEvent) {
        addNumber("3");
        numberList.add("3");
    }

    public void button4(ActionEvent actionEvent) {
        addNumber("4");
        numberList.add("4");
    }

    public void button5(ActionEvent actionEvent) {
        addNumber("5");
        numberList.add("5");
    }

    public void button6(ActionEvent actionEvent) {
        addNumber("6");
        numberList.add("6");
    }

    public void button7(ActionEvent actionEvent) {
        addNumber("7");
        numberList.add("7");
    }

    public void button8(ActionEvent actionEvent) {
        addNumber("8");
        numberList.add("8");
    }

    public void button9(ActionEvent actionEvent) {
        addNumber("9");
        numberList.add("9");
    }

    public void button0(ActionEvent actionEvent) {
        addNumber("0");
        numberList.add("0");
    }

    public void buttonEquals(ActionEvent actionEvent){
        operation();
        }


    public void buttonPlus(ActionEvent actionEvent) {
        number = Integer.parseInt(textScreen.getText());
        operators = 1;
        textScreen.setText("");
    }

    public void buttonMinus(ActionEvent actionEvent) {
        number = Integer.parseInt(textScreen.getText());
        operators = 2;
        textScreen.setText("");
    }

    public void buttonMultiply(ActionEvent actionEvent) {
        number = Integer.parseInt(textScreen.getText());
        operators = 3;
        textScreen.setText("");
    }

    public void buttonDivide(ActionEvent actionEvent) {
        number = Integer.parseInt(textScreen.getText());
        operators = 4;
        textScreen.setText("");
    }



    public void buttonClear(ActionEvent actionEvent) {
            numberList.clear();
            operatorList.clear();
            textScreen.setText("");
    }

}
