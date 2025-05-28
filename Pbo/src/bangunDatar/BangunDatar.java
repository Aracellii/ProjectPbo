package bangunDatar;
import bangun.*;
public abstract class BangunDatar implements Bangun {
    protected double luas;
    protected double keliling;
    public final static double phi = 3.14;

    public abstract void hitungLuas(); //double
    public abstract void hitungKeliling(); //double
    
    public double getLuas() {
        return luas;
    }

    public double getKeliling() {
        return keliling;
    }

}
