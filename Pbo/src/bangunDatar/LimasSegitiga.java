package bangunDatar;

public class LimasSegitiga extends Segitiga {
    private final double tinggiLimas;
    private double tinggiSisiTegakA, tinggiSisiTegakB, tinggiSisiTegakC;
    private double volume;
    private double luasPermukaan;

    public LimasSegitiga(double alas, double tinggi, double sisiA, double sisiB, double tinggiLimas) {
        super(alas, tinggi, sisiA, sisiB);
        this.tinggiLimas = tinggiLimas;
    }

    public double hitungVolume() {
        volume = (1.0 / 3.0) * super.luas * tinggiLimas;
        return volume;
    }

    public double hitungLuasPermukaan() {
        tinggiSisiTegakA = Math.sqrt(tinggiLimas * tinggiLimas + (super.sisiA/2.0) * (super.sisiA/2.0));
        tinggiSisiTegakB = Math.sqrt(tinggiLimas * tinggiLimas + (super.sisiB/2.0) * (super.sisiB/2.0));
        tinggiSisiTegakC = Math.sqrt(tinggiLimas * tinggiLimas + (super.alas/2.0) * (super.alas/2.0));  
        double luasSisiA = 0.5 * super.sisiA * tinggiSisiTegakA;
        double luasSisiB = 0.5 * super.sisiB * tinggiSisiTegakB;
        double luasSisiAlas = 0.5 * super.alas  * tinggiSisiTegakC;
        luasPermukaan = super.luas + luasSisiA + luasSisiB + luasSisiAlas;
        return luasPermukaan;
    }
}
