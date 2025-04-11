package bangunDatar;

public class JuringLingkaran extends Lingkaran {
    private double sudut;
    
    public JuringLingkaran(double jari, double sudut) {
        super(jari);                                            //Mengambil dari lingkaran
        this.sudut = sudut;
    }

    @Override
    public void hitungLuas() {
    double luas = (sudut / 360) * super.getLuas();
    System.out.println("Luas Juring Lingkaran: " + luas);
    }

    @Override
    public void hitungKeliling() {
        System.out.println("Keliling Juring lingkaran : " + (sudut / 360) * 2 * phi * jari + 2 * jari);
    }
}
