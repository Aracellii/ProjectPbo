package bangunDatar;

import java.util.Scanner;

public class Kubus extends Persegi  {  
    public Kubus(double sisi) {
        super(sisi);
    }
    
    public void hitungVolume() {
        double volume = sisi * sisi * sisi;
        System.out.println("Luas Kubus: " + volume);
    }
    public void hitungLuasPermukaan() {
        double luas = 6 * sisi * sisi;
        System.out.println("Luas Permukaan Kubus: " + luas);
    }
    
    public static class KubusRunnable implements Runnable { 
        private Kubus kubus;
         
        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan sisi kubus: ");
            double sisi = scanner.nextDouble();

            kubus = new Kubus(sisi);

            System.out.println("Luas persegi: " + kubus.hitungLuas());
            System.out.println("Keliling persegi: " + kubus.hitungKeliling());
        }

        public Kubus getKubus() {
            return kubus;
        }
    }
}
