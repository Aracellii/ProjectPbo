package bangunDatar;

public class LimasPersegiPanjang extends PersegiPanjang {
    private double tinggiLimas;
    private double volume;
    private double luasPermukaan;
    private double sisiTegakPanjang, sisiTegakLebar;
    
    public LimasPersegiPanjang(double panjang, double lebar, double tinggiLimas) {
        super(panjang, lebar);
        this.tinggiLimas = tinggiLimas;
    }
    
    public double hitungVolume() {
        volume = 1.0/3.0 * super.luas * tinggiLimas;
        return volume;
    }
    
    public double hitungLuasPermukaan() {
        sisiTegakPanjang = Math.sqrt(tinggiLimas * tinggiLimas + (super.panjang/2.0) * (super.panjang/2.0));
        sisiTegakLebar = Math.sqrt(tinggiLimas * tinggiLimas + (super.lebar/2.0) * (super.lebar/2.0));
        luasPermukaan = super.luas + (super.panjang * sisiTegakPanjang) + (super.lebar * sisiTegakLebar);
        return luasPermukaan;
    }
}
