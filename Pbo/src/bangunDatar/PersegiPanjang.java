package bangunDatar;

public class PersegiPanjang extends BangunDatar {
    protected double panjang;
    protected double lebar;
    protected double luas;
    protected double keliling;
    
    public PersegiPanjang(double panjang,double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.keliling = hitungKeliling();
        this.luas = hitungLuas();
    }

    @Override
    public double hitungLuas() {
        luas = panjang * lebar;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = 2*(panjang+lebar);
        return keliling;
    }
}
