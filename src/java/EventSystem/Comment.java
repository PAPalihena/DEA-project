/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author HP
 */
class Comment {

    Statement st;
    public void connectToDb() throws ClassNotFoundException, SQLException{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/eventsystem?zeroDateTimeBehavior=convertToNull","root","");
    st=con.createStatement();
    }
    
    public void addComment(String name, String email, String comment) throws SQLException, ClassNotFoundException
    {
        connectToDb();
        String query="INSERT INTO `commentbox`(`fullname`, `email`, `comment`) VALUES ('"+name+"','"+email+"','"+comment+"')";
        st.executeUpdate(query);
    }
    
}
