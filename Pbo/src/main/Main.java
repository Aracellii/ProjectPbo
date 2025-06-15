package main;
import bangunDatar.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Jalankan thread untuk Persegi
        Persegi.PersegiRun persegiThread = new Persegi.PersegiRun(input);
        persegiThread.start();
        try {
            persegiThread.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        
        // Ambil sisi persegi hasil dari thread Persegi
        double sisiPersegi = persegiThread.getSisiPersegi();

        // Jalankan thread untuk Balok, gunakan sisi persegi dari thread Persegi sebagai parameter
        Balok.BalokRun balokThread = new Balok.BalokRun(input, sisiPersegi);
        balokThread.start();
        try {
            balokThread.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program selesai.");
        input.close();
    }
}
