package bangunDatar;

public class PrismaBelahKetupat extends BelahKetupat {
    private double tinggiPrisma;
    private double volume;
    private double luasPermukaan;
    
    public PrismaBelahKetupat(double diagonalA, double diagonalB, double sisi, double tinggiPrisma) {
        super(diagonalA, diagonalB, sisi);
        this.tinggiPrisma = tinggiPrisma;
    }
    
    public double hitungVolume() {
        volume = super.luas * tinggiPrisma;
        return volume;
    }
    
    public double hitungLuasPermukaan() {
        luasPermukaan = 2 * super.luas + 4 * (super.sisi * tinggiPrisma);
        return luasPermukaan;
    }
}
