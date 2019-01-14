/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahero.connection;

import java.sql.Statement;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class Connect {
    public static String url="jdbc:mysql://localhost:3306/javatest1212019";
    public static String user="root";
    public static String passworld="";
    public static String driver="";
    public static Connection open() throws ConnectException  {
        try {
            return DriverManager.getConnection(url, user, passworld);
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        } 
       throw new ConnectException();
       
    }
    public static void close(ResultSet rs, Statement st, Connection cnn){
        try {
            if(rs!=null&&!rs.isClosed()){
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if(st!=null&&!st.isClosed()){
                st.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if(cnn!=null&&!cnn.isClosed()){
                cnn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
