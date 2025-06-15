package bangunDatar;

public class Trapesium extends BangunDatar {
    protected double sisiAtas;
    protected double sisiBawah;
    protected double sisiMiring;
    protected double tinggi;
    protected double keliling;
    protected double luas;
    
    
    public Trapesium(double sisiAtas, double sisiBawah, double sisiMiring, double tinggi) {
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        this.sisiMiring = sisiMiring;
        this.tinggi = tinggi;
        this.keliling = hitungKeliling();
        this.luas = hitungLuas();
    }

    @Override
    public double hitungLuas() {
        luas = (sisiAtas + sisiBawah) * tinggi / 2;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = sisiAtas + sisiMiring + sisiBawah;
        return keliling;
    }
}
