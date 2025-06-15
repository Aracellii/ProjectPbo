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
        double jariBola; // Satu variabel untuk menampung jari-jari yang akan dipakai

        System.out.print("Gunakan jari-jari lingkaran (" + this.jariLingkaran + ") untuk bola? (ya/tidak): ");
        String pilihan = input.nextLine().trim().toLowerCase();

        // 1. Tentukan nilai jariUntukBola terlebih dahulu
        if (pilihan.equals("ya")) {
            jariBola = this.jariLingkaran;
        } else if (pilihan.equals("tidak")) {
            System.out.print("Masukkan jari-jari baru untuk bola: ");
            while (true) {
                try {
                    jariBola = Double.parseDouble(input.nextLine());
                    break; // Keluar dari loop jika input valid
                } catch (NumberFormatException e) {
                    System.out.print("Input tidak valid. Masukkan angka untuk jari-jari: ");
                }
            }
        } else {
            System.out.println("Input salah. Hanya menerima 'ya' atau 'tidak'.");
            return; // Hentikan eksekusi jika input tidak valid
        }

        // 2. Buat objek Bola HANYA SEKALI dengan jari-jari yang sudah ditentukan
        Bola bola = new Bola(jariBola);

        System.out.print("Hitung apa? (volume/luas/keduanya): ");
        String tugas = input.nextLine().trim().toLowerCase();

        // 3. Logika switch menjadi jauh lebih sederhana
        // Tidak perlu if-else lagi, karena objek 'bola' sudah benar
        switch (tugas) {
            case "volume":
                System.out.println("Volume bola dengan jari-jari " + jariBola + ": " + bola.hitungVolume());
                break;
            case "luas":
                System.out.println("Luas permukaan bola dengan jari-jari " + jariBola + ": " + bola.hitungLuasPermukaan());
                break;
            case "keduanya":
                // Memanggil metode tanpa parameter karena objek sudah memiliki jari-jari yang benar
                System.out.println("Volume bola dengan jari-jari " + jariBola + ": " + bola.hitungVolume());
                System.out.println("Luas permukaan bola dengan jari-jari " + jariBola + ": " + bola.hitungLuasPermukaan());
                break;
            default:
                System.out.println("Tugas tidak dikenali. Gunakan: volume, luas, atau keduanya.");
        }
    }
}