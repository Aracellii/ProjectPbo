package bangunDatar;

import bangun.Bangun;

public abstract class BangunDatar implements Bangun {
    public BangunDatar() {}

    @Override
    public abstract double hitungLuas();
    
    @Override
    public abstract double hitungKeliling();
}