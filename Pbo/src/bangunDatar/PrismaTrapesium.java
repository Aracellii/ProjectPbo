package bangunDatar;

import java.util.Scanner;

public class PrismaTrapesium extends Trapesium {
    private double tinggiPrisma;
    private double volume;
    private double luasPermukaan;

    public PrismaTrapesium(double sisiAtas, double sisiBawah, double sisiMiring, double tinggi, double tinggiPrisma) {
        super(sisiAtas, sisiBawah, sisiMiring, tinggi);
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
    
    public static class PrismaTrapesiumRunnable implements Runnable {
        private PrismaTrapesium prismaTrapesium;

        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan panjang sisi atas trapesium: ");
            double sisiAtas = scanner.nextDouble();

            System.out.print("Masukkan panjang sisi bawah trapesium: ");
            double sisiBawah = scanner.nextDouble();

            System.out.print("Masukkan panjang sisi kiri trapesium: ");
            double sisiMiring = scanner.nextDouble();

            System.out.print("Masukkan tinggi trapesium: ");
            double tinggi = scanner.nextDouble();
            
            System.out.print("Masukkan tinggi prisma: ");
            double tinggiPrisma = scanner.nextDouble();

            prismaTrapesium = new PrismaTrapesium (sisiAtas, sisiBawah, sisiMiring, tinggi, tinggiPrisma);

            System.out.println("Volume prisma trapesium: " + prismaTrapesium.hitungVolume());
            System.out.println("Luas permukaan prisma trapesium: " + prismaTrapesium.hitungLuasPermukaan());
        }

        public PrismaTrapesium getPrismaTrapesium() {
            return prismaTrapesium;
        }
    }
}