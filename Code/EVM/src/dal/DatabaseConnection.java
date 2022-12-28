
package dal;

import Model.dto.PollingStationDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import model.dto.EmployeeDTO;

/**
 *
 * @author cenab
 */

//in ytui class we make the sql connection
public class DatabaseConnection  {
    private static String userName = "root";
    private static String password = "Ali_9379";
    private static String url = "jdbc:mysql://localhost:3306/onlinevotingsystem?zeroDateTimeBehavior=CONVERT_TO_NULL";

    private Connection connection;
    Statement stm; 
    
    public DatabaseConnection() throws SQLException {
        createConnection();
    }
    
    private void createConnection() throws SQLException {
         connection = DriverManager.getConnection(url, userName, password);
        System.out.println("Connection stablished");
        stm = connection.createStatement();
        
    }
   

    //this method will use to add a new polling station to database 
    //its uses for  Ali sina's use case
    public void setNewPollingStation(PollingStationDTO dto) throws SQLException {
        //insert into pollingstation values(id, name,address, city, street, building, employee number);
        String sql = String.format("insert into pollingstation values(\"%s\", \"%s\",\"%s\", \"%s\", \"%s\", \"%s\", \"%s\")",
                dto.getID(), dto.getName(), dto.getAddress(),dto.getCity(),dto.getStreet(),dto.getBuilding(), dto.getEmployeeNo());
        int i = stm.executeUpdate(sql);
        if(i > 0 ) {
            System.out.println("Added to database ");
        }
        else{
            System.out.println("there is some problem");
        }
    }
    
}