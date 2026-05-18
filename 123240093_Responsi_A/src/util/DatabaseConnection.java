/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Lab Informatika
 */
public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/hotel", USER = "root", PASS = "";
    private static Connection connection = null;
    public static Connection getConnection(){
        try {
            if(connection == null){
                connection = DriverManager.getConnection(URL, USER, PASS);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Koneksi GAGAL!, " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return connection;
    }
}
