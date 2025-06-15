package main;

import thread.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LingkaranRun lingkaranRun = new LingkaranRun(scanner);
        Thread lingkaranThread = new Thread(lingkaranRun);
        lingkaranThread.start();
        try {
            lingkaranThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        double jariBola = lingkaranRun.getJariLingkaran();

        BolaRun bolaRun = new BolaRun(scanner, jariBola);
        Thread bolaThread = new Thread(bolaRun);
        bolaThread.start();
        try {
            bolaThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        PersegiRun persegiRun = new PersegiRun(scanner);
        Thread persegiThread = new Thread(persegiRun);
        persegiThread.start();
        try {
            persegiThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}
