package bangunDatar;

public class CincinBola extends Lingkaran {
    protected double tinggi;
    protected double luasPermukaan;
    protected double volume;

    public CincinBola(double jari, double tinggi) {
        super(jari);
        this.tinggi = tinggi;
        this.luasPermukaan = hitungLuasPermukaan();
        this.volume = hitungVolume();
    }

    public double hitungLuasPermukaan() {
        luasPermukaan = 2 * Math.PI * jari * tinggi;
        return luasPermukaan;
    }

    public double hitungVolume() {
        volume = (Math.PI * tinggi * tinggi * (3 * jari - tinggi)) / 3;
        return volume;
    }
}

