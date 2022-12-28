/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Model.Response;
import Record.ElectionRecord;

import  java.sql.Connection;
/**
 *
 * @author hp
 */
public class DatabaseController {
        public SqlConnection Connect;
       public RecordSet recordSet;
       public  Response response;
       ElectionRecord electionRecord;
    public DatabaseController() {
        
        Connect=new SqlConnection("jdbc:mysql://localhost:3306/Election","root","12345") {};
   recordSet =new RecordSet();
  response=new Response();
  electionRecord =new ElectionRecord();
  
  
    
    }

    public void AddElection(ElectionRecord AddElection,Response response) {
        
      Connection conn= Connect.getConnection();
      String query="insert into AddElection (province,ElectionType,PollingStation,ElectionOfficer,ElectionDate,StartTime,EndTime) values (?,?,?,?,?,?,?)";
     response.flag=recordSet.SetRecord(conn,AddElection,query);
       
    }
   

    
    
    
}
