package bangunDatar;

import java.util.Scanner;

public class Tabung extends Lingkaran {
    private final double tinggi;
    private double volume;
    private double luasPermukaan;

    public Tabung(double jari, double tinggi) {
        super(jari);
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        volume = super.luas * tinggi;
        return volume;
    }

    public double hitungLuasPermukaan() {
        luas = 2.0 * super.luas + super.keliling * tinggi;
        return luasPermukaan;
    }
    
        // Method overloading untuk volume jika diberi ukuran baru
    public double hitungVolume(double jariBaru, double tinggiBaru) {
        volume = Math.PI * jariBaru * jariBaru * tinggiBaru;
        return volume;
    }

    // Method overloading untuk luas permukaan jika diberi ukuran baru
    public double hitungLuasPermukaan(double jariBaru, double tinggiBaru) {
        luasPermukaan = 2.0 * Math.PI * jariBaru * jariBaru + 2.0 * Math.PI * jariBaru * tinggiBaru;
        return luasPermukaan;
    }

    // Inner class untuk thread
    public static class TabungRunnable implements Runnable {
        private Tabung tabung;

        @Override
        public void run() {
            Scanner scanner = new java.util.Scanner(System.in);

            System.out.print("Masukkan jari-jari tabung: ");
            double jari = scanner.nextDouble();

            System.out.print("Masukkan tinggi tabung: ");
            double tinggi = scanner.nextDouble();

            tabung = new Tabung(jari, tinggi);

            System.out.println("Volume tabung: " + tabung.hitungVolume());   
            System.out.println("Luas permukaan tabung: " + tabung.hitungLuasPermukaan());   
        }

        public Tabung getTabung() {
            return tabung;
        }
    }
}