/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunRuang;
import bangunDatar.BangunDatar;
import bangunDatar.Persegi;
import bangunDatar.PersegiPanjang;
/**
 *
 * @author Alfa
 */
public class PrismaSegiEmpat extends BangunRuang {
    private BangunDatar alas;
    private double tinggi;

    public PrismaSegiEmpat(BangunDatar alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public void hitungVolume() {
        double volume;
        if (alas instanceof Persegi) {
            Persegi p = (Persegi) alas;
            volume = p.getLuas() * tinggi;
            System.out.println("Volume Prisma Segiempat (Persegi): " + volume);
        } else if (alas instanceof PersegiPanjang) {
            PersegiPanjang pp = (PersegiPanjang) alas;
            volume = pp.getLuas() * tinggi;
            System.out.println("Volume Prisma Segiempat (Persegi Panjang): " + volume);
        } else {
            System.out.println("Jenis alas tidak dikenali.");
        }
    }

    @Override
    public void hitungLuasPermukaan() {
        double luas;
        if (alas instanceof Persegi) {
            Persegi p = (Persegi) alas;
            double s = p.getSisi();
            luas = 2 * s * s + 4 * s * tinggi;
            System.out.println("Luas Permukaan Prisma Segiempat (Persegi): " + luas);
        } else if (alas instanceof PersegiPanjang) {
            PersegiPanjang pp = (PersegiPanjang) alas;
            double p = pp.getPanjang();
            double l = pp.getLebar();
            luas = 2 * (p * l) + 2 * (p + l) * tinggi;
            System.out.println("Luas Permukaan Prisma Segiempat (Persegi Panjang): " + luas);
        } else {
            System.out.println("Jenis alas tidak dikenali.");
        }
    }
}