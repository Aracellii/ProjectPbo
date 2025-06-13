package bangunDatar;

public class PrismaSegiEmpat extends PersegiPanjang {
    private final double tinggi;
    private double volume;
    private double luasPermukaan;

    public PrismaSegiEmpat(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        volume = super.luas * tinggi;
        return volume;
    }

    public double hitungLuasPermukaan() {
        luasPermukaan = 2 * super.luas + super.keliling * tinggi;
        return luasPermukaan;
    }
}