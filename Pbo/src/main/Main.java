package main;

import bangunDatar.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean jalan = true;

        while (jalan) {
            System.out.println("\n=== Menu Bangun Datar ===");
            System.out.println("1. Segitiga");
            System.out.println("2. Persegi");
            System.out.println("3. Persegi Panjang");
            System.out.println("4. Jajar Genjang");
            System.out.println("5. Layang-Layang");
            System.out.println("6. Trapesium");
            System.out.println("7. Belah-Ketupat");
            System.out.println("8. Lingkaran");
            System.out.println("9. Bola");
            System.out.println("10. Kerucut");
            System.out.println("11. Kerucut Terpancung");
            System.out.println("12. Prisma Segitiga");
            System.out.println("13. Limas Segitiga");
            System.out.println("14. Prisma Persegi(Kubus)");
            System.out.println("15. Limas Persegi Panjang");
            System.out.println("16. Prisma Persegi Panjang(Balok)");
            System.out.println("17. Limas Jajar Genjang");
            System.out.println("18. Prisma Jajar Genjang");
            System.out.println("19. Limas Layang-Layang");
            System.out.println("20. Prisma Layang-Layang");
            System.out.println("21. Limas Trapesium");
            System.out.println("22. Prisma trapesium");
            System.out.println("23. Limas Belah-Ketupat");
            System.out.println("24. Prisma Belah-Ketupat");
            System.out.println("25. Juring Lingkaran");
            System.out.println("26. Tembereng Lingkaran");
            System.out.println("27. Juring Bola");
            System.out.println("28. Tembereng Bola");
            System.out.println("29. Cincin Bola");
            System.out.println("30. Tabung");
            System.out.println("31. Limas Persegi Panjang");
            



            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            int pilihan = input.nextInt();

            Thread thread;

            switch (pilihan) { 
            case 1 -> thread = new Thread(new Segitiga.SegitigaRunnable());
            case 2 -> thread = new Thread(new Persegi.PersegiRunnable());
            case 3 -> thread = new Thread(new PersegiPanjang.PersegiPanjangRunnable());
            case 4 -> thread = new Thread(new JajarGenjang.JajarGenjangRunnable());
            case 5 -> thread = new Thread(new LayangLayang.LayangLayangRunnable());
            case 6 -> thread = new Thread(new Trapesium.TrapesiumRunnable());
            case 7 -> thread = new Thread(new BelahKetupat.BelahKetupatRunnable());
            case 8 -> thread = new Thread(new Lingkaran.LingkaranRunnable());
            case 9 -> thread = new Thread(new Bola.BolaRunnable());
            case 10 -> thread = new Thread(new Kerucut.KerucutRunnable());
            case 11 -> thread = new Thread(new KerucutTerpancung.KerucutTerpancungRunnable());
            case 12 -> thread = new Thread(new PrismaSegiTiga.PrismaSegiTigaRunnable());
            case 13 -> thread = new Thread(new LimasSegitiga.LimasSegitigaRunnable());
            case 14 -> thread = new Thread(new PrismaSegiEmpat.PrismaSegiEmpatRunnable());
            case 15 -> thread = new Thread(new LimasPersegiPanjang.LimasPersegiPanjangRunnable());
            case 16 -> thread = new Thread(new Kubus.KubusRunnable());
            case 17 -> thread = new Thread(new LimasJajarGenjang.LimasJajarGenjangRunnable());
            case 18 -> thread = new Thread(new PrismaJajarGenjang.PrismaJajarGenjangRunnable());
            case 19 -> thread = new Thread(new LimasLayangLayang.LimasLayangLayangRunnable());
            case 20 -> thread = new Thread(new PrismaLayangLayang.PrismaLayangLayangRunnable());
            case 21 -> thread = new Thread(new LimasTrapesium.LimasTrapesiumRunnable());
            case 22 -> thread = new Thread(new PrismaTrapesium.PrismaTrapesiumRunnable());
            case 23 -> thread = new Thread(new LimasBelahKetupat.LimasBelahKetupatRunnable());
            case 24 -> thread = new Thread(new PrismaBelahKetupat.PrismaBelahKetupatRunnable());
            case 25 -> thread = new Thread(new JuringLingkaran.JuringLingkaranRunnable());
            case 26 -> thread = new Thread(new TemberengLingkaran.TemberengLingkaranRunnable());
            case 27 -> thread = new Thread(new JuringBola.JuringBolaRunnable());
            case 28 -> thread = new Thread(new TemberengBola.TemberengBolaRunnable());
            case 29 -> thread = new Thread(new CincinBola.CincinBolaRunnable());
            case 30 -> thread = new Thread(new Tabung.TabungRunnable());
            case 31 -> thread = new Thread(new LimasPersegiPanjang.LimasPersegiPanjangRunnable()); // tambahan dari sebelumnya

                case 0 -> {
                    jalan = false;
                    System.out.println("Terima kasih! Program selesai.");
                    continue; // lanjut ke iterasi berikutnya, agar tidak jalan `thread.start()`
                }
                default -> {
                    System.out.println("Pilihan tidak valid.");
                    continue;
                }
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
