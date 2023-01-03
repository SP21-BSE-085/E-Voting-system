/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAL.DatabaseController;

/**
 *
 * @author hp
 */
public class ObjectFactory {
    
     static DatabaseController getinstanceofDatabaseController(){
     
     return new DatabaseController();
     } 
     

    public static ElectionController getinstanceofElectionController() {
         return new ElectionController();
    }
    
}
