/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.dto.Response;

/**
 *
 * @author cenab
 */
public class SMSFactory {
    
    public static Response getResponseInstance() {
        return new Response();
    }
        
    
}
