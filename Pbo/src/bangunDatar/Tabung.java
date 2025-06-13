package bangunDatar;

public class Tabung extends Lingkaran {
    private final double tinggi;
    private double volume;
    private double luasPermukaan;

    public Tabung(double jari, double tinggi) {
        super(jari);
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        volume = super.luas * tinggi;
        return volume;
    }

    public double hitungLuasPermukaan() {
        luas = 2 * super.luas + super.keliling * tinggi;
        return luasPermukaan;
    }
}