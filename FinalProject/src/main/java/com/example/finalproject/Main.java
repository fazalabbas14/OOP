package com.example.finalproject;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane=new GridPane();
        Scene scene=new Scene(gridPane,400,550);
        FrontPage frontPage=new FrontPage();
        primaryStage.setScene(frontPage.getScene(primaryStage));
        primaryStage.setTitle("Vehicle Rental System");

        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
