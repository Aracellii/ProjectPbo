package bangunDatar;

import java.util.Scanner;

public class TemberengBola extends Lingkaran {
    protected double tinggi;
    protected double volume;
    protected double luasPermukaan;

    public TemberengBola(double tinggi, double jari) {
        super(jari);
        this.tinggi = tinggi;
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();

    }
    
    public double hitungVolume() {
        volume = (Math.PI * tinggi * tinggi * (3 * jari - tinggi)) / 3;
        return volume;
    }

    public double hitungLuasPermukaan() {
        luasPermukaan = 2 * Math.PI * jari * tinggi;
        return luasPermukaan;
    }
    
        // Method overloading untuk volume jika diberi ukuran baru
    public double hitungVolume(double jariBaru, double tinggiBaru) {
        volume = (Math.PI * tinggiBaru * tinggiBaru * (3 * jariBaru - tinggiBaru)) / 3;
        return volume;
    }

    // Method overloading untuk luas permukaan jika diberi ukuran baru
    public double hitungLuasPermukaan(double jariBaru, double tinggiBaru) {
        luasPermukaan = 2 * Math.PI * jariBaru * tinggiBaru;
        return luasPermukaan;
    }

    // Inner class untuk thread
    public static class TemberengBolaRunnable implements Runnable {
        private TemberengBola temberengBola;

        @Override
        public void run() {
            Scanner scanner = new java.util.Scanner(System.in);

            System.out.print("Masukkan jari-jari tembereng bola: ");
            double jari = scanner.nextDouble();

            System.out.print("Masukkan tinggi tembereng bola: ");
            double tinggi = scanner.nextDouble();

            temberengBola = new TemberengBola(tinggi, jari);

            System.out.println("Volume tembereng bola: " + temberengBola.hitungVolume());   
            System.out.println("Luas permukaan tembereng bola: " + temberengBola.hitungLuasPermukaan());   
        }

        public TemberengBola getTemberengBola() {
            return temberengBola;
        }
    }
}


