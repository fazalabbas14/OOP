package com.example.finalproject;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class FrontPage {
    public Scene getScene(Stage stage)  {
        GridPane gridpane=new GridPane();
        Scene scene = new Scene(gridpane, 400, 550);

        stage.setTitle("Vehicle Rental System");
        Image logo = new Image(getClass().getResource("/car-logo.png").toExternalForm());
        ImageView car_logo= new ImageView(logo);
        gridpane.add(car_logo,0,0);
        car_logo.setFitHeight(150);
        car_logo.setFitWidth(150);


        // Car Image
        Image car_image = new Image(getClass().getResource("/Car.png").toExternalForm());
        ImageView car_imageView=new ImageView(car_image);
        gridpane.add(car_imageView,0,9);
        car_imageView.setFitHeight(350);
        car_imageView.setFitWidth(400);
        GridPane.setValignment(car_imageView, VPos.CENTER);

        //SignUP Button
        Button signup=new Button("SignUp");
        gridpane.add(signup,0,10);
        GridPane.setMargin(signup,new Insets(0,0,0,60));
        signup.setPrefWidth(120);
//        signup.setStyle("-fx-border-width:0;"+"-fx-border-color:transparent;"+"-fx-focus-color:transparent;"+"-fx-faint-focus-color:transparent;"+"-fx-background-inset:0;"+"-fx-padding:0;"+"-fx-effect:null;");

        //Button Style
        signup.setStyle("-fx-focus-color:transparent;"+"-fx-faint-focus-color:transparent;"+"-fx-padding:10;"+"-fx-background-color:white;"+"-fx-text-fill:red;");
        //Button Hover Effects
        signup.setOnMouseEntered(e->{
            signup.setCursor(Cursor.HAND);
            signup.setStyle("-fx-background-color:red;"+"-fx-text-fill:white;"+"-fx-padding:10;");
        });
        signup.setOnMouseExited(e->{
            signup.setCursor(Cursor.DEFAULT);
            signup.setStyle("-fx-background-color:white;"+"-fx-text-fill:red;"+"-fx-padding:10;");
        });
        //Drop Shadow
        DropShadow dropshadow=new DropShadow();
        dropshadow.setRadius(10.0);
        dropshadow.setOffsetX(2.0);
        dropshadow.setOffsetY(2.0);
        dropshadow.setColor(Color.color(0,0,0,0.5));
        signup.setEffect(dropshadow);

        // When Signup button clicked
        signup.setOnAction(e->{
            Signup signupscreen=new Signup();
            stage.setScene(signupscreen.getScene(stage));
        });

        //Login Button
        Button login=new Button("Login");
        gridpane.add(login,0,11);
        login.setPrefWidth(120);
        //Button Style
        login.setStyle("-fx-border-color:red;"+"-fx-border-width:1;"+"-fx-border-radius:5;"+"-fx-padding:8;"+"-fx-background-color:transparent;"+"-fx-text-fill:black;");
        //Button Hover Effects
        login.setOnMouseEntered(e->{
            login.setCursor(Cursor.HAND);
            login.setStyle("-fx-background-color:red;"+"-fx-text-fill:white;"+"-fx-padding:10;");
        });
        login.setOnMouseExited(e->{
            login.setCursor(Cursor.DEFAULT);
            login.setStyle("-fx-border-color:red;"+"-fx-border-width:2;"+"-fx-border-radius:5;"+"-fx-padding:8;"+"-fx-background-color:transparent;"+"-fx-text-fill:black;");
        });
        //Drop Shadow
        login.setEffect(dropshadow);

        //HBox for Button
        HBox buttons_hbox=new HBox(40);
        buttons_hbox.getChildren().addAll(signup,login);
        buttons_hbox.setAlignment(Pos.CENTER);
        buttons_hbox.setPadding(new Insets(0,0,20,0));

        // VBox
        VBox Vlayout=new VBox();

        // When Login Button clicked
        login.setOnAction(e->{
            Login loginscreen=new Login();
            stage.setScene(loginscreen.getScene(stage));
        });

        Vlayout.getChildren().addAll(car_logo,car_imageView,buttons_hbox);
        Vlayout.setAlignment(Pos.CENTER);

        stage.setResizable(false);
        return new Scene (Vlayout);
    }

}