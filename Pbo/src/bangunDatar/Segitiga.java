package bangunDatar;
import bangun.Bangun;

public class Segitiga extends BangunDatar implements Bangun {
    protected double alas;
    protected double tinggi;
    protected double sisiA;
    protected double sisiB;
    protected double luas;
    protected double keliling;

    public Segitiga(double alas, double tinggi, double sisiA, double sisiB) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
    }

    @Override
    public double hitungLuas() {
        luas = alas * tinggi/2;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = alas + sisiA + sisiB;
        return keliling;
    }
}
