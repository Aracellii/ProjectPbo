package bangunDatar;

public class BelahKetupat extends BangunDatar {
    protected double diagonalA;
    protected double diagonalB;
    protected double sisi;
    protected double keliling;
    protected double luas;

    public BelahKetupat(double diagonalA, double diagonalB, double sisi) {

        this.diagonalA = diagonalA;
        this.diagonalB = diagonalB;
        this.sisi = sisi;
        this.keliling = hitungKeliling();
        this.luas = hitungLuas();
    }

    @Override
    public double hitungLuas() {
        luas = diagonalA * diagonalB / 2;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = sisi * 4;
        return keliling;
    }
}
