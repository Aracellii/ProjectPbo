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
public class Bola extends BangunRuang {
    private Lingkaran lingkaran;

    public Bola(double jari) {
        this.lingkaran = new Lingkaran(jari);
    }

    @Override
    public void hitungVolume() {
        double r = lingkaran.getJari();
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        System.out.println("Volume Bola: " + volume);
    }

    @Override
    public void hitungLuasPermukaan() {
        double r = lingkaran.getJari();
        double luas = 4 * Math.PI * r * r;
        System.out.println("Luas Permukaan Bola: " + luas);
    }
}