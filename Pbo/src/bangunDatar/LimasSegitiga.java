package bangunDatar;

import java.util.Scanner;

public class LimasSegitiga extends Segitiga {
    private final double tinggiLimas;
    private double tinggiSisiTegakA, tinggiSisiTegakB, tinggiSisiTegakC;
    private double volume;
    private double luasPermukaan;

    public LimasSegitiga(double alas, double tinggi, double sisiA, double sisiB, double tinggiLimas) {
        super(alas, tinggi, sisiA, sisiB);
        this.tinggiLimas = tinggiLimas;
    }

    public double hitungVolume() {
        volume = (1.0 / 3.0) * super.luas * tinggiLimas;
        return volume;
    }

    public double hitungLuasPermukaan() {
        tinggiSisiTegakA = Math.sqrt(tinggiLimas * tinggiLimas + (super.sisiA/2.0) * (super.sisiA/2.0));
        tinggiSisiTegakB = Math.sqrt(tinggiLimas * tinggiLimas + (super.sisiB/2.0) * (super.sisiB/2.0));
        tinggiSisiTegakC = Math.sqrt(tinggiLimas * tinggiLimas + (super.alas/2.0) * (super.alas/2.0));  
        double luasSisiA = 0.5 * super.sisiA * tinggiSisiTegakA;
        double luasSisiB = 0.5 * super.sisiB * tinggiSisiTegakB;
        double luasSisiAlas = 0.5 * super.alas  * tinggiSisiTegakC;
        luasPermukaan = super.luas + luasSisiA + luasSisiB + luasSisiAlas;
        return luasPermukaan;
    }
    
        // Method overloading untuk volume jika diberi ukuran baru
    public double hitungVolume(double alasBaru, double tinggiBaru, double tinggiLimasBaru) {
        volume = (1.0/3.0) * (alasBaru * tinggiBaru * 0.5) * tinggiLimasBaru;
        return volume;
    }

    // Method overloading untuk luas permukaan jika diberi ukuran baru
    public double hitungLuasPermukaan(double alasBaru, double tinggiBaru, double sisiABaru, double sisiBBaru, double tinggiLimasBaru) {
        tinggiSisiTegakA = Math.sqrt(tinggiLimasBaru * tinggiLimasBaru + (sisiABaru/2.0) * (sisiABaru/2.0));   
        tinggiSisiTegakB = Math.sqrt(tinggiLimasBaru * tinggiLimasBaru + (sisiBBaru/2.0) * (sisiBBaru/2.0));   
        tinggiSisiTegakC = Math.sqrt(tinggiLimasBaru * tinggiLimasBaru + (alasBaru/2.0) * (alasBaru/2.0));

        double luasSisiA = 0.5 * sisiABaru * tinggiSisiTegakA;
        double luasSisiB = 0.5 * sisiBBaru * tinggiSisiTegakB;
        double luasSisiAlas = 0.5 * alasBaru * tinggiSisiTegakC;

        luasPermukaan = (alasBaru * tinggiBaru * 0.5) + luasSisiA + luasSisiB + luasSisiAlas;

        return luasPermukaan;
    }

    // Inner class untuk thread
    public static class LimasSegitigaRunnable implements Runnable {
        private LimasSegitiga limas;

        @Override
        public void run() {
            Scanner scanner = new java.util.Scanner(System.in);

            System.out.print("Masukkan ukuran alas segitiga: ");
            double alas = scanner.nextDouble();

            System.out.print("Masukkan ukuran tinggi segitiga: ");
            double tinggi = scanner.nextDouble();

            System.out.print("Masukkan ukuran sisi A: ");
            double sisiA = scanner.nextDouble();

            System.out.print("Masukkan ukuran sisi B: ");
            double sisiB = scanner.nextDouble();

            System.out.print("Masukkan tinggi limas: ");
            double tinggiLimas = scanner.nextDouble();

            limas = new LimasSegitiga(alas, tinggi, sisiA, sisiB, tinggiLimas);

            System.out.println("Luas alas: " + limas.hitungLuas());  
            System.out.println("Keliling alas: " + limas.hitungKeliling());   
            System.out.println("Volume limas: " + limas.hitungVolume());   
            System.out.println("Luas permukaan limas: " + limas.hitungLuasPermukaan());   
        }

        public LimasSegitiga getLimasSegitiga() {
            return limas;
        }
    }
}
