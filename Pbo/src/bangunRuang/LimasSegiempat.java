package bangunRuang;
import bangunDatar.Persegi;
import bangunDatar.Segitiga;


public class LimasSegiempat extends BangunRuang {
    private final Persegi alasLimas;
    private final Segitiga alas;
    private final Segitiga tinggi;
    private final double tinggiLimas;

    public LimasSegiempat(double sisi, double tinggiLimas, Segitiga tinggi, Segitiga alas) {
        this.alasLimas = new Persegi(sisi);
        this.tinggiLimas = tinggiLimas;
        this.tinggi = tinggi;
        this.alas = alas;
    }

    @Override
    public void hitungVolume() {
        double volume = (1.0 / 3.0) * alasLimas.getLuas() * tinggiLimas;
        System.out.println("Volume Limas Segiempat: " + volume);
    }

    @Override
    public void hitungLuasPermukaan() {
        double luasSisiTegak = 4 * (0.5 * alas.getAlas() * tinggi.getTinggi());
        double luasPermukaan = alasLimas.getLuas() + luasSisiTegak;
        System.out.println("Luas Permukaan Limas Segiempat: " + luasPermukaan);
    }
}
