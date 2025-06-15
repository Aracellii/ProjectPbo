/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunDatar;

/**
 *
 * @author L E N O V O
 */
public class LimasTrapesium extends Trapesium {
    private double tinggiLimas;
    private double volume;
    private double luasPermukaan;
    
    public LimasTrapesium (double sisiAtas, double sisiBawah, double sisiMiring, double tinggi,double tinggiLimas) {
        super(sisiAtas, sisiBawah, sisiMiring, tinggi);
        this.tinggiLimas = tinggiLimas;
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();
    }
    
    public double hitungVolume() { //tidak input sisi baru
        volume = 1/3 * super.luas * tinggi;
        return volume;
    }
    
    public double hitungLuasPermukaan () { // tidak input sisi baru
        double tinggiSegitigaAtas = Math.sqrt(Math.pow((tinggi/2),2)+ Math.pow(tinggiLimas,2));
        double tinggiSegitigaBawah = tinggiSegitigaAtas;
        
        double tinggiSlantMiring = Math.sqrt(Math.pow(tinggiSegitigaAtas,2)+ Math.pow((sisiBawah/2),2));
        double tinggiSegitigaMiring = Math.sqrt(Math.pow(tinggiSlantMiring,2) - Math.pow((sisiMiring/2),2));
        
        double luasSegitigaMiring = sisiMiring * tinggiSegitigaMiring / 2;
        double luasSegitigaAtas = tinggiSegitigaAtas * sisiAtas /2;
        double luasSegitigaBawah = tinggiSegitigaBawah * sisiBawah /2;
        double luasAlasLimas = super.luas;
        
        luasPermukaan = luasAlasLimas + luasSegitigaMiring * 2 + luasSegitigaAtas + luasSegitigaBawah;
        return luasPermukaan;
    }
    
    public double hitungVolume(double sisiBawahBaru,double sisiAtasBaru, double tinggiBaru, double tinggiLimasBaru){ //jika input baru
        volume = 1/3 * ((sisiBawahBaru + sisiAtasBaru) * tinggiBaru / 2) *tinggiLimasBaru;
        return volume;
    }
    
    public double hitungLuasPermukaan(double sisiMiringBaru, double sisiAtasBaru, double sisiBawahBaru, double tinggiBaru, double tinggiLimasBaru) {
        double tinggiSegitigaAtas = Math.sqrt(Math.pow((tinggiBaru/2),2)+ Math.pow(tinggiLimasBaru,2));
        double tinggiSegitigaBawah = tinggiSegitigaAtas;
        
        double tinggiSlankMiring = Math.sqrt(Math.pow(tinggiSegitigaAtas,2)+ Math.pow((sisiBawahBaru/2),2));
        double tinggiSegitigaMiring = Math.sqrt(Math.pow(tinggiSlankMiring,2) - Math.pow((sisiMiringBaru/2),2));
        
        double luasSegitigaMiring = sisiMiringBaru * tinggiSegitigaMiring / 2;
        double luasSegitigaAtas = tinggiSegitigaAtas * sisiAtasBaru /2;
        double luasSegitigaBawah = tinggiSegitigaBawah * sisiBawahBaru /2;
        double luasAlasLimas = (sisiBawahBaru + sisiAtasBaru) * tinggiBaru / 2;
        
        luasPermukaan = luasPermukaan = luasAlasLimas + luasSegitigaMiring * 2 + luasSegitigaAtas + luasSegitigaBawah;
        return luasPermukaan;
    }
}
