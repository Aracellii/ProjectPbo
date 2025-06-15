package bangunDatar;

import java.util.Scanner;

public class Balok extends PersegiPanjang {
    protected double tinggi;
    protected double volume;
    protected double luasPermukaan;

    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        volume = super.luas * tinggi;
        return volume;
    }

    public double hitungLuasPermukaan() {
        double p = super.panjang;
        double l = super.lebar;
        double t = tinggi;
        luasPermukaan = 2 * (p * l + p * t + l * t);
        return luasPermukaan;
    }

    public double hitungVolume(double panjangBaru, double lebarBaru, double tinggiBaru) {
        volume = panjangBaru * lebarBaru * tinggiBaru;
        return volume;
    }

    public double hitungLuasPermukaan(double panjangBaru, double lebarBaru, double tinggiBaru) {
        luasPermukaan = 2 * ((panjangBaru * lebarBaru) + (panjangBaru * tinggiBaru) + (lebarBaru * tinggiBaru));
        return luasPermukaan;
    }
    
//Run
public static class BalokRun extends Thread {
    private final Scanner input;
    private final double sisiPersegi;
    private Balok balok;

    public BalokRun(Scanner input, double sisiPersegi) {
        this.input = input;
        this.sisiPersegi = sisiPersegi;
    }

    @Override
    public void run() {
        System.out.print("Gunakan sisi persegi sebelumnya untuk panjang dan lebar? (Y/N): ");
        String jawab = input.nextLine();

        if (jawab.equalsIgnoreCase("Y")) {
            double panjangBaru = sisiPersegi;
            double lebarBaru = sisiPersegi;
            double tinggiBaru = 0;

            while (true) {
                try {
                    System.out.print("Masukkan tinggi balok: ");
                    tinggiBaru = Double.parseDouble(input.nextLine());
                    if (tinggiBaru > 0) break;
                    else System.out.println("Tinggi harus > 0");
                } catch (NumberFormatException e) {
                    System.out.println("Masukkan angka valid!");
                }
            }

            balok = new Balok(panjangBaru, lebarBaru, tinggiBaru);
            System.out.println("Volume balok: " + balok.hitungVolume());
            System.out.println("Luas permukaan balok: " + balok.hitungLuasPermukaan());

        } else {
            double panjangBaru = 0, lebarBaru = 0, tinggiBaru = 0;

            while (true) {
                try {
                    System.out.print("Masukkan panjang: ");
                    panjangBaru = Double.parseDouble(input.nextLine());
                    System.out.print("Masukkan lebar: ");
                    lebarBaru = Double.parseDouble(input.nextLine());
                    System.out.print("Masukkan tinggi: ");
                    tinggiBaru = Double.parseDouble(input.nextLine());

                    if (panjangBaru > 0 && lebarBaru > 0 && tinggiBaru > 0) break;
                    else System.out.println("Semua sisi harus > 0");
                } catch (NumberFormatException e) {
                    System.out.println("Masukkan angka yang valid!");
                }
            }

            balok = new Balok(panjangBaru, lebarBaru, tinggiBaru);
            System.out.println("Volume balok: " + balok.hitungVolume(panjangBaru, lebarBaru, tinggiBaru));
            System.out.println("Luas permukaan balok: " + balok.hitungLuasPermukaan(panjangBaru, lebarBaru, tinggiBaru));
        }
    }
}
}