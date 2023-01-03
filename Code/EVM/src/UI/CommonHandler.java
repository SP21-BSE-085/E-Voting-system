/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.awt.Color;
import javax.swing.JLabel;
import model.dto.Response;

/**
 *
 * @author cenab
 */
public class CommonHandler {

    public static void handleResponse(Response response, JLabel lbl) {
        if (response.isSuccesfull()) {
            lbl.setText("Successfully added !");
            lbl.setForeground(Color.black);
        } else {
            lbl.setText("please fill all fields");
            lbl.setForeground(Color.red);

        }

    }

}
