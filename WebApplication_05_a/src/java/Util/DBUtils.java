/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ShiroSs
 */
public class DBUtils {

    private static final String DB_NAME = "Web_05_a";
    private static final String DB_USERNAME = "sa";
    private static final String DB_PASSWORD = "123456";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection conn = null;
        Class.forName("com.microsoft.sqlsever.jdbc.SQLSeverDriver");
        String url = "jdbc:sqlserver://localhost:1433;databasename=" + DB_NAME;
        conn = DriverManager.getConnection(url, DB_USERNAME, DB_PASSWORD);
        return conn;
        
    }
    
    public static void main(String[] args) {
        try {
            Connection conn = getConnection();
            System.out.println(conn);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBUtils.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
