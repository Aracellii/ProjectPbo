package bangunDatar;
import bangun.*;
public abstract class BangunDatar extends Bangun {
    protected double luas;
    protected double keliling;
    public final static double phi = 3.14;

    public abstract void hitungLuas();
    public abstract void hitungKeliling();
    
    public double getLuas() {
        return luas;
    }

    public double getKeliling() {
        return keliling;
    }

}
