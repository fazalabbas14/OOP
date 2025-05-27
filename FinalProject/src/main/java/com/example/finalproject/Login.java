package com.example.finalproject;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Login {

    public Scene getScene(Stage Stage) {
        GridPane gridPane=new GridPane();

        VBox login_layout=new VBox();
        Scene scene = new Scene(gridPane, 400, 550);

        gridPane.setPadding(new Insets(20, 0, 0, 10));

        Stage.setTitle("Login");
        Text login_title=new Text("Login");
        gridPane.add(login_title,0,0);
        login_title.setStyle("-fx-font-size:25;"+"-fx-font-weight:bolder;");

        //back button
        Button back_button=new Button("<");
        gridPane.add(back_button,0,0);
        back_button.setPrefWidth(40);
        back_button.setPrefHeight(20);
        back_button.setStyle("-fx-border-radius:15%;"+"-fx-background-radius:15%;"+"-fx-background-color:red;");
        back_button.setFont(Font.font("Arial", FontWeight.BOLD,15));
        back_button.setTextFill(Paint.valueOf("White"));

        //Button Hover Effects
        back_button.setOnMouseEntered(e->{
            back_button.setCursor(Cursor.HAND);
            back_button.setStyle("-fx-border-radius:15%;"+"-fx-background-radius:15%;"+"-fx-background-color:white;");
            back_button.setTextFill(Paint.valueOf("Red"));
        });
        back_button.setOnMouseExited(e->{
            back_button.setCursor(Cursor.DEFAULT);
            back_button.setStyle("-fx-border-radius:15%;"+"-fx-background-radius:15%;"+"-fx-background-color:red;");
            back_button.setTextFill(Paint.valueOf("White"));
        });
        //Drop Shadow
        DropShadow dropshadow=new DropShadow();
        dropshadow.setRadius(10.0);
        dropshadow.setOffsetX(2.0);
        dropshadow.setOffsetY(2.0);
        dropshadow.setColor(Color.color(0,0,0,0.5));
        back_button.setEffect(dropshadow);

        HBox login_upperhbox=new HBox(100);
        login_upperhbox.getChildren().addAll(back_button,login_title);
        login_upperhbox.setPadding(new Insets(60,0,0,10));

        // background Image
        Image bg_image = new Image(getClass().getResource("/Car.png").toExternalForm());
        ImageView bg_imageView=new ImageView(bg_image);
        gridPane.add(bg_imageView,0,3);
        bg_imageView.setFitHeight(350);
        bg_imageView.setFitWidth(400);
        bg_imageView.setOpacity(0.3);


        Label username_label=new Label("Username");
        username_label.setStyle("-fx-font-size:16;");
        TextField username_field=new TextField();
        username_field.setMaxWidth(300.0);

        VBox username_vbox=new VBox();// VBOX
        username_vbox.getChildren().addAll(username_label,username_field);
        username_vbox.setPadding(new Insets(65,0,0,45));
        gridPane.add(username_vbox,0,1);
        username_field.setPadding(new Insets(5,0,5,0));
        username_field.setStyle("-fx-focus-color:transparent;"+"-fx-faint-focus-color:transparent;");


        Label password_label = new Label("Password");
        password_label.setStyle("-fx-font-size:16;");
        TextField password_field = new TextField();


        VBox password_vbox=new VBox();
        password_vbox.getChildren().addAll(password_label,password_field);
        password_vbox.setPadding(new Insets(5,0,20,45));

        gridPane.add(password_vbox,0,2);
        password_field.setMaxWidth(300.0);
        password_field.setPadding(new Insets(5,0,5,0));
        password_field.setStyle("-fx-focus-color:transparent;"+"-fx-faint-focus-color:transparent;");


        // Register Button
        Button login=new Button("Login");
        gridPane.add(login,0,3);
        login.setMaxWidth(120);

        //Button Style
        login.setStyle("-fx-focus-color:transparent;"+"-fx-faint-focus-color:transparent;"+"-fx-padding:10;"+"-fx-background-color:white;"+"-fx-text-fill:red;");
        //Button Hover Effects
        login.setOnMouseEntered(e->{
            login.setCursor(Cursor.HAND);
            login.setStyle("-fx-background-color:red;"+"-fx-text-fill:white;"+"-fx-padding:10;");
        });
        login.setOnMouseExited(e->{
            login.setCursor(Cursor.DEFAULT);
            login.setStyle("-fx-background-color:white;"+"-fx-text-fill:red;"+"-fx-padding:10;");
        });
        //Drop Shadow
        login.setEffect(dropshadow);


        login_layout.getChildren().addAll(login_upperhbox,username_vbox,password_vbox,login,bg_imageView);
        login_layout.setAlignment(Pos.CENTER);
        login_layout.setPadding(new Insets(40,0,0,10));

        back_button.setOnAction(e->{
            FrontPage frontpage=new FrontPage();
            Stage.setScene(frontpage.getScene(Stage));
        });

        login.setOnAction(e->{
                MainPage mainPage=new MainPage();
                Stage.setScene(mainPage.getScene(Stage));
        });

        Stage.setResizable(false);
        return new Scene(login_layout,400,550);
    }
}
