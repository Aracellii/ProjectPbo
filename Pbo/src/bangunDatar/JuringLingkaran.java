package bangunDatar;

import java.util.Scanner;

public class JuringLingkaran extends Lingkaran {
    protected double sudut;
    protected double luasJuring;
    protected double kelilingJuring;
    public JuringLingkaran(double jari, double sudut) {
        super(jari);
        this.sudut = sudut;
        this.luasJuring = hitungLuas();
        this.kelilingJuring = hitungKeliling();
    }
      
    @Override
    public double hitungLuas() {
        luasJuring = (sudut / 360.0) * super.luas;
        return luasJuring;
    }

    @Override
    public double hitungKeliling() {
        kelilingJuring = (sudut / 360.0) * super.luas + 2 * super.jari;
        return kelilingJuring;
    }

     public double hitungLuas(double jariJariBaru, double sudutJuringBaru) {
        luasJuring = (sudutJuringBaru / 360.0) * Math.PI * jariJariBaru * jariJariBaru;
        return luasJuring;
    }

    public double hitungKeliling(double jariJariBaru, double sudutJuringBaru) {
        kelilingJuring = (sudutJuringBaru / 360.0) * (2.0 * Math.PI * jariJariBaru) + 2.0 * jariJariBaru;
        return kelilingJuring;
    }
    
    public static class JuringLingkaranRunnable implements Runnable {
        private JuringLingkaran juringLingkaran;

        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan jari-jari lingkaran: ");
            double jari = scanner.nextDouble();
            System.out.print("Masukkan sudut juring (derajat): ");
            double sudut = scanner.nextDouble();

            juringLingkaran = new JuringLingkaran(jari, sudut);

            System.out.println("Keliling juring lingkaran: " + juringLingkaran.hitungKeliling());
            System.out.println("Luas juring lingkaran: " + juringLingkaran.hitungLuas());
        }

        public JuringLingkaran getJuringLingkaran() {
            return juringLingkaran;
        }
    }
}
