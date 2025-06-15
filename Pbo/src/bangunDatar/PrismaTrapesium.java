package bangunDatar;

public class PrismaTrapesium extends Trapesium {
    private double tinggiPrisma;
    private double volume;
    private double luasPermukaan;

    public PrismaTrapesium(double sisiAtas, double sisiBawah, double sisiMiring, double tinggiTrapesium, double tinggiPrisma) {
        super(sisiAtas, sisiBawah, sisiMiring, tinggiTrapesium);
        this.tinggiPrisma = tinggiPrisma;
    }

    public double hitungVolume() {
        volume = super.luas * tinggiPrisma;
        return volume;
    }

    public double hitungLuasPermukaan() {
        luasPermukaan = 2 * super.luas + super.keliling * tinggiPrisma;
        return luasPermukaan;
    }
}