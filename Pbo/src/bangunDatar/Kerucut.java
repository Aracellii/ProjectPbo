package bangunDatar;

import java.util.Scanner;

public class Kerucut extends Lingkaran {
    protected double tinggi;
    protected double volume;
    protected double luasPermukaan;

    public Kerucut(double jari, double tinggi) {
        super(jari);
        this.tinggi = tinggi;
        this.luasPermukaan = hitungLuasPermukaan();
        this.volume = hitungVolume();
    }

    public double hitungVolume() { // jika jari tidak ganti baru
        volume = (1.0 / 3.0) * super.luas * tinggi;
        return volume;
    }

    public double hitungLuasPermukaan() { // jika jari tidak ganti baru
        luasPermukaan = Math.PI * (jari + Math.sqrt(jari * jari + tinggi * tinggi));
        return luasPermukaan;
    }

    public double hitungVolume(double jariBaru) { // jika jari ganti baru
        volume = (1.0 / 3.0) * Math.PI * jariBaru * jariBaru * tinggi;
        return volume;
    }

    public double hitungLuasPermukaan(double jariBaru) { // jika jari ganti baru
        luasPermukaan = Math.PI * (jariBaru + Math.sqrt(jariBaru * jariBaru + tinggi * tinggi));
        return luasPermukaan;
    }

    public static class KerucutRunnable implements Runnable {
        private Kerucut kerucut;

        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan jari-jari kerucut: ");
            double jari = scanner.nextDouble();
            System.out.print("Masukkan tinggi kerucut: ");
            double tinggi = scanner.nextDouble();

            kerucut = new Kerucut(jari, tinggi);

            System.out.println("Volume kerucut: " + kerucut.hitungVolume());
            System.out.println("Luas permukaan kerucut: " + kerucut.hitungLuasPermukaan());
        }

        public Kerucut getKerucut() {
            return kerucut;
        }
    }
}
