package bangunDatar;

import java.util.Scanner;

public class PrismaJajarGenjang extends JajarGenjang{
    private double tinggiPrisma;
    private double volume;
    private double luasPermukaan;
        
    public PrismaJajarGenjang(double alas, double sisiMiring, double tinggi, double tinggiPrisma) {
        super(alas, sisiMiring, tinggi);
        this.tinggiPrisma = tinggiPrisma;
    }
    
    public double hitungVolume(){
        volume = super.luas * tinggiPrisma;
        return volume;
    }
    
    public double hitungLuasPermukaan(){
        luasPermukaan = (2.0 * super.luas) + (super.keliling * tinggiPrisma);
        return luasPermukaan;
    }
    
    
    public static class PrismaJajarGenjangRunnable implements Runnable {
        private PrismaJajarGenjang prismaJajarGenjang;

        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan alas jajar genjang: ");
            double alas = scanner.nextDouble();

            System.out.print("Masukkan sisi miring jajar genjang: ");
            double sisiMiring = scanner.nextDouble();

            System.out.print("Masukkan tinggi jajar genjang: ");
            double tinggi = scanner.nextDouble();
            
            System.out.print("Masukkan tinggi prisma: ");
            double tinggiPrisma = scanner.nextDouble();

            prismaJajarGenjang = new PrismaJajarGenjang(alas, sisiMiring, tinggi, tinggiPrisma);

            System.out.println("Volume prisma jajar genjang: " + prismaJajarGenjang.hitungVolume());
            System.out.println("Luas Permukaan prisma jajar genjang: " + prismaJajarGenjang.hitungLuasPermukaan());
        }

        public PrismaJajarGenjang getPrismaJajarGenjang() {
            return prismaJajarGenjang;
        }
    }
}
