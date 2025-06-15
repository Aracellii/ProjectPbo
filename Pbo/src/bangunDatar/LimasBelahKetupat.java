package bangunDatar;

import java.util.Scanner;

public class LimasBelahKetupat extends BelahKetupat {
    private double tinggiLimas;
    private double tinggiSegitigaTegak;
    private double volume;
    private double luasPermukaan;

    public LimasBelahKetupat(double diagonalA, double diagonalB, double sisi,
                             double tinggiLimas, double tinggiSegitigaTegak) {
        super(diagonalA, diagonalB, sisi);
        this.tinggiLimas = tinggiLimas;
        this.tinggiSegitigaTegak = tinggiSegitigaTegak;
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();
    }

    public double hitungVolume() {
        return (1.0 / 3.0) * super.hitungLuas() * tinggiLimas;
    }

    public double hitungLuasPermukaan() {
        double luasSelubung = 4 * (0.5 * sisi * tinggiSegitigaTegak);
        return super.hitungLuas() + luasSelubung;
    }

    public static class LimasBelahKetupatRunnable implements Runnable {
        private LimasBelahKetupat limas;

        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan diagonal A belah ketupat: ");
            double diagonalA = scanner.nextDouble();

            System.out.print("Masukkan diagonal B belah ketupat: ");
            double diagonalB = scanner.nextDouble();

            System.out.print("Masukkan sisi belah ketupat: ");
            double sisi = scanner.nextDouble();

            System.out.print("Masukkan tinggi limas: ");
            double tinggiLimas = scanner.nextDouble();

            System.out.print("Masukkan tinggi segitiga tegak (selubung): ");
            double tinggiSegitigaTegak = scanner.nextDouble();

            limas = new LimasBelahKetupat(diagonalA, diagonalB, sisi, tinggiLimas, tinggiSegitigaTegak);

            System.out.println("Luas alas belah ketupat: " + limas.hitungLuas());
            System.out.println("Keliling alas belah ketupat: " + limas.hitungKeliling());
            System.out.println("Volume limas: " + limas.hitungVolume());
            System.out.println("Luas permukaan limas: " + limas.hitungLuasPermukaan());
        }

        public LimasBelahKetupat getLimasBelahKetupat() {
            return limas;
        }
    }
}
