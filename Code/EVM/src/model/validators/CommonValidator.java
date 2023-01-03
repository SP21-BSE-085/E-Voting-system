
 
package model.validators;

import Model.dto.PollingStationDTO;
import model.dto.EmployeeDTO;
import model.dto.Response;


public class CommonValidator {
    
    
    public static void employeeValidat(Response response, EmployeeDTO dto) {
        if(dto.getName().isBlank()){
           response.isValid = false;
        }
        else {
           response.isValid = true;
        }
    }

    public static void validateNewPollingStation(Response response, PollingStationDTO dto) {
        if(dto.getID().isBlank()
                ||dto.getName().isBlank()
                ||dto.getAddress().isBlank()
                ||dto.getCity().isBlank()
                ||dto.getBuilding().isBlank()
                ||dto.getStreet().isBlank()
                ||dto.getEmployeeNo().isBlank()) {
            response.isValid = false; 
        }
        
        else{
            response.isValid = true;
        }
    }
}
