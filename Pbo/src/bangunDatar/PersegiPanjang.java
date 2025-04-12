package bangunDatar;

public class PersegiPanjang extends BangunDatar {
    private double sisi;


    public PersegiPanjang(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public void hitungLuas() {
        double luas = sisi * sisi;
        System.out.println("Luas Persegi Panjang: " + luas);
    }

    @Override
    public void hitungKeliling() {
        double keliling = 4 * sisi;
        System.out.println("Keliling Persegi Panjang: " + keliling);
    }
}
