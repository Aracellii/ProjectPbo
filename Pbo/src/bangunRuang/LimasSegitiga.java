/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunRuang;
import bangunDatar.BangunDatar;
/**
 *
 * @author Alfa
 */
public class Limas extends BangunRuang {
    private BangunDatar alas;
    private double tinggi;
    private double[] sisiTegak;

    // Constructor lengkap
    public Limas(BangunDatar alas, double tinggi, double[] sisiTegak) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiTegak = sisiTegak;
    }

    public void hitungVolume() {
        // Volume = 1/3 × Luas Alas × Tinggi

                double volume = (1.0 / 3.0) * p.getLuas() * tinggi;
                System.out.println("Volume Limas: " + volume);

            }
        
    }

    @Override
    public void hitungLuasPermukaan() {
       double luasSisiTegakTotal = 0;
        for (double luas : sisiTegak) {
            luasSisiTegakTotal += luas;
        }

        double luasPermukaan = alas.getLuas() + luasSisiTegakTotal;
        System.out.println("Luas Permukaan Limas: " + luasPermukaan);
    }
}