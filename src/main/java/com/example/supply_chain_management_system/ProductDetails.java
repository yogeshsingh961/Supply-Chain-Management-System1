package com.example.supply_chain_management_system;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleSetProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;

public class ProductDetails {

    public TableView<Product> productTable;

    public Pane getAllProducts(){
        TableColumn id= new TableColumn("Id");
        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        TableColumn name= new TableColumn("Name");
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        TableColumn price= new TableColumn("Price");
        price.setCellValueFactory(new PropertyValueFactory<>("price"));

//        ObservableList<Product> data= FXCollections.observableArrayList();
//        data.add(new Product(1,"Lenovo",8439));
//        data.add(new Product(2,"HP", 85439));
//          productTable=new TableView<>();
//          productTable.setItems(data);
//          productTable.getColumns().addAll(id,name,price);

          ObservableList<Product>products= Product.getAllProducts();

        productTable=new TableView<>();
        productTable.setItems(products);
        productTable.getColumns().addAll(id,name,price);
        productTable.setMinSize(SupplyChain.width,SupplyChain.height);
        productTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        Pane tablePane= new Pane();

        tablePane.setStyle("-fx-background-color: #C0C0C0");
        tablePane.setMinSize(SupplyChain.width,SupplyChain.height);
        tablePane.getChildren().add(productTable);


//        tablePane.setMinSize(SupplyChain.width,SupplyChain.height);
//        tablePane.getChildren().add(productTable);
        return tablePane;

    }


    public Pane getProductsByName(String productName){
        TableColumn id= new TableColumn("id");
        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        TableColumn name= new TableColumn("name");
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        TableColumn price= new TableColumn("price");
        price.setCellValueFactory(new PropertyValueFactory<>("price"));

//        ObservableList<Product> data= FXCollections.observableArrayList();
//        data.add(new Product(1,"Lenovo",8439));
//        data.add(new Product(1,"HP", 85439));
        ObservableList<Product>products= Product.getProductsByName(productName);

        productTable=new TableView<>();
        productTable.setItems(products);
        productTable.getColumns().addAll(id,name,price);
        productTable.setMinSize(SupplyChain.width,SupplyChain.height);
        Pane tablePane=new Pane();
        tablePane.setStyle("-fx-background-color: #C0C0C0");
        productTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        tablePane.setMinSize(SupplyChain.width,SupplyChain.height);
        tablePane.getChildren().add(productTable);
        return tablePane;

    }

}