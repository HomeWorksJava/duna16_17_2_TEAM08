/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Administrator
 */
public class DBConnect {
    private Connection DBConnection;
    public Connection connect() 
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Sikeres kapcsolat");
        }
        catch(ClassNotFoundException cnfe)
        {
            System.out.println("Sikertelen kapcsolat" + cnfe);
        }
        String url = "jdbc:mysql://localhost:3306/javaapp";
        try
        {
          DBConnection = (Connection) DriverManager.getConnection(url, "root", "root");
          System.out.println("Adatbázis kapcsolódva");
        }
        catch (SQLException se){
            System.out.println("Adatbázis kapcsolat sikertelen" + se);
        }
        return DBConnection;
    }   
}
