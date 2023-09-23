package com.example.demo;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button btn;

    @FXML
    private TextField editA;

    @FXML
    public void initialize(){
        btn.addEventFilter(MouseEvent.MOUSE_CLICKED, mouseEvent ->
        {
            String res = editA.getText();
            int a = Integer.parseInt(res) + 100;
            welcomeText.setText("a="+a);
        });
    }
}
