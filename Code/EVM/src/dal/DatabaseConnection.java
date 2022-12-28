/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import model.dto.EmployeeDTO;

/**
 *
 * @author cenab
 */

//in ytui class we make the sql connection
public class DatabaseConnection  {
    private static String userName = "root";
    private static String password = "";
    private static String url = "jdbc:mysql://localhost:3306/shop?zeroDateTimeBehavior=CONVERT_TO_NULL";

    public DatabaseConnection() throws SQLException {
        createConnection();
    }
    
    private void createConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(url, userName, password);
        System.out.println("Connection stablished");
        
    }
    public void saveEmployee(EmployeeDTO dto) {
        System.out.printf("\n%s Added to Database", dto.getName());
        
    }
    
}