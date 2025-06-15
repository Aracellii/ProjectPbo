/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



package bangunDatar;

public class LimasBelahKetupat extends BelahKetupat {
    private double tinggiLimas;
    private double tinggiSegitigaTegak;

    public LimasBelahKetupat(double diagonalA, double diagonalB, double sisi,
                             double tinggiLimas, double tinggiSegitigaTegak) {
        super(diagonalA, diagonalB, sisi);
        this.tinggiLimas = tinggiLimas;
        this.tinggiSegitigaTegak = tinggiSegitigaTegak;
    }

    /**
     * Volume limas = 1/3 × luas alas × tinggi limas
     */
    public double hitungVolume() {
        return (1.0 / 3.0) * super.hitungLuas() * tinggiLimas;
    }

    /**
     * Luas permukaan limas = luas alas + luas 4 segitiga selubung
     * (setiap segitiga: 1/2 × sisi × tinggi segitiga)
     */
    public double hitungLuasPermukaan() {
        double luasSelubung = 4 * (0.5 * sisi * tinggiSegitigaTegak);
        return super.hitungLuas() + luasSelubung;
    }
}
