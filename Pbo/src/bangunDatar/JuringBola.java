package bangunDatar;

import java.util.Scanner;

public class JuringBola extends Bola {
    protected double sudut;
    protected double volumeJuring;
    protected double luasPermukaanJuring;

    public JuringBola(double jari, double sudut) {
        super(jari);
        this.sudut = sudut;
    }

    @Override
    public double hitungVolume() {
        volumeJuring = (sudut / 360.0) * super.volume;
        return volumeJuring;
    }

    @Override
    public double hitungLuasPermukaan() {
        luasPermukaanJuring = (sudut / 360.0) * super.luas + Math.PI * Math.pow(super.jari, 2);
        return luasPermukaanJuring;
    }

    @Override
    public double hitungVolume(double jariBaru) {
        volumeJuring = (sudut / 360.0) * Math.PI * ((4.0 / 3.0) * Math.pow(jariBaru, 3));
        return volumeJuring;
    }

    @Override
    public double hitungLuasPermukaan(double jariBaru) {
        double luasPermukaanBola = 4.0 * Math.PI * Math.pow(jariBaru, 2);
        double luasLingkaranPenutup = Math.PI * Math.pow(jariBaru, 2);
        luasPermukaanJuring = (sudut / 360.0) * luasPermukaanBola + luasLingkaranPenutup;
        return luasPermukaanJuring;
    }

    public static class JuringBolaRunnable implements Runnable {
        private JuringBola juringBola;

        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan jari-jari bola: ");
            double jari = scanner.nextDouble();
            System.out.print("Masukkan sudut juring (derajat): ");
            double sudut = scanner.nextDouble();

            juringBola = new JuringBola(jari, sudut);

            System.out.println("Volume juring bola: " + juringBola.hitungVolume());
            System.out.println("Luas permukaan juring bola: " + juringBola.hitungLuasPermukaan());
        }

        public JuringBola getJuringBola() {
            return juringBola;
        }
    }
}
