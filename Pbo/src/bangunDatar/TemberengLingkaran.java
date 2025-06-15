package bangunDatar;

import java.util.Scanner;

public class TemberengLingkaran extends Lingkaran {
    private final double sudut;
  
    protected double luasTembereng;
    protected double kelilingTembereng;

    public TemberengLingkaran(double jari, double sudut){
        super(jari); 
        this.sudut = sudut;
        this.kelilingTembereng=hitungKeliling();
        this.luasTembereng=hitungLuas();

    }
    
    @Override
    public double hitungLuas() {  
        double sudutRadian = Math.toRadians(sudut);
        double luasJuring = (sudut / 360.0) * super.luas;
        double luasSegitiga = 0.5 * super.jari* super.jari * Math.sin(sudutRadian);
        luasTembereng = luasJuring - luasSegitiga;
        return luasTembereng;
    }
    
    @Override
    public double hitungKeliling() {
        double sudutRadian = Math.toRadians(sudut);
        double panjangBusur = sudutRadian * super.jari;
        double taliBusur = 2 * super.jari * Math.sin(sudutRadian / 2);
        kelilingTembereng = panjangBusur + taliBusur;
        return kelilingTembereng;
    }

    public double hitungLuas(double jariJariBaru, double sudutBaru) {
        double sudutRadian = Math.toRadians(sudutBaru);
        double luasJuring = (sudutBaru / 360.0) * Math.PI * jariJariBaru * jariJariBaru;
        double luasSegitiga = 0.5 * jariJariBaru * jariJariBaru * Math.sin(sudutRadian);
        luasTembereng = luasJuring - luasSegitiga;
        return luasTembereng;
    }

    public double hitungKeliling(double jariJariBaru, double sudutBaru) {
        double sudutRadian = Math.toRadians(sudutBaru);
        double panjangBusur = sudutRadian * jariJariBaru;
        double taliBusur = 2 * jariJariBaru * Math.sin(sudutRadian / 2);
        kelilingTembereng= panjangBusur + taliBusur;
        return kelilingTembereng;
    }
    
    public static class TemberengLingkaranRunnable implements Runnable {
        private TemberengLingkaran tembereng;

        @Override
        public void run() {
            Scanner scanner = new java.util.Scanner(System.in);

            System.out.print("Masukkan jari-jari tembereng lingkaran: ");
            double jari = scanner.nextDouble();

            System.out.print("Masukkan besar sudut tembereng (derajat): ");
            double sudut = scanner.nextDouble();

            tembereng = new TemberengLingkaran(jari, sudut);

            System.out.println("Luas tembereng lingkaran: " + tembereng.hitungLuas());   
            System.out.println("Keliling tembereng lingkaran: " + tembereng.hitungKeliling());   
        }

        public TemberengLingkaran getTemberengLingkaran() {
            return tembereng;
        }
    }

}
