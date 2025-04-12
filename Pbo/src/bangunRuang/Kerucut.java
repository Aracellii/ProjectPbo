/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunRuang;
import bangunDatar.Lingkaran;

public class Kerucut extends BangunRuang {
    private Lingkaran lingkaran;
    private double tinggi;
    private double sisiMiring;
    public Kerucut(double jari, double tinggi,double sisiMiring) {
        this.lingkaran = new Lingkaran(jari);
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }

    @Override
    public void hitungVolume() {
        double r = lingkaran.getJari();
        double volume = Math.PI * r * r * tinggi/3;
        System.out.println("Volume Tabung: " + volume);
    }

    @Override
    public void hitungLuasPermukaan() {
        double r = lingkaran.getJari();
        double luas = Math.PI * (r+lingkaran.getLuas());
        System.out.println("Luas Permukaan Tabung: " + luas);
    }
}