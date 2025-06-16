package bangunDatar;

import java.util.Scanner;

public class Bola extends Lingkaran {
    protected double volume;
    protected double luasPermukaan;

    public Bola(double jari) {
        super(jari);
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();
    }

    public double hitungVolume() {
        volume = (4.0 / 3.0) * Math.PI * Math.pow(super.jari, 3);
        return volume;
    }

    public double hitungLuasPermukaan() {
        luasPermukaan = 4 * Math.PI * Math.pow(super.jari, 2);
        return luasPermukaan;
    }

    public double hitungVolume(double jariBaru) {
        volume = (4.0 / 3.0) * Math.PI * Math.pow(jariBaru, 3);
        return volume;
    }

    public double hitungLuasPermukaan(double jariBaru) {
        luasPermukaan = 4.0 * Math.PI * Math.pow(jariBaru, 2);
        return luasPermukaan;
    }

    // Inner class Runnable untuk input jari-jari dan menampilkan hasil
    public static class BolaRunnable implements Runnable {
        private Bola bola;

        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan jari-jari bola: ");
            double jari = scanner.nextDouble();

            bola = new Bola(jari);

            System.out.println("Volume bola: " + bola.hitungVolume());
            System.out.println("Luas permukaan bola: " + bola.hitungLuasPermukaan());
        }

        public Bola getBola() {
            return bola;
        }
    }
}
