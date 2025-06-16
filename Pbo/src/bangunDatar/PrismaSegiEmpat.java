package bangunDatar;

import java.util.Scanner;

public class PrismaSegiEmpat extends PersegiPanjang {
    private final double tinggi;
    private double volume;
    private double luasPermukaan;

    public PrismaSegiEmpat(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        volume = super.luas * tinggi;
        return volume;
    }

    public double hitungLuasPermukaan() {
        luasPermukaan = 2.0 * super.luas + super.keliling * tinggi;
        return luasPermukaan;
    }
    
    
    public static class PrismaSegiEmpatRunnable implements Runnable {
        private PrismaSegiEmpat prismaSegiEmpat;

        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan panjang persegi panjang: ");
            double panjang = scanner.nextDouble();

            System.out.print("Masukkan lebar persegi panjang: ");
            double lebar = scanner.nextDouble();
            
            System.out.print("Masukkan tinggi prisma: ");
            double tinggi = scanner.nextDouble();

            prismaSegiEmpat = new PrismaSegiEmpat(panjang, lebar, tinggi);

            System.out.println("Volume prisma segi empat: " + prismaSegiEmpat.hitungVolume());
            System.out.println("Luas Permukaan prisma segi empat: " + prismaSegiEmpat.hitungLuasPermukaan());
        }

        public PrismaSegiEmpat getPrismaSegiEmpat() {
            return prismaSegiEmpat;
        }
    }
}