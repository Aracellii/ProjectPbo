package bangunDatar;

public class JuringLingkaran extends Lingkaran {
<<<<<<< Updated upstream
    private final double sudut;
=======
    private double sudut;
>>>>>>> Stashed changes

    public JuringLingkaran(double jari, double sudut) {
        super(jari);
        this.sudut = sudut;
    }

    public void hitungLuas() {
        double luasJuring = (sudut / 360) * super.getLuas();
        System.out.println("Luas Juring lingkaran: " + luasJuring);
    }

<<<<<<< Updated upstream
    @Override
    public void hitungKeliling() {    
        double kelilingJuring = (sudut / 360) * super.getKeliling() + 2 * jari;
=======
    public void hitungKeliling() {    
        double kelilingJuring = (sudut / 360) super.getKeliling() + 2 * jari;
>>>>>>> Stashed changes
        System.out.println("Keliling Juring lingkaran: " + kelilingJuring);
    }
}
