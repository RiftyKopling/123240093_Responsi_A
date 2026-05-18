/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.*;
import util.DatabaseConnection;
/**
 *
 * @author Lab Informatika
 */
public class UserDAO {
    public boolean registerUser(User u){
        if(cekUsernameAda(u.getUsername())){
            return false;
        }
        
        try {
            Connection cn = DatabaseConnection.getConnection();
            Statement st = cn.createStatement();
            
            st.executeUpdate("INSERT INTO users (nama_lengkap, username, password) VALUES ('"+u.getNama()+"','"+u.getUsername()+"','"+u.getPassword()+"')");
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
    public boolean loginUser(String un, String pw){ 
        try {
            Connection cn = DatabaseConnection.getConnection();
            Statement st = cn.createStatement();
            
            return st.executeQuery("SELECT * FROM users WHERE username ='"+un+"' AND password ='"+pw+"'").next();
        } catch (SQLException e) {
            return false;
        }
    }
    
    public boolean cekUsernameAda(String un){ 
        try {
            Connection cn = DatabaseConnection.getConnection();
            Statement st = cn.createStatement();
            
            return st.executeQuery("SELECT * FROM users WHERE username ='"+un+"'").next();
        } catch (SQLException e) {
            return true;
        }
    }
    
}
