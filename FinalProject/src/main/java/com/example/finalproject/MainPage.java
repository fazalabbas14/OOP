package com.example.finalproject;


import javafx.geometry.Insets;
import javafx.geometry.VPos;
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
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class MainPage {

    public Scene getScene(Stage Stage) {
        GridPane gridPane=new GridPane();
        VBox mainPage_layout=new VBox();
        Scene scene = new Scene(gridPane, 400, 550);
        Stage.setTitle("ZohFaz Rental Service");

        Text signup_title=new Text("Welcome to ZohFaz Rental Service");
        signup_title.setStyle("-fx-font-size:20;"+"-fx-font-weight:bolder;");
        signup_title.setFill(Color.RED);
        HBox title_hbox=new HBox();
        title_hbox.getChildren().add(signup_title);
        gridPane.add(title_hbox,0,0);
        title_hbox.setPadding(new Insets(10,0,0,35));

        Text signup_slogan=new Text("We promise the best rides for you.");
        signup_slogan.setStyle("-fx-font-size:15;");
        HBox slogan_hbox=new HBox();
        slogan_hbox.getChildren().add(signup_slogan);
        gridPane.add(slogan_hbox,0,1);
        slogan_hbox.setPadding(new Insets(0,0,0,80));

        // Rent A Car Button Start
        Button signup_1=new Button("Rent A Car");
        signup_1.setPadding(new Insets(10,130,10,130));
        signup_1.setStyle("-fx-focus-color:transparent;"+"-fx-faint-focus-color:transparent;"+"-fx-background-color:white;"+"-fx-text-fill:red;"+"-fx-font-size:25;");
        //Button Hover Effects
        signup_1.setOnMouseEntered(e->{
            signup_1.setCursor(Cursor.HAND);
            signup_1.setPadding(new Insets(10,130,10,130));
            signup_1.setStyle("-fx-background-color:red;"+"-fx-text-fill:white;"+"-fx-font-size:25;");
        });
        signup_1.setOnMouseExited(e->{
            signup_1.setCursor(Cursor.DEFAULT);
            signup_1.setPadding(new Insets(10,130,10,130));
            signup_1.setStyle("-fx-background-color:white;"+"-fx-text-fill:red;"+"-fx-font-size:25;");
        });
        //Drop Shadow
        DropShadow dropshadow=new DropShadow();
        dropshadow.setRadius(10.0);
        dropshadow.setOffsetX(2.0);
        dropshadow.setOffsetY(2.0);
        dropshadow.setColor(Color.color(0,0,0,0.5));
        signup_1.setEffect(dropshadow);
        // Rent A Car Button End

        // Add A Car For Rent Button Start
        Button signup_2=new Button("Add A Car For Rent");
        signup_2.setMaxWidth(380);
        signup_2.setPadding(new Insets(10,0,10,0));
        signup_2.setStyle("-fx-focus-color:transparent;"+"-fx-faint-focus-color:transparent;"+"-fx-background-color:white;"+"-fx-text-fill:red;"+"-fx-font-size:25;");
        //Button Hover Effects
        signup_2.setOnMouseEntered(e->{
            signup_2.setCursor(Cursor.HAND);
            signup_2.setMaxWidth(380);
            signup_2.setPadding(new Insets(10,0,10,0));
            signup_2.setStyle("-fx-background-color:red;"+"-fx-text-fill:white;"+"-fx-font-size:25;");
        });
        signup_2.setOnMouseExited(e->{
            signup_2.setCursor(Cursor.DEFAULT);
            signup_2.setMaxWidth(380);
            signup_2.setPadding(new Insets(10,0,10,0));
            signup_2.setStyle("-fx-background-color:white;"+"-fx-text-fill:red;"+"-fx-font-size:25;");
        });
        //Drop Shadow
        signup_2.setEffect(dropshadow);


        // Return A Car Button Start
        Button signup_3=new Button("Return A Car");
        signup_3.setMaxWidth(380);
        signup_3.setPadding(new Insets(10,0,10,0));
        signup_3.setStyle("-fx-focus-color:transparent;"+"-fx-faint-focus-color:transparent;"+"-fx-background-color:white;"+"-fx-text-fill:red;"+"-fx-font-size:25;");
        //Button Hover Effects
        signup_3.setOnMouseEntered(e->{
            signup_3.setCursor(Cursor.HAND);
            signup_3.setMaxWidth(380);
            signup_3.setPadding(new Insets(10,0,10,0));
            signup_3.setStyle("-fx-background-color:red;"+"-fx-text-fill:white;"+"-fx-font-size:25;");
        });
        signup_3.setOnMouseExited(e->{
            signup_3.setCursor(Cursor.DEFAULT);
            signup_3.setMaxWidth(380);
            signup_3.setPadding(new Insets(10,0,10,0));
            signup_3.setStyle("-fx-background-color:white;"+"-fx-text-fill:red;"+"-fx-font-size:25;");
        });
        //Drop Shadow
        signup_3.setEffect(dropshadow);

        VBox button_vbox=new VBox(20);
        button_vbox.getChildren().addAll(signup_1,signup_2,signup_3);
        gridPane.add(button_vbox,0,2);
        button_vbox.setPadding(new Insets(40,0,0,10));

        // Back Button Start
        Button signup_4=new Button("Back");
        signup_4.setPadding(new Insets(5,55,5,55));
        signup_4.setStyle("-fx-focus-color:transparent;"+"-fx-faint-focus-color:transparent;"+"-fx-background-color:red;"+"-fx-text-fill:white;"+"-fx-font-size:22;");
        //Button Hover Effects
        signup_4.setOnMouseEntered(e->{
            signup_4.setCursor(Cursor.HAND);
            signup_4.setPadding(new Insets(5,55,5,55));
            signup_4.setStyle("-fx-background-color:white;"+"-fx-text-fill:red;"+"-fx-font-size:22;");
        });
        signup_4.setOnMouseExited(e->{
            signup_4.setCursor(Cursor.DEFAULT);
            signup_4.setPadding(new Insets(5,55,5,55));
            signup_4.setStyle("-fx-background-color:red;"+"-fx-text-fill:white;"+"-fx-font-size:22;");
        });
        //Drop Shadow
        signup_4.setEffect(dropshadow);

        // background Image
        Image bg_image = new Image(getClass().getResource("/Car.png").toExternalForm());
        ImageView bg_imageView=new ImageView(bg_image);
        gridPane.add(bg_imageView,0,3);
        bg_imageView.setFitHeight(350);
        bg_imageView.setFitWidth(400);
        GridPane.setValignment(bg_imageView, VPos.CENTER);
        bg_imageView.setOpacity(0.3);


        VBox back_vbox=new VBox();
        back_vbox.getChildren().add(signup_4);
        gridPane.add(back_vbox,0,3);
        back_vbox.setPadding(new Insets(20,0,0,130));

        signup_1.setOnAction(e->{
            Categories categoriePage=new Categories();
            Stage.setScene(categoriePage.getScene(Stage));
        });

        signup_4.setOnAction(e->{
            Login loginpage=new Login();
            Stage.setScene(loginpage.getScene(Stage));
        });

        mainPage_layout.getChildren().addAll(title_hbox,slogan_hbox,button_vbox,back_vbox,bg_imageView);

        Stage.setResizable(false);
        return new Scene(mainPage_layout,400,550);
    }
}
