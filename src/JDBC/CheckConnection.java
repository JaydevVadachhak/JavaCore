/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

/**
 *
 * @author jaydev
 */
public class CheckConnection {
    public static boolean getConnection(){
        Connection con = null;
        try {
            String url = "jdbc:mysql://localhost/javacore";
            con = DriverManager.getConnection(url, "root", "");
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CheckConnection.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public static void main(String[] args) throws SQLException {
        getConnection();
    }
}
