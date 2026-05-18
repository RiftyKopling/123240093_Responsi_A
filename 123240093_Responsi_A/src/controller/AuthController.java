/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Lab Informatika
 */
public class AuthController {
    private UserDAO userDAO;
    private static int loginAttempts = 0;
    public AuthController(){
        this.userDAO = new UserDAO();
    }
    
    public boolean register(String nl, String un, String pw){
        if(nl.isEmpty() || un.isEmpty() || pw.isEmpty()){
            JOptionPane.showMessageDialog(null, "Semua Field harus diisi");
            return false;
        }
        return true;
    }
}
