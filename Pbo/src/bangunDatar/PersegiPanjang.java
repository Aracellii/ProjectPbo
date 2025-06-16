package bangunDatar;

import java.util.Scanner;

public class PersegiPanjang extends BangunDatar {
    protected double panjang;
    protected double lebar;
    protected double luas;
    protected double keliling;
    
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.keliling = hitungKeliling();
        this.luas = hitungLuas();
    }

    @Override
    public double hitungLuas() {
        luas = panjang * lebar;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = 2.0 * (panjang + lebar);
        return keliling;
    }

    public static class PersegiPanjangRunnable implements Runnable {
        private PersegiPanjang persegiPanjang;

        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan panjang persegi panjang: ");
            double panjang = scanner.nextDouble();

            System.out.print("Masukkan lebar persegi panjang: ");
            double lebar = scanner.nextDouble();

            persegiPanjang = new PersegiPanjang(panjang, lebar);

            System.out.println("Luas persegi panjang: " + persegiPanjang.hitungLuas());
            System.out.println("Keliling persegi panjang: " + persegiPanjang.hitungKeliling());
        }

        public PersegiPanjang getPersegiPanjang() {
            return persegiPanjang;
        }
    }
}
