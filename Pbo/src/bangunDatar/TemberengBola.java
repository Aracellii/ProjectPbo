package bangunDatar;

public class TemberengBola extends Lingkaran {
    protected double tinggi;
    protected double volume;
    protected double luasPermukaan;

    public TemberengBola(double tinggi, double jari) {
        super(jari);
        this.tinggi = tinggi;
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();

    }
    
    public double hitungVolume() {
        volume = (Math.PI * tinggi * tinggi * (3 * jari - tinggi)) / 3;
        return volume;
    }

    public double hitungLuasPermukaan() {
        luasPermukaan = 2 * Math.PI * jari * tinggi;
        return luasPermukaan;
    }
}

