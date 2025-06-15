package bangunDatar;

import bangun.Bangun;
import java.util.Scanner;

public class Persegi extends BangunDatar implements Bangun {
    protected double sisi;
    protected double luas;
    protected double keliling;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        luas = sisi * sisi;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = 4 * sisi;
        return keliling;
    }
    

    public static class PersegiRunnable implements Runnable {  // static agar mudah dipanggil dari luar
        private Persegi persegi;
         
        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan sisi persegi: ");
            double sisi = scanner.nextDouble();

            persegi = new Persegi(sisi);

            System.out.println("Luas persegi: " + persegi.hitungLuas());
            System.out.println("Keliling persegi: " + persegi.hitungKeliling());
        }

        public Persegi getPersegi() {
            return persegi;
        }
    }
}
