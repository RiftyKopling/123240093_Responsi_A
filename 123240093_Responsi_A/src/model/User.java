/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lab Informatika
 */
public class User {
    private int id;
    private String namaLengkap;
    private String username;
    private String password;
    
    public User(int id, String nama, String username, String password){
        this.id = id;
        this.namaLengkap = nama;
        this.username = username;
        this.password = password;
    }
    
    public User(String nama, String username, String password){
        this.namaLengkap = nama;
        this.username = username;
        this.password = password;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getNama(){
        return this.namaLengkap;
    }
    
    public void setNama(String nama){
        this.namaLengkap = nama;
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
}
