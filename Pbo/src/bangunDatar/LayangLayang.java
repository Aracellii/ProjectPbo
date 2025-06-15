package bangunDatar;

import java.util.Scanner;

public class LayangLayang extends BangunDatar {
    protected double diagonalA;
    protected double diagonalB;
    protected double sisiPendek;
    protected double sisiPanjang;
    protected double luas;
    protected double keliling;

    public LayangLayang(double diagonalA, double diagonalB, double sisiPendek, double sisiPanjang) {
        this.diagonalA = diagonalA;
        this.diagonalB = diagonalB;
        this.sisiPendek = sisiPendek;
        this.sisiPanjang = sisiPanjang;
        this.luas = hitungLuas();
        this.keliling = hitungKeliling();
    }

    @Override
    public double hitungLuas() {
        luas = diagonalA * diagonalB / 2;
        System.out.println("Luas Layang-Layang: " + luas);
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = 2 * (sisiPanjang + sisiPendek);
        System.out.println("Keliling Layang-Layang: " + keliling);
        return keliling;
    }

    public static class LayangLayangRunnable implements Runnable {
        private LayangLayang layangLayang;

        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan diagonal A: ");
            double diagonalA = scanner.nextDouble();

            System.out.print("Masukkan diagonal B: ");
            double diagonalB = scanner.nextDouble();

            System.out.print("Masukkan sisi pendek: ");
            double sisiPendek = scanner.nextDouble();

            System.out.print("Masukkan sisi panjang: ");
            double sisiPanjang = scanner.nextDouble();

            layangLayang = new LayangLayang(diagonalA, diagonalB, sisiPendek, sisiPanjang);

            System.out.println("Keliling layang-layang: " + layangLayang.hitungKeliling());
            System.out.println("Luas layang-layang: " + layangLayang.hitungLuas());
        }

        public LayangLayang getLayangLayang() {
            return layangLayang;
        }
    }
}
