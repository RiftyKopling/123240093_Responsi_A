/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lab Informatika
 */
public class Kamar extends itemHotel implements Bookable{
    private String tipeKamar;
    private String kapasitasTamu;
    private boolean booking;
    
    public Kamar(int id, String nama, int harga, String tipe, String kapasitas){
        super(id, nama, harga);
        this.tipeKamar = tipe;
        this.kapasitasTamu = kapasitas;
    }
    
    public void setTipe(String tipe){
        this.tipeKamar = tipe;
    }
    
    public String getTipe(){
        return this.tipeKamar;
    }
    
    public void setKapasitas(String kapasitas){
        this.kapasitasTamu = kapasitas;
    }
    
    public String getKapasitas(){
        return this.kapasitasTamu;
    }
    
    @Override
    public void tampilInfo(){
        System.out.println("Nama : " + getNama() + " | Tipe Kamar : " + tipeKamar);
    }
    
    @Override
    public void booking(){
        if(!booking){
            this.booking = true;
        }
    }
    
    @Override
    public void batalBooking(){
        if(booking){
            this.booking = false;
        }
    }
    
    
}
