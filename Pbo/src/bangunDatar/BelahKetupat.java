package bangunDatar;

public class BelahKetupat extends BangunDatar {
    protected double diagonalA;
    protected double diagonalB;
    protected double sisi;
    protected double keliling;
    protected double luas;

    public BelahKetupat(double diagonalA, double diagonalB, double sisi) {

        this.diagonalA = diagonalA;
        this.diagonalB = diagonalB;
        this.sisi = sisi;
        this.keliling = hitungKeliling();
        this.luas = hitungLuas();
    }

    @Override
    public double hitungLuas() {
        luas = diagonalA * diagonalB / 2;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = sisi * 4;
        return keliling;
    }

    public void prosesInputDanValidasi() {
        java.util.Scanner inp = new java.util.Scanner(System.in);
        while (true) {
            System.out.print("\nApakah ingin mengubah nilai diagonal A, diagonal B, dan sisi belah ketupat? (Y/N): ");
            String jawab = inp.nextLine();

            if (jawab.equalsIgnoreCase("Y")) {
                while (true) {
                    try {
                        System.out.print("Masukkan diagonal A baru: ");
                        this.diagonalA = inp.nextDouble();
                        System.out.print("Masukkan diagonal B baru: ");
                        this.diagonalB = inp.nextDouble();
                        System.out.print("Masukkan sisi baru: ");
                        this.sisi = inp.nextDouble();
                        inp.nextLine(); // Buang newline

                        if (this.diagonalA <= 0 || this.diagonalB <= 0 || this.sisi <= 0) {
                            System.out.println("Nilai harus lebih dari nol.\n");
                            continue;
                        }

                        // Hitung dan tampilkan
                        System.out.printf("\nLuas Belah Ketupat: %.2f\n", hitungLuas());
                        System.out.printf("Keliling Belah Ketupat: %.2f\n", hitungKeliling());
                        break;

                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Input tidak valid. Silakan masukkan angka yang benar.");
                        inp.nextLine(); // Clear invalid input
                    }
                }
            } else if (jawab.equalsIgnoreCase("N")) {
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan masukkan Y atau N.");
            }
        }
    }
}
