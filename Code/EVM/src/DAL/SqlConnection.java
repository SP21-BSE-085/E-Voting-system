/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hp
 */
public abstract class SqlConnection implements IConnection{

   private  String ConnectivityString;
   private  String userName;
   private  String Password;
    public SqlConnection(String ConnectivityString,String userName,String Password ) {
        this.ConnectivityString=ConnectivityString;
        this.userName=userName;
        this.Password=Password;
        
    }

    
    public Connection getConnection() {
      
       try {
          
    return DriverManager.getConnection(ConnectivityString,userName,Password);   // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       } catch (SQLException ex) {
           System.out.println(ex);
       }
       return null;
      
    }
    
    
    
}
