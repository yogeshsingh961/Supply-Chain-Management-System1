module com.example.supply_chain_management_system {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.supply_chain_management_system to javafx.fxml;
    exports com.example.supply_chain_management_system;
}