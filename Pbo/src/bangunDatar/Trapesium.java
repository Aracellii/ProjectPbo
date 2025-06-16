package bangunDatar;

import java.util.Scanner;

public class Trapesium extends BangunDatar {
    protected double sisiAtas;
    protected double sisiBawah;
    protected double sisiMiring;
    protected double tinggi;
    protected double keliling;
    protected double luas;
    
    public Trapesium(double sisiAtas, double sisiBawah, double sisiMiring, double tinggi) {
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        this.sisiMiring = sisiMiring;
        this.tinggi = tinggi;
        this.keliling = hitungKeliling();
        this.luas = hitungLuas();
    }

    @Override
    public double hitungLuas() {
        luas = (sisiAtas + sisiBawah) * tinggi / 2.0;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = sisiAtas + sisiMiring + sisiBawah;
        return keliling;
    }
    
    public static class TrapesiumRunnable implements Runnable {
        private Trapesium trapesium;

        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan sisi atas trapesium: ");
            double sisiAtas = scanner.nextDouble();

            System.out.print("Masukkan sisi bawah trapesium: ");
            double sisiBawah = scanner.nextDouble();

            System.out.print("Masukkan sisi kiri trapesium: ");
            double sisiMiring = scanner.nextDouble();

            System.out.print("Masukkan tinggi trapesium: ");
            double tinggi = scanner.nextDouble();

            trapesium = new Trapesium(sisiAtas, sisiBawah, sisiMiring, tinggi);

            System.out.println("Luas trapesium: " + trapesium.hitungLuas());
            System.out.println("Keliling trapesium: " + trapesium.hitungKeliling());
        }

        public Trapesium getTrapesium() {
            return trapesium;
        }
    }
}
