package bangunDatar;

public class LimasLayangLayang extends LayangLayang {
    private double tinggiLimas;
    private double volume;
    private double luasPermukaan;

    public LimasLayangLayang(double diagonalA, double diagonalB, double sisiPendek, double sisiPanjang, double tinggiLimas) {
        super(diagonalA, diagonalB, sisiPendek, sisiPanjang);
        this.tinggiLimas = tinggiLimas;
    }

    public double hitungVolume() {
        volume = (1.0 / 3.0) * super.luas * tinggiLimas;
        return volume;
    }

    public double hitungLuasPermukaan() {
        double sisiTegakPendek = Math.sqrt((tinggiLimas * tinggiLimas)  + (super.sisiPendek/2.0) * (super.sisiPendek/2.0));
        double sisiTegakPanjang = Math.sqrt((tinggiLimas * tinggiLimas) + (super.sisiPanjang/2.0) * (super.sisiPendek/2.0));

        double luasSisiPendek = 2 * (0.5 * super.sisiPendek * sisiTegakPendek);
        double luasSisiPanjang = 2 * (0.5 * super.sisiPanjang * sisiTegakPanjang);

        luasPermukaan = super.luas + luasSisiPendek + luasSisiPanjang;
        return luasPermukaan;
    }
}
