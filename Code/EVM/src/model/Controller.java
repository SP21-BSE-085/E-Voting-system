/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dal.DatabaseConnection;
import java.sql.SQLException;
import model.dto.EmployeeDTO;
import model.dto.Response;
import model.validators.CommonValidator;

/**
 *
 * @author cenab
 */
public class Controller {
    private final DatabaseConnection dbc;

    public Controller() throws SQLException {
        this.dbc = new DatabaseConnection();
    }
    
    
    public Response addNewEmployee(EmployeeDTO dto) {
        Response response = SMSFactory.getResponseInstance();
        CommonValidator.employeeValidat(response, dto);
        if(response.isSuccesfull()){
            dbc.saveEmployee(dto);
        }
            
        return response;
    }
}
