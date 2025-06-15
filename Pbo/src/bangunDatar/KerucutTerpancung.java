package bangunDatar;

import java.util.Scanner;

public class KerucutTerpancung extends Kerucut {
    private double tinggiTerpancung;
    private double volume;
    private double luasPermukaan;
    private double jariTerpancung;
    
    public KerucutTerpancung (double jari, double tinggi, double tinggiTerpancung){
        super(jari, tinggi);
        this.tinggiTerpancung = tinggiTerpancung;
        jariTerpancung = super.jari * ((super.tinggi - tinggiTerpancung)/super.tinggi);
    }

    public double hitungVolume (){
        volume = super.volume - (1.0/3.0) * Math.PI * jariTerpancung * jariTerpancung * tinggiTerpancung;
        return volume;
    }
    
    public double hitungLuasPermukaan (){
        luasPermukaan = Math.PI * jariTerpancung * (jariTerpancung + Math.sqrt((jariTerpancung - super.jari)*(jariTerpancung - super.jari) + (tinggiTerpancung)*(tinggiTerpancung)));
        return luasPermukaan;
    }
    
    
    public static class KerucutTerpancungRunnable implements Runnable {
        private KerucutTerpancung kerucutTerpancung;

        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Masukkan jari-jari kerucut: ");
            double jari = scanner.nextDouble();
            
            System.out.print("Masukkan tinggi kerucut: ");
            double tinggi = scanner.nextDouble();
            
            System.out.print("Masukkan tinggi terpancung: ");
            double tinggiTerpancung = scanner.nextDouble();

            kerucutTerpancung = new KerucutTerpancung(jari, tinggi, tinggiTerpancung);

            System.out.println("Volume kerucut: " + kerucutTerpancung.hitungVolume());
            System.out.println("Luas permukaan kerucut: " + kerucutTerpancung.hitungLuasPermukaan());
        }

        public KerucutTerpancung getKerucutTerpancung() {
            return kerucutTerpancung;
        }
    }
}
