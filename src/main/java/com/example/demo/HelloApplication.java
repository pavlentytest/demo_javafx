package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
       /* FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Title");
        stage.setScene(scene);
        stage.show();
*/
        Button btOK = new Button("OK");
        Scene scene = new Scene(btOK, 200, 250);
        stage.setTitle("MyJavaFX"); // Set the stage title
        stage.setScene(scene); // Place the scene
        stage.show();



}

    public static void main(String[] args) {
        launch();
    }
}