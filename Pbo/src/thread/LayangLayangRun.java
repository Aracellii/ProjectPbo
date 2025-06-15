    package thread;

    import bangunDatar.*;
    import java.util.Scanner;

    public class LayangLayangRun extends Thread {
        private final Scanner input;
        private double diagonalA, diagonalB, sisiPendek, sisiPanjang;
        private LayangLayang layang;

        public LayangLayangRun(Scanner input) {
            this.input = input;
        }

        @Override
        public void run() {
            System.out.println("=== Hitung Layang-Layang ===");

            // Input diagonal A
            diagonalA = inputDouble("Masukkan panjang diagonal A: ");

            // Input diagonal B
            diagonalB = inputDouble("Masukkan panjang diagonal B: ");

            // Input sisi pendek
            sisiPendek = inputDouble("Masukkan panjang sisi pendek: ");

            // Input sisi panjang
            sisiPanjang = inputDouble("Masukkan panjang sisi panjang: ");

            // Pilih operasi
            String tugas;
            while (true) {
                System.out.print("Hitung apa? (luas/keliling/keduanya): ");
                tugas = input.nextLine().trim().toLowerCase();

                if (tugas.equals("luas") || tugas.equals("keliling") || tugas.equals("keduanya")) {
                    break;
                } else {
                    System.out.println("Input tidak valid. Gunakan: luas, keliling, atau keduanya.");
                }
            }

            // Buat objek dan proses
            layang = new LayangLayang(diagonalA, diagonalB, sisiPendek, sisiPanjang);

            switch (tugas) {
                case "luas":
                    layang.hitungLuas();
                    break;
                case "keliling":
                    layang.hitungKeliling();
                    break;
                case "keduanya":
                    layang.hitungLuas();
                    layang.hitungKeliling();
                    break;
            }
        }

        // Method untuk input angka valid
        private double inputDouble(String prompt) {
            while (true) {
                System.out.print(prompt);
                try {
                    return Double.parseDouble(input.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Input tidak valid, masukkan angka.");
                }
            }
        }

        public LayangLayang getLayangLayang() {
            return layang;
        }
    }
