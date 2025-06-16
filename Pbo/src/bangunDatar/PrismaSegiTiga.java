package bangunDatar;

import java.util.Scanner;

public class PrismaSegiTiga extends Segitiga {
    private final double tinggiPrisma;
    private double volume;
    private double luasPermukaan;

    public PrismaSegiTiga(double alas, double tinggi, double sisiA, double sisiB, double tinggiPrisma) {
        super(alas, tinggi, sisiA, sisiB);
        this.tinggiPrisma = tinggiPrisma;
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();
    }

    public double hitungVolume() {
        volume = super.luas * tinggiPrisma;
        return volume;
    }

    public double hitungLuasPermukaan() {
        // Luas permukaan = 2 * luas alas + keliling alas * tinggi prisma
        luasPermukaan = 2.0 * super.luas + super.keliling * tinggiPrisma;
        return luasPermukaan;
    }

    public static class PrismaSegiTigaRunnable implements Runnable {
        private PrismaSegiTiga prisma;

        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan alas segitiga: ");
            double alas = scanner.nextDouble();

            System.out.print("Masukkan tinggi segitiga: ");
            double tinggiSegitiga = scanner.nextDouble();

            System.out.print("Masukkan sisi A segitiga: ");
            double sisiA = scanner.nextDouble();

            System.out.print("Masukkan sisi B segitiga: ");
            double sisiB = scanner.nextDouble();

            System.out.print("Masukkan tinggi prisma: ");
            double tinggiPrisma = scanner.nextDouble();

            prisma = new PrismaSegiTiga(alas, tinggiSegitiga, sisiA, sisiB, tinggiPrisma);

            System.out.println("Luas alas segitiga: " + prisma.hitungLuas());
            System.out.println("Keliling alas segitiga: " + prisma.hitungKeliling());
            System.out.println("Volume prisma segitiga: " + prisma.hitungVolume());
            System.out.println("Luas permukaan prisma segitiga: " + prisma.hitungLuasPermukaan());
        }

        public PrismaSegiTiga getPrismaSegiTiga() {
            return prisma;
        }
    }
}
