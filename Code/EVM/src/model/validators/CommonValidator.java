
 
package model.validators;

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
}
