/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunRuang;
import bangunDatar.Persegi;
/**
 *
 * @author Alfa
 */
public class Kubus extends BangunRuang {
    private Persegi persegi;

    public Kubus(double sisi) {
        this.persegi = new Persegi(sisi);
    }

    @Override
    public void hitungVolume() {
        double s = persegi.getSisi();
        double volume = s * s * s;
        System.out.println("Volume Kubus: " + volume);
    }

    @Override
    public void hitungLuasPermukaan() {
        double s = persegi.getSisi();
        double luas = 6 * s * s;
        System.out.println("Luas Permukaan Kubus: " + luas);
    }
}