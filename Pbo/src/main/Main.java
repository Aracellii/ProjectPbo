package main;

import thread.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        double jariBola = 0; // untuk menyimpan jari-jari dari lingkaran, jika diperlukan

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Hitung Lingkaran");
            System.out.println("2. Hitung Bola");
            System.out.println("3. Hitung Persegi");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    LingkaranRun lingkaranRun = new LingkaranRun(scanner);
                    Thread lingkaranThread = new Thread(lingkaranRun);
                    lingkaranThread.start();
                    try {
                        lingkaranThread.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    jariBola = lingkaranRun.getJariLingkaran(); // Simpan untuk bola
                    break;

                case 2:
                        BolaRun bolaRun = new BolaRun(scanner, jariBola);
                        Thread bolaThread = new Thread(bolaRun);
                        bolaThread.start();
                        try {
                            bolaThread.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    
                    break;

                case 3:
                    PersegiRun persegiRun = new PersegiRun(scanner);
                    Thread persegiThread = new Thread(persegiRun);
                    persegiThread.start();
                    try {
                        persegiThread.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;

                case 0:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

        } while (pilihan != 0);

        scanner.close();
    }
}
