package thread;
import bangunDatar.Lingkaran;
import java.util.Scanner;

public class LingkaranRun implements Runnable {
    private Scanner input;
    private double jariLingkaran = 0;
    private Lingkaran lingkaran; // simpan objek Lingkaran di sini

    public LingkaranRun(Scanner input) {
        this.input = input;
    }

    @Override
    public void run() {
        System.out.print("Masukkan jari-jari lingkaran: ");
        jariLingkaran = input.nextDouble();
        input.nextLine();

        System.out.print("Hitung apa? (luas/keliling/keduanya): ");
        String tugas = input.nextLine().toLowerCase();

        // Objek disimpan ke field, bukan hanya lokal
        lingkaran = new Lingkaran(jariLingkaran);

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
            default:
                System.out.println("Tugas tidak dikenali.");
        }
    }

    // Getter agar bisa akses objek Lingkaran dari luar
    public Lingkaran getLingkaran() {
        return lingkaran;
    }

    public double getJariLingkaran() {
        return jariLingkaran;
    }
}
