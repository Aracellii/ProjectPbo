package thread;

import bangunDatar.Bola;
import java.util.Scanner;

public class BolaRun implements Runnable {
    private final Scanner input;
    private final double jariLingkaran;

    public BolaRun(Scanner input, double jariLingkaran) {
        this.input = input;
        this.jariLingkaran = jariLingkaran;
    }

    @Override
    public void run() {
        double jariBola = 0;

        // Validasi input pilihan ya/tidak
        while (true) {
            System.out.print("Gunakan jari-jari lingkaran (" + this.jariLingkaran + ") untuk bola? (ya/tidak): ");
            String pilihan = input.nextLine().trim().toLowerCase();

            if (pilihan.equals("ya")) {
                jariBola = this.jariLingkaran;
                break;
            } else if (pilihan.equals("tidak")) {
                // Input jari-jari baru dengan validasi angka > 0
                while (true) {
                    System.out.print("Masukkan jari-jari baru untuk bola : ");
                    String line = input.nextLine();

                    try {
                        double nilai = Double.parseDouble(line);
                        if (nilai > 0) {
                            jariBola = nilai;
                            break;
                        } else {
                            System.out.println("Jari-jari harus lebih dari 0.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Input tidak valid, masukkan angka.");
                    }
                }
                break; // keluar loop outer setelah dapat jariBola valid
            } else {
                System.out.println("Input salah. Hanya menerima 'ya' atau 'tidak'.");
            }
        }

        Bola bola = new Bola(jariBola);

        // Validasi input tugas
        String tugas;
        while (true) {
            System.out.print("Hitung apa? (volume/luas/keduanya): ");
            tugas = input.nextLine().trim().toLowerCase();

            if (tugas.equals("volume") || tugas.equals("luas") || tugas.equals("keduanya")) {
                break;
            } else {
                System.out.println("Tugas tidak dikenali. Gunakan: volume, luas, atau keduanya.");
            }
        }

        // Tampilkan hasil sesuai tugas
        switch (tugas) {
            case "volume":
                System.out.println("Volume bola dengan jari-jari " + jariBola + ": " + bola.hitungVolume());
                break;
            case "luas":
                System.out.println("Luas permukaan bola dengan jari-jari " + jariBola + ": " + bola.hitungLuasPermukaan());
                break;
            case "keduanya":
                System.out.println("Volume bola dengan jari-jari " + jariBola + ": " + bola.hitungVolume());
                System.out.println("Luas permukaan bola dengan jari-jari " + jariBola + ": " + bola.hitungLuasPermukaan());
                break;
        }
    }
}
