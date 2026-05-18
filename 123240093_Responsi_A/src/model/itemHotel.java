/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lab Informatika
 */
public abstract class itemHotel {
    private int id;
    private String namaItem;
    private int hargaPerMalam;
    
    public itemHotel(int id,String namaItem, int harga){
        this.id = id;
        this.namaItem = namaItem;
        this.hargaPerMalam = harga;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setNama(String nama){
        this.namaItem = nama;
    }
    
    public String getNama(){
        return this.namaItem;
    }
    
    public void setHarga(int harga){
        this.hargaPerMalam = harga;
    }
    
    public int getHarga(){
        return this.hargaPerMalam;
    }
    
    public abstract void tampilInfo();
}
