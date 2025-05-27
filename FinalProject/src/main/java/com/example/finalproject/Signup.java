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


public class Signup  {

    public Scene getScene(Stage Stage) {
        GridPane gridPane=new GridPane();
        VBox signup_layout=new VBox();
        Scene scene = new Scene(gridPane, 400, 550);
        Stage.setTitle("Sign Up");

        gridPane.setPadding(new Insets(20, 0, 0, 10));


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


        Text signup_title=new Text("Sign Up");
        gridPane.add(signup_title,0,0);
        signup_title.setStyle("-fx-font-size:25;"+"-fx-font-weight:bolder;");

        HBox signup_upperhbox=new HBox(95);
        signup_upperhbox.getChildren().addAll(back_button,signup_title);
        signup_upperhbox.setPadding(new Insets(0,0,0,10));



        Label firstname_label=new Label("First name");
        TextField firstname_field=new TextField();
        VBox first_vbox=new VBox();
        first_vbox.getChildren().addAll(firstname_label,firstname_field);
        gridPane.add(first_vbox,0,4);

        Label lastname_label=new Label("Last name");
        TextField lastname_field=new TextField();
        VBox second_vbox=new VBox();
        second_vbox.getChildren().addAll(lastname_label,lastname_field);
        gridPane.add(second_vbox,0,4);

        //HBox username
        HBox username_hbox=new HBox();
        username_hbox.getChildren().addAll(first_vbox,second_vbox);
        gridPane.add(username_hbox,0,3);
        username_hbox.setPadding(new Insets(15,0,0,10));
        username_hbox.setSpacing(50.0);
        username_hbox.setStyle("-fx-focus-color:transparent;"+"-fx-faint-focus-color:transparent;");


        Label email_label=new Label("Email");
        TextField email_field=new TextField();
        VBox email_vbox=new VBox();
        email_vbox.getChildren().addAll(email_label,email_field);
        gridPane.add(email_vbox,0,4);
        email_field.setMaxWidth(350.0);
        email_vbox.setPadding(new Insets(10,0,0,10));
        email_vbox.setStyle("-fx-focus-color:transparent;"+"-fx-faint-focus-color:transparent;");


        Label phone_label = new Label("Phone Number");
        TextField phone_field = new TextField();
        VBox phone_hbox=new VBox();
        phone_hbox.getChildren().addAll(phone_label,phone_field);
        gridPane.add(phone_hbox,0,5);
        phone_field.setMaxWidth(350.0);
        phone_hbox.setPadding(new Insets(10,0,0,10));
        phone_hbox.setStyle("-fx-focus-color:transparent;"+"-fx-faint-focus-color:transparent;");


        Label password_label = new Label("Password");
        TextField password_field = new TextField();
        VBox password_vbox=new VBox();
        password_vbox.getChildren().addAll(password_label,password_field);
        gridPane.add(password_vbox,0,6);
        password_field.setMaxWidth(350.0);
        password_vbox.setPadding(new Insets(10,0,0,10));
        password_vbox.setStyle("-fx-focus-color:transparent;"+"-fx-faint-focus-color:transparent;");




        Label confirmpassword_label = new Label("Confirm Password");
        TextField confirmpassword_field = new TextField();
        VBox confirmpassword_vbox=new VBox();
        confirmpassword_vbox.getChildren().addAll(confirmpassword_label,confirmpassword_field);
        gridPane.add(confirmpassword_vbox,0,7);
        confirmpassword_field.setMaxWidth(350.0);
        confirmpassword_vbox.setPadding(new Insets(10,0,40,10));
        confirmpassword_vbox.setStyle("-fx-focus-color:transparent;"+"-fx-faint-focus-color:transparent;");



        // Register Button
        Button signup=new Button("Register");
        gridPane.add(signup,0,10);
        signup.setMaxWidth(120);
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
        signup.setEffect(dropshadow);

        // background Image
        Image bg_image = new Image(getClass().getResource("/Car.png").toExternalForm());
        ImageView bg_imageView=new ImageView(bg_image);
        gridPane.add(bg_imageView,0,10);
        bg_imageView.setFitHeight(350);
        bg_imageView.setFitWidth(400);
        bg_imageView.setOpacity(0.3);

        signup.setOnAction(e->{
            Login loginpage=new Login();
            Stage.setScene(loginpage.getScene(Stage));
        });

        back_button.setOnAction(e->{
            FrontPage frontpage=new FrontPage();
            Stage.setScene(frontpage.getScene(Stage));
        });


        signup_layout.getChildren().addAll(signup_upperhbox,username_hbox,email_vbox,password_vbox,confirmpassword_vbox,signup,bg_imageView);
        signup_layout.setAlignment(Pos.CENTER);
        signup_layout.setPadding(new Insets(170,0,0,10));

        Stage.setResizable(false);
        return new Scene(signup_layout,400,550);
    }
}
