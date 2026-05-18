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
public class itemDAO {
    public boolean tambahKamar(Kamar k){
        try {
            Statement s = DatabaseConnection.getConnection().createStatement();
            s.executeUpdate("INSERT INTO item (nama, harga, tipe, kapasitas) VALUES ('"+k.getNama()+"','"+k.getHarga()+"','"+k.getTipe()+"','"+k.getKapasitas()+"')");
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
    public boolean tambahRuang(RuangMeeting r){
        try {
            Statement s = DatabaseConnection.getConnection().createStatement();
            s.executeUpdate("INSERT INTO item (nama, harga, fasilitas, kapasitas) VALUES ('"+r.getNama()+"','"+r.getHarga()+"','"+r.getFasilitas()+"','"+r.getKapasitas()+"')");
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
    public boolean updateKamar(Kamar k){
        try {
            Statement s = DatabaseConnection.getConnection().createStatement();
            s.executeUpdate("UPDATE item SET nama='"+k.getNama()+"',harga='"+k.getHarga()+"',tipe='"+k.getTipe()+"',kapasitas'"+k.getKapasitas()+"' WHERE id='"+k.getId()+"')");
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
    public boolean updateRuang(RuangMeeting r){
        try {
            Statement s = DatabaseConnection.getConnection().createStatement();
            s.executeUpdate("UPDATE item SET nama='"+r.getNama()+"',harga='"+r.getHarga()+"',fasilitas='"+r.getFasilitas()+"',kapasitas'"+r.getKapasitas()+"' WHERE id='"+r.getId()+"')");
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
    public boolean hapusItem(int id){
        try {
            Statement s = DatabaseConnection.getConnection().createStatement();
            s.executeUpdate("DELETE FROM item WHERE id='"+id+"')");
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
    public ResultSet getAllItems(){
        try {
            return DatabaseConnection.getConnection().createStatement().executeQuery("SELECT * FROM item)");
        } catch (SQLException e) {
            return null;
        }
    }
}
