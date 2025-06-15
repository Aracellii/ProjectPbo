
package thread;

import bangunDatar.Lingkaran;
import java.util.Scanner;

public class LingkaranRun extends Thread {
    private Scanner input;
    private double jariLingkaran = 0;
    private Lingkaran lingkaran; // simpan objek Lingkaran di sini

    public LingkaranRun(Scanner input) {
        this.input = input;
    }

    @Override
    public void run() {
        // Input jari-jari dengan validasi
        while (true) {
            System.out.print("Masukkan jari-jari lingkaran: ");
            String line = input.nextLine();

            try {
                double nilai = Double.parseDouble(line);
                if (nilai > 0) {
                    jariLingkaran = nilai;
                    break; // keluar loop jika valid
                } else {
                    System.out.println("Jari-jari harus lebih dari 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid, masukkan angka.");
            }
        }

        // Input tugas dengan validasi
        String tugas;
        while (true) {
            System.out.print("Hitung apa? (luas/keliling/keduanya): ");
            tugas = input.nextLine().toLowerCase();

            if (tugas.equals("luas") || tugas.equals("keliling") || tugas.equals("keduanya")) {
                break; // valid
            } else {
                System.out.println("Input tidak valid. Gunakan: luas, keliling, atau keduanya.");
            }
        }

        // Buat objek lingkaran
        lingkaran = new Lingkaran(jariLingkaran);

        // Hitung dan tampilkan hasil sesuai tugas
        switch (tugas) {
            case "luas":
                System.out.println("Luas lingkaran: " + lingkaran.hitungLuas());
                break;
            case "keliling":
                System.out.println("Keliling lingkaran: " + lingkaran.hitungKeliling());
                break;
            case "keduanya":
                System.out.println("Luas lingkaran: " + lingkaran.hitungLuas());
                System.out.println("Keliling lingkaran: " + lingkaran.hitungKeliling());
                break;
        }
    }

    public Lingkaran getLingkaran() {
        return lingkaran;
    }

    public double getJariLingkaran() {
        return jariLingkaran;
    }
}
