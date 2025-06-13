package bangunDatar;

public class Tabung extends Lingkaran {
    private double tinggi;
    private double volume;
    private double luasPermukaan;

    public Tabung(double jari, double tinggi) {
        super(jari);
        this.tinggi = tinggi;
        this.hitungVolume();
        this.hitungLuasPermukaan();
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