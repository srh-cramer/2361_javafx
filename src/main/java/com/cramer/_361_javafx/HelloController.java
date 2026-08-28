package com.cramer._361_javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField inputField;
    @FXML
    private CheckBox checkbox;

    @FXML
    private void onKlickMichButtonClick() {
        welcomeText.setText("Neuer Text für mein welcomeLabel");
    }

    @FXML
    private void onTextEntered(){
        String text = inputField.getText();
        System.out.println("Text eingegeben: " + text);
    }

    @FXML
    private void onCheckboxKlicked(){
        System.out.println("Checkbox was used.");
        System.out.println("Is checkbox selected? " + checkbox.isSelected());
    }

    @FXML
    private void handleColor(ActionEvent event){
        Button clickedButton = (Button) event.getSource();
        String buttonColor = clickedButton.getText();
        System.out.println("Geklickter Button: " + buttonColor);
    }
}
