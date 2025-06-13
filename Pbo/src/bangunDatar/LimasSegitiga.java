package bangunDatar;

public class LimasSegitiga extends Segitiga {
    private final double tinggiLimas;
    private final double tinggiSisiTegakA, tinggiSisiTegakB, tinggiSisiTegakC;
    private double volume;
    private double luasPermukaan;

    public LimasSegitiga(double alas, double tinggi, double sisiA, double sisiB, double tinggiLimas, double tinggiSisiTegakA, double tinggiSisiTegakB, double tinggiSisiTegakC) {
        super(alas, tinggi, sisiA, sisiB);
        this.tinggiLimas = tinggiLimas;
        this.tinggiSisiTegakA = tinggiSisiTegakA;
        this.tinggiSisiTegakB = tinggiSisiTegakB;
        this.tinggiSisiTegakC = tinggiSisiTegakC;
    }

    public double hitungVolume() {
        volume = (1.0 / 3.0) * super.luas * tinggiLimas;
        return volume;
    }

    public double hitungLuasPermukaan() {
        double luasSisiA = 0.5 * super.sisiA * tinggiSisiTegakA;
        double luasSisiB = 0.5 * super.sisiB * tinggiSisiTegakB;
        double luasSisiAlas = 0.5 * super.alas  * tinggiSisiTegakC;
        luasPermukaan = super.luas + luasSisiA + luasSisiB + luasSisiAlas;
        return luasPermukaan;
    }
}
