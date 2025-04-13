package bangunRuang;

import bangunDatar.Segitiga;

public class LimasSegitiga extends BangunRuang {
    private final Segitiga alas;
    private final double tinggiLimas;       // Tinggi limas
    private final double tinggiSisi;   // Tinggi sisi tegak segitiga

    public LimasSegitiga(double alas, double tinggi, double tinggiLimas, double tinggiSisi) {
        this.alas = new Segitiga(alas, tinggi);
        this.tinggiLimas = tinggiLimas;
        this.tinggiSisi = tinggiSisi;
    }

    @Override
    public void hitungVolume() {
        double volume = (1.0 / 3.0) * alas.getLuas() * tinggiLimas;
        System.out.println("Volume Limas Segitiga: " + volume);
    }

    @Override
    public void hitungLuasPermukaan() {
        double luasAlas = alas.getLuas();
        double luasSisiTegak = 3 * (0.5 * alas.getAlas() * tinggiSisi);
        double luasPermukaan = luasAlas + luasSisiTegak;
        System.out.println("Luas Permukaan Limas Segitiga: " + luasPermukaan);
    }
}
