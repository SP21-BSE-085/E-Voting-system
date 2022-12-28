/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAL.DatabaseController;
import Model.Response;
import Record.ElectionRecord;
import java.awt.FileDialog;

/**
 *
 * @author hp
 */
public class ElectionController {
    DatabaseController databaseController;
    
    public ElectionController() {
        databaseController=ObjectFactory.getinstanceofDatabaseController() ;
        
    }
        
    public void AddNewElection(ElectionRecord AddElection,Response response) {
        databaseController.AddElection(AddElection,response);
    }

   
    
    
    
    
    
}
