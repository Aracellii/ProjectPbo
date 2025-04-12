package bangunDatar;

public class JuringLingkaran extends Lingkaran {
    private final double sudut;

    public JuringLingkaran(double jari, double sudut) {
        super(jari);
        this.sudut = sudut;
    }

    @Override
    public void hitungLuas() {
        double luasJuring = (sudut / 360) * super.getLuas();
        System.out.println("Luas Juring lingkaran: " + luasJuring);
    }

    @Override
    public void hitungKeliling() {    
        double kelilingJuring = (sudut / 360) * super.getKeliling() + 2 * jari;
        System.out.println("Keliling Juring lingkaran: " + kelilingJuring);
    }
}
