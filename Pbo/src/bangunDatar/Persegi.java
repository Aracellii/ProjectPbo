package bangunDatar;
import bangun.Bangun;
import bangunDatar.*;
public class Persegi extends BangunDatar implements Bangun {
    protected  double sisi;
    protected double luas;
    protected double keliling;
    
    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        luas = sisi * sisi;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = 4 * sisi;
        return keliling;
    }
}
