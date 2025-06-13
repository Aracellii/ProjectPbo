package thread;
import bangunDatar.Bola;
import java.util.Scanner;

public class BolaRun implements Runnable {
    private Scanner input;
    private double jariLingkaran;

    public BolaRun(Scanner input, double jariLingkaran) {
        this.input = input;
        this.jariLingkaran = jariLingkaran;
    }

    @Override
    public void run() {
        double jariBola = 0;

        System.out.print("Gunakan jari-jari lingkaran (" + jariLingkaran + ") untuk bola? (ya/tidak): ");
        String pilihan = input.nextLine().trim().toLowerCase();

        if (pilihan.equals("ya")) {
            jariBola = jariLingkaran;
        } else if (pilihan.equals("tidak")) {
            System.out.print("Masukkan jari-jari baru untuk bola: ");
            while (true) {
                String line = input.nextLine();
                try {
                    jariBola = Double.parseDouble(line);
                    break;
                } catch (NumberFormatException e) {
                    System.out.print("Input tidak valid, masukkan angka untuk jari-jari: ");
                }
            }
        } else {
            System.out.println("Input salah");
            return;
        }

        // Panggil method static tanpa buat objek
        System.out.println("Volume bola: " + Bola.hitungVolume(jariBola));
        System.out.println("Luas permukaan bola: " + Bola.hitungLuasPermukaan(jariBola));
    }
}
