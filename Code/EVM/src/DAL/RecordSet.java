/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Record.ElectionRecord;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author hp
 */
public class RecordSet {

    boolean SetRecord(Connection conn, ElectionRecord AddElection, String query) {
      
        
      
        try {
          PreparedStatement psm = conn.prepareStatement(query);
             psm.setString(1,AddElection.province);
                psm.setString(2,AddElection.ElectionType);
                 psm.setString(3,AddElection.pollingStation);
                  psm.setString(4,AddElection.ElectionOfficer);
    psm.setString(5,AddElection.ElectionDate);
                   psm.setString(6,AddElection.StartTime);
                 psm.setString(7,AddElection.EndTime);
                    int count =psm.executeUpdate();
                    
           return count>=1?true:false;
                  
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
             
        }
      return false;
    }
    
    
    
    
    
}
