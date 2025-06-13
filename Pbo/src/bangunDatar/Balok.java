package bangunDatar;

public class Balok extends PersegiPanjang {
    protected double tinggi;
    protected double volume;
    protected double luasPermukaan;

    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();
    }

    public double hitungVolume() {//digunakan jika luas tidak diganti
        volume = super.luas * tinggi;
        return volume;
    }

    public double hitungLuasPermukaan() { //digunakan jika panjang dan lebar tidak diganti
        double p = super.panjang;
        double l = super.lebar;
        double t = tinggi;
        luasPermukaan = 2 * (p * l + p * t + l * t);
        return luasPermukaan;
    }
    
    public double hitungVolume(double panjangBaru, double lebarBaru, double tinggiBaru){ //jika input panjang dan lebar baru
        volume = panjangBaru * lebarBaru * tinggiBaru;
        return volume;
    }
    
     public double hitungLuasPermukaan(double panjangBaru, double lebarBaru, double tinggiBaru) { //jika input panjang dan lebar baru
        luasPermukaan = 2 * ((panjangBaru * lebarBaru) + (panjangBaru * tinggiBaru) + (lebarBaru * tinggiBaru));
        return luasPermukaan;
    }
}
