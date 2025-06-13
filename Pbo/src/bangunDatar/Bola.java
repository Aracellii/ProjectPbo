package bangunDatar;

public class Bola extends Lingkaran {
    protected double volume;
    protected double luasPermukaan;

    public Bola(double jari) {
        super(jari);
        this.volume = hitungVolume();
        this.luasPermukaan= hitungLuasPermukaan();
    }

    public double hitungVolume() {
        volume = (4.0 / 3.0) * super.luas*super.jari;
        return volume;

    }   

    public double hitungLuasPermukaan() {
        luasPermukaan = 4 * super.luas;
        return luasPermukaan;
    }

    public double hitungVolume(double jariBaru) {
        volume = (4.0 / 3.0) * Math.PI * Math.pow(jariBaru, 3);
        return volume;
    }

    public double hitungLuasPermukaan(double jariBaru){
    luasPermukaan = 4 * Math.PI * Math.pow(jariBaru, 2);
        return luasPermukaan;
    }
        
}
