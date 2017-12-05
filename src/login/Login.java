/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import Views.W_Login;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author rubro
 */
public class Login {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Take Input from User for Username and Password
	
       W_Login login = new W_Login();
       login.setLocationRelativeTo(null);      // *** this will center your app ***
       login.setTitle("INGRESO CONTROLTAXI");
       login.setVisible(true);
       
    }
    
}
