package bangunDatar;

import java.util.Scanner;

public class BelahKetupat extends BangunDatar {
    protected double diagonalA;
    protected double diagonalB;
    protected double sisi;
    protected double keliling;
    protected double luas;

    public BelahKetupat(double diagonalA, double diagonalB, double sisi) {
        this.diagonalA = diagonalA;
        this.diagonalB = diagonalB;
        this.sisi = sisi;
        this.luas = hitungLuas();
        this.keliling = hitungKeliling();
    }

    @Override
    public double hitungLuas() {
        luas = (diagonalA * diagonalB) / 2.0;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = sisi * 4.0;
        return keliling;
    }

    public static class BelahKetupatRunnable implements Runnable {
        private BelahKetupat belahKetupat;

        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan diagonal A belah ketupat: ");
            double diagonalA = scanner.nextDouble();

            System.out.print("Masukkan diagonal B belah ketupat: ");
            double diagonalB = scanner.nextDouble();

            System.out.print("Masukkan sisi belah ketupat: ");
            double sisi = scanner.nextDouble();

            belahKetupat = new BelahKetupat(diagonalA, diagonalB, sisi);

            System.out.println("Luas belah ketupat: " + belahKetupat.hitungLuas());
            System.out.println("Keliling belah ketupat: " + belahKetupat.hitungKeliling());
        }

        public BelahKetupat getBelahKetupat() {
            return belahKetupat;
        }
    }
}
