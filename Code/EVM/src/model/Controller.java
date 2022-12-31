/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import Model.dto.PollingStationDTO;
import dal.DatabaseConnection;
import java.sql.SQLException;
import model.dto.Response;
import model.validators.CommonValidator;

/**
 *
 * @author Ali sina
 */
public class Controller {
    private final DatabaseConnection dbc;

    public Controller() throws SQLException {
        this.dbc = new DatabaseConnection();
    }
    
    

    
    public Response setNewPollingStation(PollingStationDTO dto) throws SQLException{
        Response response = SMSFactory.getResponseInstance();
        CommonValidator.validateNewPollingStation(response, dto);
        if(response.isSuccesfull()){
            dbc.setNewPollingStation(dto);
        }
        return response;
        
  
    }
}
