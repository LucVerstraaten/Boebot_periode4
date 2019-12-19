package Controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class DbConnector {

     static Connection conn;

    public static void main() {

        String url = "jdbc:mysql://192.168.1.185:3306/boebot";
        String username = "testuser";
        String password = "securepwd";

        System.out.println("Connecting database...");

        try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }


    }

    public ResultSet getData(String strSQL){        //Data op kunnen vragen
        ResultSet result = null;
        try{
            Statement stmt = conn.createStatement();
            result = stmt.executeQuery(strSQL);
        }catch(Exception e){

        }
        return result;
    }

    public void insertCoordinaten(String sql){       //Zorgt dat ik in knop1 data kan opslaan in mijn database bij een al bestaande Medicijnnaam
        try{
            Statement stmt = conn.createStatement();
            //String sql = "INSERT INTO `boebotblokkade`(`BeginX`, `EindX`, `BeginY`, `EindY`) VALUES (2, 3, 5, 6);";
            System.out.println(sql);
            stmt.execute(sql);
        }catch(Exception e){

        }

    }



}
