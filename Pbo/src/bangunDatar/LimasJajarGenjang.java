/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunDatar;

import java.util.Scanner;

/**
 *
 * @author L E N O V O
 */
public class LimasJajarGenjang extends JajarGenjang {
    private double tinggiLimas;
    private double volume;
    private double luasPermukaan;
    
    public LimasJajarGenjang (double alas, double sisiMiring, double tinggi, double tinggiLimas){
        super(alas, sisiMiring, tinggi);
        this.tinggiLimas = tinggiLimas;
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();
    }
    
    public double hitungVolume(){ //jika tidak ganti
        volume = 1.0/3.0 * super.luas * tinggiLimas;
        return volume;
    }
    
    public double hitungLuasPermukaan(){ //jika tidak ganti
        double sisiTegakPanjang = Math.sqrt(Math.pow(tinggiLimas,2) + Math.pow((tinggi/2.0),2));
        double sisiTegakMiring = Math.sqrt(Math.pow(tinggiLimas,2) + Math.pow((alas/2.0),2));
        
        double luasSegitigaPanjang = (alas/2.0) * sisiTegakPanjang;
        double luasSegitigaMiring = (sisiMiring/2.0) * sisiTegakMiring;
        double luasAlasLimas = super.luas;
        
        luasPermukaan = luasAlasLimas + luasSegitigaPanjang + luasSegitigaMiring;
        return luasPermukaan;
    }
    
    public double hitungVolume(double alasBaru, double tinggiBaru, double tinggiLimasBaru){ //jika ganti
        volume = 1/3 * (alasBaru * tinggiBaru) * tinggiLimasBaru;
        return volume;
    }
    
    public double hitungLuasPermukaan(double alasBaru, double tinggiBaru, double sisiMiringBaru, double tinggiLimasBaru){ //jika ganti
        double sisiTegakPanjang = Math.sqrt(Math.pow(tinggiLimasBaru,2) + Math.pow((tinggiBaru/2.0),2));
        double sisiTegakMiring = Math.sqrt(Math.pow(tinggiLimasBaru,2) + Math.pow((alasBaru/2.0),2));
        
        double luasSegitigaPanjang = (alasBaru/2.0) * sisiTegakPanjang;
        double luasSegitigaMiring = (sisiMiringBaru/2.0) * sisiTegakMiring;
        double luasAlasLimas = alasBaru * tinggiBaru;
        
        luasPermukaan = luasAlasLimas + luasSegitigaPanjang + luasSegitigaMiring;
        return luasPermukaan;
    }
        public static class LimasJajarGenjangRunnable implements Runnable {
        private LimasJajarGenjang limas;

        @Override
        public void run() {
            Scanner scanner = new java.util.Scanner(System.in);

            System.out.print("Masukkan alas jajar genjang: ");
            double alas = scanner.nextDouble();

            System.out.print("Masukkan sisi miring jajar genjang: ");
            double sisiMiring = scanner.nextDouble();

            System.out.print("Masukkan tinggi jajar genjang: ");
            double tinggi = scanner.nextDouble();

            System.out.print("Masukkan tinggi limas: ");
            double tinggiLimas = scanner.nextDouble();

            limas = new LimasJajarGenjang(alas, sisiMiring, tinggi, tinggiLimas);

            System.out.println("Luas alas jajar genjang: " + limas.hitungLuas());  
            System.out.println("Keliling alas jajar genjang: " + limas.hitungKeliling());   
            System.out.println("Volume limas: " + limas.hitungVolume());   
            System.out.println("Luas permukaan limas: " + limas.hitungLuasPermukaan());   
        }

        public LimasJajarGenjang getLimasJajarGenjang() {
            return limas;
        }
    }
}
