/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lab Informatika
 */
public class RuangMeeting extends itemHotel implements Bookable{
    private String fasilitas;
    private String kapasitasOrang;
    private boolean booking;
    
    public RuangMeeting(int id, String nama, int harga, String fasilitas, String kapasitas){
        super(id, nama, harga);
        this.fasilitas = fasilitas;
        this.kapasitasOrang = kapasitas;
    }
    
    public void setFasilitas(String fasilitas){
        this.fasilitas = fasilitas;
    }
    
    public String getFasilitas(){
        return this.fasilitas;
    }
    
    public void setKapasitas(String kapasitas){
        this.kapasitasOrang = kapasitas;
    }
    
    public String getKapasitas(){
        return this.kapasitasOrang;
    }
    
    @Override
    public void tampilInfo(){
        System.out.println("Nama : " + getNama() + " | Fasilitas : " + fasilitas);
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
