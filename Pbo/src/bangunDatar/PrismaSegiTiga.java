package bangunDatar;

public class PrismaSegiTiga extends Segitiga {
    private final double tinggiPrisma;
    private double volume;
    private double luasPermukaan;

    public PrismaSegiTiga(double alas, double tinggi, double sisiA, double sisiB, double tinggiPrisma) {
        super(alas, tinggi, sisiA, sisiB);
        this.tinggiPrisma = tinggiPrisma;   
    }

    public double hitungVolume() {
        volume = super.alas * tinggiPrisma;
        return volume;
    }

    public double hitungLuasPermukaan() {
        luasPermukaan = 2 * super.alas + super.keliling * tinggiPrisma;
        return luasPermukaan;
    }
    
}