package com.example.supply_chain_management_system;
import java.sql.*;
public class DatabaseConnection {


    private static final String databaseUrl="jdbc:mysql://localhost:3306/supply_chain_dec";
    private static final String userName="root";
    private static final String password= "Password@3005";
    public Statement getStatement(){
        Statement statement=null;
        Connection conn;
        try{
            conn=DriverManager.getConnection(databaseUrl,userName,password);
            statement=conn.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
        return statement;
    }

    public ResultSet getQueryTable(String query){
        Statement statement=getStatement();
        try{
            return statement.executeQuery(query);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    //psvm short cut for main method
    public static void main(String[]args){
        DatabaseConnection databaseConnection= new DatabaseConnection();
        ResultSet rs= databaseConnection.getQueryTable("SELECT * FROM CUSTOMER");
        try{
            while(rs.next()){
                System.out.println(rs.getString("email") + " "+rs.getString("first_name"));

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
