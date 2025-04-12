package bangunDatar;

public class Persegi extends BangunDatar {
    public double sisi;
    
    
    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public void hitungLuas() {
        double luas = sisi * sisi;
        System.out.println("Luas Persegi: " + luas);
    }

    @Override
    public void hitungKeliling() {
        double keliling = 4 * sisi;
        System.out.println("Keliling Persegi: " + keliling);
    }
}
