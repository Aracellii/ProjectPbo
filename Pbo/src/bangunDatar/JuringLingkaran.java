package bangunDatar;

public class JuringLingkaran extends Lingkaran {
    protected double sudut;
    protected double luasJuring;
    protected double kelilingJuring;
    public JuringLingkaran(double jari, double sudut) {
        super(jari);
        this.sudut = sudut;
        this.luasJuring = hitungLuas();
        this.kelilingJuring = hitungKeliling();
    }
      
    @Override
    public double hitungLuas() {
        luasJuring = (sudut / 360) * super.luas;
        return luasJuring;
    }

    @Override
    public double hitungKeliling() {
        kelilingJuring = (sudut / 360) * super.luas + 2 * super.jari;
        return kelilingJuring;
    }

     public double hitungLuas(double jariJariBaru, double sudutJuringBaru) {
        luasJuring = (sudutJuringBaru / 360.0) * Math.PI * jariJariBaru * jariJariBaru;
        return luasJuring;
    }

    public double hitungKeliling(double jariJariBaru, double sudutJuringBaru) {
        kelilingJuring = (sudutJuringBaru / 360.0) * (2 * Math.PI * jariJariBaru) + 2 * jariJariBaru;
        return kelilingJuring;
    }
}
