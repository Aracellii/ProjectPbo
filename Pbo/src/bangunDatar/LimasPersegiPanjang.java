package bangunDatar;

import java.util.Scanner;

public class LimasPersegiPanjang extends PersegiPanjang {
    private double tinggiLimas;
    private double volume;
    private double luasPermukaan;
    private double sisiTegakPanjang, sisiTegakLebar;
    
    public LimasPersegiPanjang(double panjang, double lebar, double tinggiLimas) {
        super(panjang, lebar);
        this.tinggiLimas = tinggiLimas;
    }
    
    public double hitungVolume() {
        volume = 1.0/3.0 * super.luas * tinggiLimas;
        return volume;
    }
    
    public double hitungLuasPermukaan() {
        sisiTegakPanjang = Math.sqrt(tinggiLimas * tinggiLimas + (super.panjang/2.0) * (super.panjang/2.0));
        sisiTegakLebar = Math.sqrt(tinggiLimas * tinggiLimas + (super.lebar/2.0) * (super.lebar/2.0));
        luasPermukaan = super.luas + (super.panjang * sisiTegakPanjang) + (super.lebar * sisiTegakLebar);
        return luasPermukaan;
    }
    
        // Method overloading untuk volume jika diberi ukuran baru
    public double hitungVolume(double panjangBaru, double lebarBaru, double tinggiLimasBaru) {
        volume = (1.0/3.0) * (panjangBaru * lebarBaru) * tinggiLimasBaru;
        return volume;
    }

    // Method overloading untuk luas permukaan jika diberi ukuran baru
    public double hitungLuasPermukaan(double panjangBaru, double lebarBaru, double tinggiLimasBaru) {
        double sisiTegakPanjang = Math.sqrt(tinggiLimasBaru * tinggiLimasBaru + (panjangBaru/2.0) * (panjangBaru/2.0));

        double sisiTegakLebar = Math.sqrt(tinggiLimasBaru * tinggiLimasBaru + (lebarBaru/2.0) * (lebarBaru/2.0));

        luasPermukaan = (panjangBaru * lebarBaru) + (panjangBaru * sisiTegakPanjang) + (lebarBaru * sisiTegakLebar);
        return luasPermukaan;
    }

    // Inner class untuk thread
    public static class LimasPersegiPanjangRunnable implements Runnable {
        private LimasPersegiPanjang limas;

        @Override
        public void run() {
            Scanner scanner = new java.util.Scanner(System.in);

            System.out.print("Masukkan panjang alas persegi panjang: ");
            double panjang = scanner.nextDouble();

            System.out.print("Masukkan lebar alas persegi panjang: ");
            double lebar = scanner.nextDouble();

            System.out.print("Masukkan tinggi limas: ");
            double tinggiLimas = scanner.nextDouble();

            limas = new LimasPersegiPanjang(panjang, lebar, tinggiLimas);

            System.out.println("Luas alas: " + limas.hitungLuas());  
            System.out.println("Keliling alas: " + limas.hitungKeliling());   
            System.out.println("Volume limas: " + limas.hitungVolume());   
            System.out.println("Luas permukaan limas: " + limas.hitungLuasPermukaan());   
        }

        public LimasPersegiPanjang getLimasPersegiPanjang() {
            return limas;
        }
    }
}
