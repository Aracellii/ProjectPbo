    package bangunDatar;

    import bangun.Bangun;
    import java.util.Scanner;

    public class Persegi extends BangunDatar implements Bangun {
        protected double sisi;
        protected double luas;
        protected double keliling;

        public Persegi(double sisi) {
            this.sisi = sisi;
        }

        @Override
        public double hitungLuas() {
            luas = sisi * sisi;
            return luas;
        }

        @Override
        public double hitungKeliling() {
            keliling = 4 * sisi;
            return keliling;
        }

        // Inner class: PersegiRun
        public static class PersegiRun extends Thread {
            private Scanner input;
            private double sisi = 0;
            private Persegi persegi;

            public PersegiRun(Scanner input) {
                this.input = input;
            }

            @Override
            public void run() {
                // Validasi input sisi
                while (true) {
                    System.out.print("Masukkan panjang sisi persegi (angka > 0): ");
                    String line = input.nextLine();

                    try {
                        double nilai = Double.parseDouble(line);
                        if (nilai > 0) {
                            sisi = nilai;
                            break;
                        } else {
                            System.out.println("Sisi harus lebih dari 0.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Input tidak valid, masukkan angka.");
                    }
                }

                // Input tugas
                String tugas;
                while (true) {
                    System.out.print("Hitung apa? (luas/keliling/keduanya): ");
                    tugas = input.nextLine().toLowerCase();

                    if (tugas.equals("luas") || tugas.equals("keliling") || tugas.equals("keduanya")) {
                        break;
                    } else {
                        System.out.println("Input tidak valid. Gunakan: luas, keliling, atau keduanya.");
                    }
                }

                persegi = new Persegi(sisi);

                switch (tugas) {
                    case "luas":
                        System.out.println("Luas persegi dengan sisi " + sisi + ": " + persegi.hitungLuas());
                        break;
                    case "keliling":
                        System.out.println("Keliling persegi dengan sisi " + sisi + ": " + persegi.hitungKeliling());
                        break;
                    case "keduanya":
                        System.out.println("Luas persegi dengan sisi " + sisi + ": " + persegi.hitungLuas());
                        System.out.println("Keliling persegi dengan sisi " + sisi + ": " + persegi.hitungKeliling());
                        break;
                }
            }

            public Persegi getPersegi() {
                return persegi;
            }

            public double getSisiPersegi() {
                return sisi;
            }
        }
    }
