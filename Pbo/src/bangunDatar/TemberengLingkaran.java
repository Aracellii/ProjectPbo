package bangunDatar;

public class TemberengLingkaran extends Lingkaran {
    private double sudut;

    public TemberengLingkaran(double jari, double sudut) {
        super(jari);
        this.sudut = sudut;
    }

    @Override
    public void hitungLuas() {
        double luas = (sudut / 360) * phi * jari * jari;
        System.out.println("Luas Juring Lingkaran: " + luas);
    }

    @Override
    public void hitungKeliling() {
        double busur = (sudut / 360) * 2 * phi * jari;
        double keliling = busur + 2 * jari;
        System.out.println("Keliling Juring Lingkaran: " + keliling);
    }
}
