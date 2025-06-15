package main;

import bangunDatar.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean jalan = true;

        while (jalan) {
            System.out.println("\n=== Menu Bangun Datar ===");
            System.out.println("1. Persegi");
            System.out.println("2. Lingkaran");
            System.out.println("3. Segitiga");
            System.out.println("4. Jajar Genjang");
            System.out.println("5. Persegi Panjang");
            System.out.println("6. Trapesium");
            System.out.println("7. Layang-Layang");
            System.out.println("8. Belah Ketupat");
            System.out.println("9. Bola");
            System.out.println("10. Kerucut");



            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            int pilihan = input.nextInt();

            Thread thread;

            switch (pilihan) {
                case 1:
                    thread = new Thread(new Persegi.PersegiRunnable());
                    break;
                case 2:
                    thread = new Thread(new Lingkaran.LingkaranRunnable());
                    break;
                case 3:
                     thread = new Thread(new Segitiga.SegitigaRunnable());
                     break;
                case 4:
                     thread = new Thread(new JajarGenjang.JajarGenjangRunnable());
                     break;
                case 5:
                    thread = new Thread(new PersegiPanjang.PersegiPanjangRunnable());
                    break;
                case 6:
                    thread = new Thread(new Trapesium.TrapesiumRunnable());
                    break;
                case 7:
                    thread = new Thread(new LayangLayang.LayangLayangRunnable());
                    break;
                case 8:
                    thread = new Thread(new BelahKetupat.BelahKetupatRunnable());
                    break;
                case 9:
                    thread = new Thread(new Bola.BolaRunnable());
                    break;
                 case 10:
                    thread = new Thread(new Kerucut.KerucutRunnable());
                    break;
                case 0:
                    jalan = false;
                    System.out.println("Terima kasih! Program selesai.");
                    continue; // lanjut ke iterasi berikutnya, agar tidak jalan `thread.start()`
                default:
                    System.out.println("Pilihan tidak valid.");
                    continue;
            }

            thread.start();

            try {
                thread.join(); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        input.close();
    }
}
