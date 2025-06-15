package bangunDatar;

import java.util.Scanner;

public class Trapesium extends BangunDatar {
    protected double sisiAtas;
    protected double sisiBawah;
    protected double sisiKiri;
    protected double sisiKanan;
    protected double tinggi;
    protected double keliling;
    protected double luas;
    
    public Trapesium(double sisiAtas, double sisiBawah, double sisiKiri, double sisiKanan, double tinggi) {
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        this.sisiKiri = sisiKiri;
        this.sisiKanan = sisiKanan;
        this.tinggi = tinggi;
        this.keliling = hitungKeliling();
        this.luas = hitungLuas();
    }

    @Override
    public double hitungLuas() {
        luas = (sisiAtas + sisiBawah) * tinggi / 2;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = sisiAtas + sisiKanan + sisiBawah + sisiKiri;
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
            double sisiKiri = scanner.nextDouble();

            System.out.print("Masukkan sisi kanan trapesium: ");
            double sisiKanan = scanner.nextDouble();

            System.out.print("Masukkan tinggi trapesium: ");
            double tinggi = scanner.nextDouble();

            trapesium = new Trapesium(sisiAtas, sisiBawah, sisiKiri, sisiKanan, tinggi);

            System.out.println("Luas trapesium: " + trapesium.hitungLuas());
            System.out.println("Keliling trapesium: " + trapesium.hitungKeliling());
        }

        public Trapesium getTrapesium() {
            return trapesium;
        }
    }
}
