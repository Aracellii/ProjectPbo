package main;

import bangunDatar.*;
import javax.swing.*;
import java.awt.*;

public class MainGUI extends JFrame {
    public MainGUI() {
        setTitle("Menu Bangun Datar dan Ruang");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        String[] labels = {
            "Segitiga", "Persegi", "Persegi Panjang", "Jajar Genjang", "Layang-Layang", "Trapesium",
            "Belah-Ketupat", "Lingkaran", "Bola", "Kerucut", "Kerucut Terpancung", "Prisma Segitiga",
            "Limas Segitiga", "Prisma Persegi (Kubus)", "Limas Persegi Panjang", "Prisma Persegi Panjang (Balok)",
            "Limas Jajar Genjang", "Prisma Jajar Genjang", "Limas Layang-Layang", "Prisma Layang-Layang",
            "Limas Trapesium", "Prisma Trapesium", "Limas Belah-Ketupat", "Prisma Belah-Ketupat",
            "Juring Lingkaran", "Tembereng Lingkaran", "Juring Bola", "Tembereng Bola", "Cincin Bola", "Tabung"
        };

        Runnable[] runnables = {
            new Segitiga.SegitigaRunnable(),
            new Persegi.PersegiRunnable(),
            new PersegiPanjang.PersegiPanjangRunnable(),
            new JajarGenjang.JajarGenjangRunnable(),
            new LayangLayang.LayangLayangRunnable(),
            new Trapesium.TrapesiumRunnable(),
            new BelahKetupat.BelahKetupatRunnable(),
            new Lingkaran.LingkaranRunnable(),
            new Bola.BolaRunnable(),
            new Kerucut.KerucutRunnable(),
            new KerucutTerpancung.KerucutTerpancungRunnable(),
            new PrismaSegiTiga.PrismaSegiTigaRunnable(),
            new LimasSegitiga.LimasSegitigaRunnable(),
            new PrismaSegiEmpat.PrismaSegiEmpatRunnable(),
            new LimasPersegiPanjang.LimasPersegiPanjangRunnable(),
            new Kubus.KubusRunnable(),
            new LimasJajarGenjang.LimasJajarGenjangRunnable(),
            new PrismaJajarGenjang.PrismaJajarGenjangRunnable(),
            new LimasLayangLayang.LimasLayangLayangRunnable(),
            new PrismaLayangLayang.PrismaLayangLayangRunnable(),
            new LimasTrapesium.LimasTrapesiumRunnable(),
            new PrismaTrapesium.PrismaTrapesiumRunnable(),
            new LimasBelahKetupat.LimasBelahKetupatRunnable(),
            new PrismaBelahKetupat.PrismaBelahKetupatRunnable(),
            new JuringLingkaran.JuringLingkaranRunnable(),
            new TemberengLingkaran.TemberengLingkaranRunnable(),
            new JuringBola.JuringBolaRunnable(),
            new TemberengBola.TemberengBolaRunnable(),
            new CincinBola.CincinBolaRunnable(),
            new Tabung.TabungRunnable()
        };

        // Dropdown
        JComboBox<String> comboBox = new JComboBox<>(labels);
        add(comboBox, BorderLayout.CENTER);

        // Panel tombol
        JPanel panelButton = new JPanel();
        JButton runButton = new JButton("Jalankan");
        JButton exitButton = new JButton("Keluar");

        panelButton.add(runButton);
        panelButton.add(exitButton);
        add(panelButton, BorderLayout.SOUTH);

        // Aksi Jalankan
        runButton.addActionListener(e -> {
            int index = comboBox.getSelectedIndex();
            Runnable selectedRunnable = runnables[index];
            Thread thread = new Thread(selectedRunnable);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });

        // Aksi keluar
        exitButton.addActionListener(e -> System.exit(0));
    }
}
