package bangunDatar;

import java.util.Scanner;

public class Kubus extends Persegi  {  
    private double volume;
    private double luasPermukaan;
    
    public Kubus(double sisi) {
        super(sisi);
    }
    
    public double hitungVolume() {
        volume = super.luas * sisi;
        return volume;
    }
    public double hitungLuasPermukaan() {
        luasPermukaan = 6 * super.luas;
        return luasPermukaan;
    }
    
    public static class KubusRunnable implements Runnable { 
        private Kubus kubus;
         
        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan sisi kubus: ");
            double sisi = scanner.nextDouble();

            kubus = new Kubus(sisi);

            System.out.println("Luas persegi: " + kubus.hitungVolume());
            System.out.println("Keliling persegi: " + kubus.hitungLuasPermukaan());
        }

        public Kubus getKubus() {
            return kubus;
        }
    }
}
