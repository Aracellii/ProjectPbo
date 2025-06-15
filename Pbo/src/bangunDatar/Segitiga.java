package bangunDatar;

import java.util.Scanner;

public class Segitiga extends BangunDatar implements bangun.Bangun {
    protected double alas;
    protected double tinggi;
    protected double sisiA;
    protected double sisiB;
    protected double luas;
    protected double keliling;

    public Segitiga(double alas, double tinggi, double sisiA, double sisiB) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.hitungLuas();
        this.hitungKeliling();
    }

    @Override
    public double hitungLuas() {
        luas = alas * tinggi / 2;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = alas + sisiA + sisiB;
        return keliling;
    }

    public static class SegitigaRunnable implements Runnable {
        private Segitiga segitiga;

        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan alas segitiga: ");
            double alas = scanner.nextDouble();

            System.out.print("Masukkan tinggi segitiga: ");
            double tinggi = scanner.nextDouble();

            System.out.print("Masukkan sisi A segitiga: ");
            double sisiA = scanner.nextDouble();

            System.out.print("Masukkan sisi B segitiga: ");
            double sisiB = scanner.nextDouble();

            segitiga = new Segitiga(alas, tinggi, sisiA, sisiB);

            System.out.println("Luas segitiga: " + segitiga.hitungLuas());
            System.out.println("Keliling segitiga: " + segitiga.hitungKeliling());
        }

        public Segitiga getSegitiga() {
            return segitiga;
        }
    }
}
