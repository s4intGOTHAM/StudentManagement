package DAO;

//CONNECTION OBJECTS FOR DB CONNECTIONS ARE POOR DESIGN  BAD  PRACTICE

import java.sql.*;

public class DBOperations implements Insert, Select, Update, Delete {

    private  Connection conn;

    public DBOperations(Connection conn){
this.conn = conn;
    }

    @Override
    public boolean insertOperation(int ID_number, String SName, String Subject1, String Subject2, String Subject3, String Subject4, String Subject5, String Subject6, String Subject7) {
        String query = "INSERT INTO Students (ID_number, SName, Subject1, Subject2, Subject3, Subject4, Subject5, Subject6, Subject7) \n" +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(query);
        ) {
            pstmt.setString(1, "ID_number");
            pstmt.setString(2, "SName");
            pstmt.setString(3, "Subject1");
            pstmt.setString(4, "Subject2");
            pstmt.setString(5, "Subject3");
            pstmt.setString(6, "Subject4");
            pstmt.setString(7, "Subject5");
            pstmt.setString(8, "Subject6");
            pstmt.setString(9, "Subject7");

            System.out.println("Successfully added Students!");
            return true;
        } catch (SQLException sqle2) {
            System.out.println("Error: " + sqle2.getMessage());
            return false;
        }

    }

    @Override
    public boolean deleteOperation(int ID_number) {
        String query = "DELETE FROM Students WHERE ID_number = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query);
        ) {
            pstmt.setInt(1, ID_number);

            System.out.println("Successfully added Students!");
            return true;
        } catch (SQLException sqle2) {
            System.out.println("Error: " + sqle2.getMessage());
            return false;
        }

    }


    @Override
    public String selectOperation(int ID_number) {
        String query = "SELECT * FROM Students";

        try(PreparedStatement pstmt = conn.prepareStatement(query);){

            return "";
        }catch(SQLException sqle2){
return null;
        }

    }

    @Override
    public boolean updateOperation(int ID_number) {
        String query = "UPDATE Students SET SName = ? WHERE ID_number = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(query);
        ) {
            pstmt.setString(1, "NewName");
            pstmt.setString(2, "101");

            System.out.println("Successfully Updated Students!");
            return true;
        } catch (SQLException sqle2) {
            System.out.println("Error: " + sqle2.getMessage());
            return false;
        }
    }



}
