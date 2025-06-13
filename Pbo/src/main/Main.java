package main;

import bangunDatar.Tabung;
import bangunDatar.TemberengBola;
import bangunDatar.LimasSegitiga;
import bangunDatar.JuringBola;
import bangunDatar.Bola;
import bangunDatar.LimasSegiempat;
import bangunDatar.Balok;
import bangunDatar.Kubus;
import bangunDatar.Kerucut;
import bangunDatar.KerucutTerpancung;
import bangunDatar.PrismaSegiTiga;
import bangunDatar.*;

public class Main {
    public static void main(String[] args) {
        
        
        //Belah Ketupat
        BelahKetupat bk = new BelahKetupat(5, 6, 4);

        System.out.printf("Luas Awal: %.2f\n", bk.hitungLuas());
        System.out.printf("Keliling Awal: %.2f\n", bk.hitungKeliling());

        // Proses input dan validasi
        bk.prosesInputDanValidasi();
    
//        // Polymorphism - Lingkaran
//        BangunDatar lingkaran = new Lingkaran(7);
//        lingkaran.hitungLuas();
//        lingkaran.hitungKeliling();
//
//        System.out.println("");
//
//        // Polymorphism - Persegi
//        BangunDatar persegi = new Persegi(3);
//        persegi.hitungLuas();
//        persegi.hitungKeliling();
//
//        System.out.println("");
//
//        // Polymorphism - Persegi Panjang
//        BangunDatar persegiPanjang = new PersegiPanjang(3,7);
//        persegiPanjang.hitungLuas();
//        persegiPanjang.hitungKeliling();
//
//        System.out.println("");
//
//        // Polymorphism - Segitiga
//        BangunDatar segitiga = new Segitiga(3,4,5,6);
//        segitiga.hitungLuas();
//        segitiga.hitungKeliling();
//
//        System.out.println("");
//
//        // Polymorphism - Layang - Layang
//        BangunDatar layangLayang = new LayangLayang(3,4,5,6);
//        layangLayang.hitungLuas();
//        layangLayang.hitungKeliling();
//
//        System.out.println("");
//
//        //Inisiasi Kubus
//        Kubus kubus = new Kubus(5);
//        kubus.hitungVolume();
//        kubus.hitungLuasPermukaan();
//
//        System.out.println("");
//
//        //Inisisasi Balok
//        Balok balok = new Balok(4,6,8);
//        balok.hitungVolume();
//        balok.hitungLuasPermukaan();
//
//        System.out.println("");
//
//        //inisiasi Bola
//        Bola bola = new Bola(7);
//        bola.hitungVolume();
//        bola.hitungLuasPermukaan();
//
//        System.out.println("");
//
//        //Insiasi Tabung
//        Tabung tabung = new Tabung(7, 10);
//        tabung.hitungVolume();
//        tabung.hitungLuasPermukaan();
//
//        System.out.println("");
//
//        //Inisiasi Kerucut
//        Kerucut kerucut = new Kerucut(7, 10,13);
//        kerucut.hitungVolume();
//        kerucut.hitungLuasPermukaan();
//
//        System.out.println("");
//
//        //Inisiasi JuringBola
//        JuringBola juringBola = new JuringBola(7,180);
//        juringBola.hitungVolume();
//        juringBola.hitungLuasPermukaan();
//
//        System.out.println("");
//
//        // Inisiasi LimasSegitiga
//        LimasSegitiga limasSegitiga = new LimasSegitiga(5,10,6,4);
//        limasSegitiga.hitungVolume();
//        limasSegitiga.hitungLuasPermukaan();
//
//        System.out.println("");
//
//        // Inisiasi PrismaSegiTiga
//        PrismaSegiTiga prismaSegiTiga = new PrismaSegiTiga(5,6,5,5,10);
//        prismaSegiTiga.hitungVolume();
//        prismaSegiTiga.hitungLuasPermukaan();
//
//        System.out.println("");
//
//        // Inisiasi LimasSegiempat dengan sisi segitiga
////        Segitiga sisiLimas = new Segitiga(3,5);
////        LimasSegiempat limasSegiempat = new LimasSegiempat(6,4,sisiLimas,sisiLimas);
////        limasSegiempat.hitungVolume();
////        limasSegiempat.hitungLuasPermukaan();
////
////        System.out.println("");
//
//        // Inisiasi KerucutTerpancung
//        KerucutTerpancung kerucutTerpancung = new KerucutTerpancung (6,3,2,1);
//        kerucutTerpancung.hitungVolume();
//        kerucutTerpancung.hitungLuasPermukaan();
//
//        System.out.println("");
//
//        // Inisiasi TemberengBola 
//        TemberengBola temberengBola = new TemberengBola(7, 3);
//        temberengBola.hitungVolume();
//        temberengBola.hitungLuasPermukaan();
//
//        System.out.println("");
    }
}
