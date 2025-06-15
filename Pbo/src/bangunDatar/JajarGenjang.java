package bangunDatar;

import java.util.Scanner;

public class JajarGenjang extends BangunDatar {
    protected double alas;
    protected double sisiMiring;
    protected double tinggi;
    protected double luas;
    protected double keliling;

    public JajarGenjang(double alas, double sisiMiring, double tinggi) {
        this.alas = alas;
        this.sisiMiring = sisiMiring;
        this.tinggi = tinggi;
        this.luas = hitungLuas();
        this.keliling = hitungKeliling();
    }

    @Override
    public double hitungLuas() {
        this.luas = alas * tinggi;
        System.out.println("Luas Jajar Genjang: " + luas);
        return luas;
    }

    @Override   
    public double hitungKeliling() {
        this.keliling = (alas + sisiMiring) * 2;
        System.out.println("Keliling Jajar Genjang: " + keliling);
        return keliling;
    }

    public static class JajarGenjangRunnable implements Runnable {
        private JajarGenjang jajarGenjang;

        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan alas jajar genjang: ");
            double alas = scanner.nextDouble();

            System.out.print("Masukkan sisi miring jajar genjang: ");
            double sisiMiring = scanner.nextDouble();

            System.out.print("Masukkan tinggi jajar genjang: ");
            double tinggi = scanner.nextDouble();

            jajarGenjang = new JajarGenjang(alas, sisiMiring, tinggi);

            System.out.println("Keliling jajar genjang: " + jajarGenjang.hitungKeliling());
            System.out.println("Luas jajar genjang: " + jajarGenjang.hitungLuas());
        }

        public JajarGenjang getJajarGenjang() {
            return jajarGenjang;
        }
    }
}
