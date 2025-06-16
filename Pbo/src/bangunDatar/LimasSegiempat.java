package bangunDatar;

import java.util.Scanner;


public class LimasSegiempat extends Persegi {
    private double tinggiLimas;
    private double volume;
    private double luasPermukaan;
    private double luasSisiTegak;

    public LimasSegiempat(double sisi, double tinggiLimas) {
        super(sisi);
        this.tinggiLimas = tinggiLimas;
    }

    public double hitungVolume() {
        volume = (1.0 / 3.0) * super.luas * tinggiLimas;
        return volume;
    }

    public double hitungLuasPermukaan() {
        luasSisiTegak = 4.0 * (0.5 * super.sisi * tinggiLimas);
        luasPermukaan = super.luas + luasSisiTegak;
        return luasPermukaan;
    }
    
        // Method overloading untuk volume jika diberi ukuran baru
    public double hitungVolume(double sisiBaru, double tinggiLimasBaru) {
        volume = (1.0 / 3.0) * (sisiBaru * sisiBaru) * tinggiLimasBaru;
        return volume;
    }

    // Method overloading untuk luas permukaan jika diberi ukuran baru
    public double hitungLuasPermukaan(double sisiBaru, double tinggiLimasBaru) {
        luasSisiTegak = 4.0 * (0.5 * sisiBaru * tinggiLimasBaru);
        luasPermukaan = (sisiBaru * sisiBaru) + luasSisiTegak;
        return luasPermukaan;
    }

    // Inner class untuk thread
    public static class LimasSegiempatRunnable implements Runnable {
        private LimasSegiempat limas;

        @Override
        public void run() {
            Scanner scanner = new java.util.Scanner(System.in);

            System.out.print("Masukkan ukuran sisi alas segiempat: ");
            double sisi = scanner.nextDouble();

            System.out.print("Masukkan tinggi limas: ");
            double tinggiLimas = scanner.nextDouble();

            limas = new LimasSegiempat(sisi, tinggiLimas);

            System.out.println("Luas alas: " + limas.hitungLuas());  
            System.out.println("Keliling alas: " + limas.hitungKeliling());   
            System.out.println("Volume limas: " + limas.hitungVolume());   
            System.out.println("Luas permukaan limas: " + limas.hitungLuasPermukaan());   
        }

        public LimasSegiempat getLimasSegiempat() {
            return limas;
        }
    }
}
