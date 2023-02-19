package com.example.supply_chain_management_system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class SupplyChain extends Application {
    private Pane createContent(){
        Pane root= new Pane();
//        root.setPrefSize(width,height+headerbar);
//        bodyPane.setMinSize(width,height);
//        bodyPane.setTranslateY(headerbar);
//        bodyPane.getChildren().addAll(productDetails.getAllProduct());
//
//        root.getChildren().addAll(headerBar(),bodyPane);

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