package bangunDatar;

public class Kerucut extends Lingkaran {
    protected double tinggi;
    protected double volume;
    protected double luasPermukaan;
    
    public Kerucut(double jari, double tinggi) {
        super(jari);
        this.tinggi = tinggi;
        this.luasPermukaan = hitungLuasPermukaan();
        this.volume = hitungVolume();
    }

    public double hitungVolume() { //jika jari tidak ganti baru
        volume = 1/3 * super.luas * tinggi;
        return volume;
    }

    public double hitungLuasPermukaan() { //jika jari tidak ganti baru
        luasPermukaan = Math.PI * (jari + (Math.sqrt(jari * jari + tinggi * tinggi)));
        return luasPermukaan;
    }
    
    public double hitungVolume(double jariBaru) { //jika jari ganti baru
        volume = 1/3 * Math.PI * jariBaru * jariBaru * tinggi;
        return volume;
    }
    
    public double hitungLuasPermukaan(double jariBaru) { //jika jari ganti baru
        luasPermukaan = Math.PI * (jariBaru + (Math.sqrt(jariBaru * jariBaru + tinggi * tinggi)));
        return luasPermukaan;
    }
}