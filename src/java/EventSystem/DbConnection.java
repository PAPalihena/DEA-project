/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class DbConnection {
    private static Connection con;
    
    public static Connection getConnection() throws SQLException{ 
    
    if(con==null)
    {
        String url="jdbc:mysql://localhost:3306/eventsystem?zeroDateTimeBehavior=convertToNull";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection)DriverManager.getConnection(url,"root","");
            
            System.out.println("Connection established!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    return con;
    
    } 
}
