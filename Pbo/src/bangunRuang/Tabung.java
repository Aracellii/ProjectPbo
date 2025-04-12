/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunRuang;
import bangunDatar.Lingkaran;
/**
 *
 * @author Alfa
 */
public class Tabung extends BangunRuang {
    private Lingkaran lingkaran;
    private double tinggi;

    public Tabung(double jari, double tinggi) {
        this.lingkaran = new Lingkaran(jari);
        this.tinggi = tinggi;
    }

    @Override
    public void hitungVolume() {
        double r = lingkaran.getJari();
        double volume = Math.PI * r * r * tinggi;
        System.out.println("Volume Tabung: " + volume);
    }

    @Override
    public void hitungLuasPermukaan() {
        double r = lingkaran.getJari();
        double luas = 2 * Math.PI * r * (r + tinggi);
        System.out.println("Luas Permukaan Tabung: " + luas);
    }
}