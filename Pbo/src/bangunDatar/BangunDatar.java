package bangunDatar;

import bangun.Bangun;

public abstract class BangunDatar implements Bangun {
    protected double luas;
    protected double keliling;

    public BangunDatar() {}

    @Override
    public abstract double hitungLuas();
    
    @Override
    public abstract double hitungKeliling();
}