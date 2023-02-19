package com.example.supply_chain_management_system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class SupplyChain extends Application {


    private GridPane loginPage(){
        Label emailLabel= new Label("Email");
        Label passwordLabel=new Label("Password");
        Label messageLabel= new Label("I am message");
        TextField emailTextField=new TextField();
        PasswordField passwordField= new PasswordField();
        Button loginButton= new Button("Login");



        GridPane gridPane= new GridPane();
//        gridPane.setMinSize(bodyPane.getMinWidth(),bodyPane.getMinHeight());
//
//        gridPane.setVgap(5);
//        gridPane.setHgap(5);
//        gridPane.setStyle("-fx-background-color: #C0C0C0");
//        gridPane.setAlignment(Pos.CENTER);

        // first is x coordinate and seond is y
        gridPane.add(emailLabel,0,0);
        gridPane.add(emailTextField,1,0);
        gridPane.add(passwordLabel,0,1);
        gridPane.add(passwordField,1,1);

        gridPane.add(loginButton,0,2);
        gridPane.add(messageLabel,1,2);
        return gridPane;
    }
    private Pane createContent(){
        Pane root= new Pane();
//        root.setPrefSize(width,height+headerbar);
//        bodyPane.setMinSize(width,height);
//        bodyPane.setTranslateY(headerbar);
//        bodyPane.getChildren().addAll(productDetails.getAllProduct());
//
       root.getChildren().addAll(loginPage());

        return root;
    }
    @Override
    public void start(Stage stage) throws IOException {
       // FXMLLoader fxmlLoader = new FXMLLoader(SupplyChain.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(createContent());
        stage.setTitle("Project!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}