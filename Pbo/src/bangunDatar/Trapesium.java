package bangunDatar;

public class Trapesium extends BangunDatar {
    protected double sisiAtas;
    protected double sisiBawah;
    protected double sisiKiri;
    protected double sisiKanan;
    protected double tinggi;
    protected double keliling;
    protected double luas;
    
    
    public Trapesium(double sisiAtas, double sisiBawah, double sisiKiri, double sisiKanan, double tinggi) {
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        this.sisiKiri = sisiKiri;
        this.sisiKanan = sisiKanan;
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
        keliling = sisiAtas + sisiKanan + sisiBawah + sisiKiri;
    }
}
