package bangunDatar;

public class LimasLayangLayang extends LayangLayang {
    private double tinggiLimas;
    private double volume;
    private double luasPermukaan;
    private double sisiTegakPendek, sisiTegakPanjang;

    public LimasLayangLayang(double diagonalA, double diagonalB, double sisiPendek, double sisiPanjang, double tinggiLimas) {
        super(diagonalA, diagonalB, sisiPendek, sisiPanjang);
        this.tinggiLimas = tinggiLimas;
    }

    public double hitungVolume() {
        volume = (1.0 / 3.0) * super.luas * tinggiLimas;
        return volume;
    }

    public double hitungLuasPermukaan() {
        sisiTegakPendek = Math.sqrt((tinggiLimas * tinggiLimas)  + (super.sisiPendek/2.0) * (super.sisiPendek/2.0));
        sisiTegakPanjang = Math.sqrt((tinggiLimas * tinggiLimas) + (super.sisiPanjang/2.0) * (super.sisiPanjang/2.0));
        luasPermukaan = super.luas + 2 * (0.5 * super.sisiPendek * sisiTegakPendek) + 2 * (0.5 * super.sisiPanjang * sisiTegakPanjang);
        return luasPermukaan;
    }
}
