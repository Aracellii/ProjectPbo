package bangunDatar;

import java.util.Scanner;

public class LimasLayangLayang extends LayangLayang {
    private double tinggiLimas;
    private double volume;
    private double luasPermukaan;
    private double sisiTegakPendek, sisiTegakPanjang;

    public LimasLayangLayang(double diagonalA, double diagonalB, double sisiPendek, double sisiPanjang, double tinggiLimas) {
        super(diagonalA, diagonalB, sisiPendek, sisiPanjang);
        this.tinggiLimas = tinggiLimas;
    }

    public double hitungVolume() {
        volume = (1.0 / 3.0) * super.luas * tinggiLimas;
        return volume;
    }

    public double hitungLuasPermukaan() {
        sisiTegakPendek = Math.sqrt((tinggiLimas * tinggiLimas)  + (super.sisiPendek/2.0) * (super.sisiPendek/2.0));
        sisiTegakPanjang = Math.sqrt((tinggiLimas * tinggiLimas) + (super.sisiPanjang/2.0) * (super.sisiPanjang/2.0));
        luasPermukaan = super.luas + 2 * (0.5 * super.sisiPendek * sisiTegakPendek) + 2 * (0.5 * super.sisiPanjang * sisiTegakPanjang);
        return luasPermukaan;
    }
    
    public double hitungVolume(double diagonalABaru, double diagonalBBaru, double tinggiLimasBaru) {
        volume = (1.0 / 3.0) * (0.5 * diagonalABaru * diagonalBBaru) * tinggiLimasBaru;
        return volume;
    }

    public double hitungLuasPermukaan(double diagonalABaru, double diagonalBBaru, double sisiPendekBaru, double sisiPanjangBaru, double tinggiLimasBaru) {
        double sisiTegakPendek = Math.sqrt((tinggiLimasBaru * tinggiLimasBaru) + (sisiPendekBaru/2.0) * (sisiPendekBaru/2.0));

        double sisiTegakPanjang = Math.sqrt((tinggiLimasBaru * tinggiLimasBaru) + (sisiPanjangBaru/2.0) * (sisiPanjangBaru/2.0));

        luasPermukaan = (0.5 * diagonalABaru * diagonalBBaru) + 2 * (0.5 * sisiPendekBaru * sisiTegakPendek) + 2 * (0.5 * sisiPanjangBaru * sisiTegakPanjang);
        return luasPermukaan;
    }

    public static class LimasLayangLayangRunnable implements Runnable {
        private LimasLayangLayang limas;

        @Override
        public void run() {
            Scanner scanner = new java.util.Scanner(System.in);

            System.out.print("Masukkan diagonal A layang-layang: ");
            double diagonalA = scanner.nextDouble();

            System.out.print("Masukkan diagonal B layang-layang: ");
            double diagonalB = scanner.nextDouble();

            System.out.print("Masukkan sisi pendek layang-layang: ");
            double sisiPendek = scanner.nextDouble();

            System.out.print("Masukkan sisi panjang layang-layang: ");
            double sisiPanjang = scanner.nextDouble();

            System.out.print("Masukkan tinggi limas: ");
            double tinggiLimas = scanner.nextDouble();

            limas = new LimasLayangLayang(diagonalA, diagonalB, sisiPendek, sisiPanjang, tinggiLimas);

            System.out.println("Luas alas layang-layang: " + limas.hitungLuas());  
            System.out.println("Keliling alas layang-layang: " + limas.hitungKeliling());   
            System.out.println("Volume limas: " + limas.hitungVolume());   
            System.out.println("Luas permukaan limas: " + limas.hitungLuasPermukaan());   
        }

        public LimasLayangLayang getLimasLayangLayang() {
            return limas;
        }
    }
}
