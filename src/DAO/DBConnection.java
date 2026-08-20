package DAO;

import java.sql.*;


public class DBConnection {



    // Fields
    private static final String URL = "jdbc:postgresql://localhost:5432/Students";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "POSTGRESQL_007";

    // Private constructor prevents external instantiation
     DBConnection() {
    }

    // Connection method
    public static Connection getConnection() {
         try{
    return DriverManager.getConnection(URL,USERNAME,PASSWORD);
    }catch (SQLException e){
             throw new RuntimeException("Error, couldn't connect to database"+ e.getMessage());
         }

         }
}

