package thread;
import bangunDatar.Lingkaran;
import java.util.Scanner;

public class LingkaranRun implements Runnable {
    private Scanner input;
    private double jariLingkaran = 0;

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

        Lingkaran lingkaran = new Lingkaran(jariLingkaran);

        switch (tugas) {
            case "luas":
                System.out.println("Luas lingkaran dengan jari-jari " + jariLingkaran + ": " + lingkaran.hitungLuas());
                break;
            case "keliling":
                System.out.println("Keliling lingkaran dengan jari-jari " + jariLingkaran + ": " + lingkaran.hitungKeliling());
                break;
            case "keduanya":
                System.out.println("Luas lingkaran dengan jari-jari " + jariLingkaran + ": " + lingkaran.hitungLuas());
                System.out.println("Keliling lingkaran dengan jari-jari " + jariLingkaran + ": " + lingkaran.hitungKeliling());
                break;
            default:
                System.out.println("Tugas tidak dikenali.");
        }
    }

    public double getJariLingkaran() {
        return jariLingkaran;
    }
}
