package com.cramer._361_javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField inputField;

    @FXML
    private void onKlickMichButtonClick() {
        welcomeText.setText("Neuer Text für mein welcomeLabel");
    }

    @FXML
    private void onTextEntered(){
        String text = inputField.getText();
        System.out.println("Text eingegeben: " + text);
    }

    public String returnHello(){
        return "Hello!";
    }
}
