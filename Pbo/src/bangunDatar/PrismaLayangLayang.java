package bangunDatar;

import java.util.Scanner;

public class PrismaLayangLayang extends LayangLayang {
    private double tinggiPrisma;
    private double volume;
    private double luasPermukaan;
    
    public PrismaLayangLayang(double diagonalA, double diagonalB,double sisiPendek,double sisiPanjang, double tinggiPrisma) {
        super(diagonalA, diagonalB, sisiPendek, sisiPanjang);
        this.tinggiPrisma = tinggiPrisma;
    }
    
    public double hitungVolume() {
        volume = super.luas * tinggiPrisma;
        return volume;
    }
    
    public double hitungLuasPermukaan() {
        luasPermukaan = 2 * super.luas + (2 * super.sisiPendek + 2 * super.sisiPanjang) * tinggiPrisma;
        return luasPermukaan;
    }
    
    
    public static class PrismaLayangLayangRunnable implements Runnable {
        private PrismaLayangLayang prismaLayangLayang;

        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan diagonal A: ");
            double diagonalA = scanner.nextDouble();

            System.out.print("Masukkan diagonal B: ");
            double diagonalB = scanner.nextDouble();

            System.out.print("Masukkan sisi pendek: ");
            double sisiPendek = scanner.nextDouble();

            System.out.print("Masukkan sisi panjang: ");
            double sisiPanjang = scanner.nextDouble();
            
            System.out.print("Masukkan tinggi prisma: ");
            double tinggiPrisma = scanner.nextDouble();

            prismaLayangLayang = new PrismaLayangLayang(diagonalA, diagonalB, sisiPendek, sisiPanjang, tinggiPrisma);

            System.out.println("Volume prisma layang-layang: " + prismaLayangLayang.hitungVolume());
            System.out.println("Luas Permukaan prisma layang-layang: " + prismaLayangLayang.hitungLuasPermukaan());
        }

        public PrismaLayangLayang getPrismaLayangLayang() {
            return prismaLayangLayang;
        }
    }
}
