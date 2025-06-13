package bangunDatar;


public class LimasSegiempat extends Persegi {
    private double tinggiLimas;
    private double sisi;
    private double volume;
    private double luasPermukaan;
    private double luasSisiTegak;

    public LimasSegiempat(double sisi, double tinggiLimas) {
        super(sisi);
        this.tinggiLimas = tinggiLimas;
    }

    public double hitungVolume() {
        volume = (1.0 / 3.0) * super.luas * tinggiLimas;
        return volume;
    }

    public double hitungLuasPermukaan() {
        luasSisiTegak = 4 * (0.5 * super.sisi * tinggiLimas);
        luasPermukaan = super.luas + luasSisiTegak;
        return luasPermukaan;
    }
}
