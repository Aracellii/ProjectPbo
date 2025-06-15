package bangunDatar;

import java.util.Scanner;

public class CincinBola extends Lingkaran {
    protected double tinggi;
    protected double luasPermukaan;
    protected double volume;

    public CincinBola(double jari, double tinggi) {
        super(jari);
        this.tinggi = tinggi;
        this.luasPermukaan = hitungLuasPermukaan();
        this.volume = hitungVolume();
    }

    public double hitungLuasPermukaan() {
        luasPermukaan = 2 * Math.PI * jari * tinggi;
        return luasPermukaan;
    }

    public double hitungVolume() {
        volume = (Math.PI * Math.pow(tinggi, 2) * (3 * jari - tinggi)) / 3;
        return volume;
    }

    // Inner class Runnable untuk input jari-jari dan tinggi, lalu menampilkan hasil
    public static class CincinBolaRunnable implements Runnable {
        private CincinBola cincinBola;

        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan jari-jari bola: ");
            double jari = scanner.nextDouble();
            System.out.print("Masukkan tinggi cincin bola: ");
            double tinggi = scanner.nextDouble();

            cincinBola = new CincinBola(jari, tinggi);

            System.out.println("Luas permukaan cincin bola: " + cincinBola.hitungLuasPermukaan());
            System.out.println("Volume cincin bola: " + cincinBola.hitungVolume());
        }

        public CincinBola getCincinBola() {
            return cincinBola;
        }
    }
}