package com.example.finalproject;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;

public class Categories  {

    public Scene getScene(Stage Stage) {
        GridPane gridPane=new GridPane();
        VBox category_Layout=new VBox();
        Scene scene = new Scene(gridPane, 400, 550);
        Stage.setTitle("ZohFaz Rental System");

        gridPane.setPadding(new Insets(20,0,0,10));

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

        //Add Button
        Button add_button=new Button("+");
        gridPane.add(add_button,0,0);
        GridPane.setMargin(add_button,new Insets(0,0,0,335));
        add_button.setPrefWidth(40);
        add_button.setPrefHeight(40);
        add_button.setStyle("-fx-border-radius:50%;"+"-fx-background-radius:50%;"+"-fx-background-color:red;");
        add_button.setFont(Font.font("Arial", FontWeight.BOLD,20));
        add_button.setTextFill(Paint.valueOf("White"));

        //Button Hover Effects
        add_button.setOnMouseEntered(e->{
            add_button.setCursor(Cursor.HAND);
            add_button.setStyle("-fx-border-radius:50%;"+"-fx-background-radius:50%;"+"-fx-background-color:white;");
            add_button.setTextFill(Paint.valueOf("Red"));
        });
        add_button.setOnMouseExited(e->{
            add_button.setCursor(Cursor.DEFAULT);
            add_button.setStyle("-fx-border-radius:50%;"+"-fx-background-radius:50%;"+"-fx-background-color:red;");
            add_button.setTextFill(Paint.valueOf("White"));
        });
        //Drop Shadow
        add_button.setEffect(dropshadow);

        HBox upper_buttonshbox=new HBox(300);
        upper_buttonshbox.getChildren().addAll(back_button,add_button);
        upper_buttonshbox.setPadding(new Insets(0,0,10,10));



        Text category_title=new Text("Available Categories of Vehicles");
        gridPane.add(category_title,0,1);
        category_title.setFill(Paint.valueOf("Red"));
        category_title.setStyle("-fx-font-size:20;"+"-fx-font-weight:bold;");
        HBox title_hbox=new HBox();
        title_hbox.getChildren().add(category_title);
        title_hbox.setPadding(new Insets(0,0,30,0));
        title_hbox.setAlignment(Pos.CENTER);

        // Image
        Image category_img=new Image(getClass().getResource("/Cars.png").toExternalForm());
        ImageView category_imgview=new ImageView(category_img);
        gridPane.add(category_imgview,0,2);
        category_imgview.setFitWidth(400);
        category_imgview.setFitHeight(170);
        GridPane.setMargin(category_imgview,new Insets(20,0,0,0));


        Image carbutton_image=new Image(getClass().getResource("/car-logo1.png").toExternalForm());
        ImageView carbutton_imgview=new ImageView(carbutton_image);
        carbutton_imgview.setFitWidth(40);
        carbutton_imgview.setFitHeight(30);
        Image bikebutton_image=new Image(getClass().getResource("/bike-logo.png").toExternalForm());
        ImageView bikebutton_imgview=new ImageView(bikebutton_image);
        bikebutton_imgview.setFitWidth(40);
        bikebutton_imgview.setFitHeight(30);
        Image vanbutton_image=new Image(getClass().getResource("/van-logo.png").toExternalForm());
        ImageView vanbutton_imgview=new ImageView(vanbutton_image);
        vanbutton_imgview.setFitWidth(40);
        vanbutton_imgview.setFitHeight(30);


        // Available Car Button Start
        Button signup_1=new Button("Available Cars",carbutton_imgview);
        signup_1.setPadding(new Insets(10,100,10,90));
        signup_1.setStyle("-fx-focus-color:transparent;"+"-fx-faint-focus-color:transparent;"+"-fx-background-color:red;"+"-fx-text-fill:white;"+"-fx-font-size:20;");
        //Button Hover Effects
        signup_1.setOnMouseEntered(e->{
            signup_1.setCursor(Cursor.HAND);
            signup_1.setPadding(new Insets(10,100,10,90));
            signup_1.setStyle("-fx-background-color:white;"+"-fx-text-fill:red;"+"-fx-font-size:20;");
        });
        signup_1.setOnMouseExited(e->{
            signup_1.setCursor(Cursor.DEFAULT);
            signup_1.setPadding(new Insets(10,100,10,90));
            signup_1.setStyle("-fx-background-color:red;"+"-fx-text-fill:white;"+"-fx-font-size:20;");
        });
        //Drop Shadow
        signup_1.setEffect(dropshadow);
        // Rent A Car Button End

        // Add A Car For Rent Button Start
        Button signup_2=new Button("Available Bikes",bikebutton_imgview);
        signup_2.setPadding(new Insets(10,95,10,88));
        signup_2.setStyle("-fx-focus-color:transparent;"+"-fx-faint-focus-color:transparent;"+"-fx-background-color:red;"+"-fx-text-fill:white;"+"-fx-font-size:20;");
        //Button Hover Effects
        signup_2.setOnMouseEntered(e->{
            signup_2.setCursor(Cursor.HAND);
            signup_2.setPadding(new Insets(10,95,10,88));
            signup_2.setStyle("-fx-background-color:white;"+"-fx-text-fill:red;"+"-fx-font-size:20;");
        });
        signup_2.setOnMouseExited(e->{
            signup_2.setCursor(Cursor.DEFAULT);
            signup_2.setPadding(new Insets(10,95,10,88));
            signup_2.setStyle("-fx-background-color:red;"+"-fx-text-fill:white;"+"-fx-font-size:20;");
        });
        //Drop Shadow
        signup_2.setEffect(dropshadow);


        // Return A Car Button Start
        Button signup_3=new Button("Available Vans",vanbutton_imgview);
        signup_3.setPadding(new Insets(10,97,10,90));
        signup_3.setStyle("-fx-focus-color:transparent;"+"-fx-faint-focus-color:transparent;"+"-fx-background-color:red;"+"-fx-text-fill:white;"+"-fx-font-size:20;");
        //Button Hover Effects
        signup_3.setOnMouseEntered(e->{
            signup_3.setCursor(Cursor.HAND);
            signup_3.setPadding(new Insets(10,97,10,90));
            signup_3.setStyle("-fx-background-color:white;"+"-fx-text-fill:red;"+"-fx-font-size:20;");
        });
        signup_3.setOnMouseExited(e->{
            signup_3.setCursor(Cursor.DEFAULT);
            signup_3.setPadding(new Insets(10,97,10,90));
            signup_3.setStyle("-fx-background-color:red;"+"-fx-text-fill:white;"+"-fx-font-size:20;");
        });
        //Drop Shadow
        signup_3.setEffect(dropshadow);

        VBox button_vbox=new VBox(20);
        button_vbox.getChildren().addAll(signup_1,signup_2,signup_3);
        gridPane.add(button_vbox,0,3);
        button_vbox.setPadding(new Insets(30,0,0,23));

        back_button.setOnAction(e->{
            MainPage mainPage=new MainPage();
            Stage.setScene(mainPage.getScene(Stage));
        });

        signup_1.setOnAction(e->{
            Cars available_cars=new Cars();
            Stage.setScene(available_cars.getScene(Stage));
        });

        signup_2.setOnAction(e->{
            Bikes available_bikes=new Bikes();
            Stage.setScene(available_bikes.getScene(Stage));
        });

        signup_3.setOnAction(e->{
            Vans available_vans=new Vans();
            Stage.setScene(available_vans.getScene(Stage));
        });

        category_Layout.getChildren().addAll(upper_buttonshbox,title_hbox,category_imgview,button_vbox);
        category_Layout.setPadding(new Insets(20,0,0,0));

        Stage.setResizable(false);
        return new Scene(category_Layout,400,550);
    }
}
