/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proj4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author rafiu
 */
public class DatabaseConnection {
    
    
       public static Connection getConnection() throws SQLException, ClassNotFoundException {
        
        //Class.forName("com.mysql.jdbc.Driver");
        
        String dbUrl = "jdbc:sqlite:music_artists.sqlite";
        
        Connection connection = DriverManager.getConnection(dbUrl);
        
        return connection;
        
    }  
}