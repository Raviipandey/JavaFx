package com.example.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class HelloController {
    @FXML
    private TextField ans,num1,num2;

    @FXML
    protected void onAddButtonClick(){
        ans.setText("You clicked add");
        double First_no = Double.parseDouble(num1.getText());
        double Sec_no = Double.parseDouble(num2.getText());
        double Answer = First_no+Sec_no;
        ans.setText(String.valueOf(Answer));
    }

    @FXML
    protected void onSubButtonClick(){
        ans.setText("You clicked sub");
        double First_no = Double.parseDouble(num1.getText());
        double Sec_no = Double.parseDouble(num2.getText());
        double Answer = First_no-Sec_no;
        ans.setText(String.valueOf(Answer));

    }

}