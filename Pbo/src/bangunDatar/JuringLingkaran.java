package bangunDatar;

public class JuringLingkaran extends Lingkaran {
    private double sudut;
    
    public JuringLingkaran(double jari, double sudut) {
        this.jari = jari;
        this.sudut = sudut;
    }

    @Override
    public void hitungLuas() {
        return (sudut / 360) * phi * jari * jari;
    }

    @Override
    public void hitungKeliling() {
        return (sudut / 360) * 2 * phi * jari + 2 * jari;
    }
}

