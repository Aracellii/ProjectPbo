package bangunDatar;

import java.util.Scanner;

public class PrismaBelahKetupat extends BelahKetupat {
    private double tinggiPrisma;
    private double volume;
    private double luasPermukaan;
    
    public PrismaBelahKetupat(double diagonalA, double diagonalB, double sisi, double tinggiPrisma) {
        super(diagonalA, diagonalB, sisi);
        this.tinggiPrisma = tinggiPrisma;
    }
    
    public double hitungVolume() {
        volume = super.luas * tinggiPrisma;
        return volume;
    }
    
    public double hitungLuasPermukaan() {
        luasPermukaan = 2 * super.luas + super.keliling * tinggiPrisma;
        return luasPermukaan;
    }
    
    
    public static class PrismaBelahKetupatRunnable implements Runnable {
        private PrismaBelahKetupat prismaBelahKetupat;

        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan panjang diagonal A belah ketupat: ");
            double diagonalA = scanner.nextDouble();

            System.out.print("Masukkan panjang diagonal B belah ketupat: ");
            double diagonalB = scanner.nextDouble();

            System.out.print("Masukkan panjang sisi belah ketupat: ");
            double sisi = scanner.nextDouble();
            
            System.out.print("Masukkan tinggi prisma: ");
            double tinggiPrisma = scanner.nextDouble();

            prismaBelahKetupat = new PrismaBelahKetupat(diagonalA, diagonalB, sisi, tinggiPrisma);

            System.out.println("Luas belah ketupat: " + prismaBelahKetupat.hitungLuas());
            System.out.println("Keliling belah ketupat: " + prismaBelahKetupat.hitungKeliling());
        }

        public PrismaBelahKetupat getPrismaBelahKetupat() {
            return prismaBelahKetupat;
        }
    }
}
