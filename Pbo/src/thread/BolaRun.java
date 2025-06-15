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
        boolean pakaiLingkaran = false;

        System.out.print("Gunakan jari-jari lingkaran (" + jariLingkaran + ") untuk bola? (ya/tidak): ");
        String pilihan = input.nextLine().trim().toLowerCase();

        if (pilihan.equals("ya")) {
            jariBola = jariLingkaran;
            pakaiLingkaran = true;
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
            System.out.println("Input salah. Hanya menerima 'ya' atau 'tidak'.");
            return;
        }

        // Buat objek Bola dengan jariBola (baik dari lingkaran maupun baru)
        Bola bola = new Bola(jariLingkaran); // tetap buat dengan jari lingkaran karena pewarisan

        System.out.print("Hitung apa? (volume/luas/keduanya): ");
        String tugas = input.nextLine().trim().toLowerCase();

        switch (tugas) {
            case "volume":
                if (pakaiLingkaran) {
                    System.out.println("Volume bola dengan jari-jari " + jariBola + ": " + bola.hitungVolume());
                } else {
                    System.out.println("Volume bola dengan jari-jari " + jariBola + ": " + bola.hitungVolume(jariBola));
                }
                break;
            case "luas":
                if (pakaiLingkaran) {
                    System.out.println("Luas permukaan bola dengan jari-jari " + jariBola + ": " + bola.hitungLuasPermukaan());
                } else {
                    System.out.println("Luas permukaan bola dengan jari-jari " + jariBola + ": " + bola.hitungLuasPermukaan(jariBola));
                }
                break;
            case "keduanya":
                if (pakaiLingkaran) {
                    System.out.println("Volume bola dengan jari-jari " + jariBola + ": " + bola.hitungVolume());
                    System.out.println("Luas permukaan bola dengan jari-jari " + jariBola + ": " + bola.hitungLuasPermukaan());
                } else {
                    System.out.println("Volume bola dengan jari-jari " + jariBola + ": " + bola.hitungVolume(jariBola));
                    System.out.println("Luas permukaan bola dengan jari-jari " + jariBola + ": " + bola.hitungLuasPermukaan(jariBola));
                }
                break;
            default:
                System.out.println("Tugas tidak dikenali. Gunakan: volume, luas, atau keduanya.");
        }
    }
}
