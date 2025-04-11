package bangunDatar;

public class Trapesium extends BangunDatar {
    private double sisiAtas;
    private double sisiBawah;
    private double sisiKiri;
    private double sisiKanan;
    private double tinggi;
    
    
    public Trapesium(double sisiAtas, double sisiBawah, double sisiKiri, double sisiKanan, double tinggi) {
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        this.sisiKiri = sisiKiri;
        this.sisiKanan = sisiKanan;
        this.tinggi = tinggi;
    }

    @Override
    public void hitungLuas() {
        double luas = (sisiAtas + sisiBawah) * tinggi / 2;
        System.out.println("Luas Trapesium: " + luas);
    }

    @Override
    public void hitungKeliling() {
        double keliling = sisiAtas + sisiKanan + sisiBawah + sisiKiri;
        System.out.println("Keliling Trapesium: " + keliling);
    }
}
