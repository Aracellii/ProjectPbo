package bangunDatar;

public class PrismaLayangLayang extends LayangLayang {
    private double tinggiPrisma;
    private double volume;
    private double luasPermukaan;
    
    public PrismaLayangLayang(double diagonalA, double diagonalB,double sisiPendek,double sisiPanjang, double tinggiPrisma) {
        super(diagonalA, diagonalB, sisiPendek, sisiPanjang);
        this.tinggiPrisma = tinggiPrisma;
    }
    
    public double hitungVolume() {
        volume = super.luas * tinggiPrisma;
        return volume;
    }
    
    public double hitungLuasPermukaan() {
        luasPermukaan = 2 * super.luas + (2 * super.sisiPendek + 2 * super.sisiPanjang) * tinggiPrisma;
        return luasPermukaan;
    }
}
