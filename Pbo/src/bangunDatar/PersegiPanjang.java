package bangunDatar;

public class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang,double lebar) {
        this.panjang = panjang;
    }

    @Override
    public void hitungLuas() {
        double luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang: " + luas);
    }

    @Override
    public void hitungKeliling() {
        double keliling = 2*panjang*lebar;
        System.out.println("Keliling Persegi Panjang: " + keliling);
    }
        
    public double getPanjang() { return panjang; }
    public double getLebar() { return lebar; }
    public double getLuas() { return panjang * lebar; }
}
