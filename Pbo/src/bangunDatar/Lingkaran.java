package bangunDatar;

import java.util.Scanner;

public class Lingkaran extends BangunDatar {
    protected double jari;
    protected double luas;
    protected double keliling;

    public Lingkaran(double jari) {
        this.jari = jari;
        this.keliling = hitungKeliling();
        this.luas = hitungLuas();
    }

    @Override
    public double hitungLuas() {
        luas = Math.PI * jari * jari;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = 2.0 * Math.PI * jari;
        return keliling;
    }

    public double getJari() {
        return jari;
    }

    public double getLuas() {
        return luas;
    }

    public static class LingkaranRunnable implements Runnable {
        private Lingkaran lingkaran;


        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan jari-jari lingkaran: ");
            double jari = scanner.nextDouble();

            lingkaran = new Lingkaran(jari);

            System.out.println("Luas lingkaran: " + lingkaran.getLuas());
            System.out.println("Keliling lingkaran: " + lingkaran.hitungKeliling());
        }

        public Lingkaran getLingkaran() {
            return lingkaran;
        }
    }
}
