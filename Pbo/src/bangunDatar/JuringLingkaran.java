package bangunDatar;

public class JuringLingkaran extends Lingkaran {
    private double sudut;
    
    public JuringLingkaran(double jari, double sudut) {
        this.nama = "Juring Lingkaran";
        this.jari = jari;
        this.sudut = sudut;
    }

    @Override
    public double hitungLuas() {
        return (sudut / 360) * phi * jari * jari;
    }

    @Override
    public double hitungKeliling() {
        return (sudut / 360) * 2 * phi * jari + 2 * jari;
    }
}

