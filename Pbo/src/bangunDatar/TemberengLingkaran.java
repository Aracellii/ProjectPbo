package bangunDatar;

public class TemberengLingkaran extends Lingkaran {
    private double sudut;
    public TemberengLingkaran(double jari, double sudut) {
        this.jari = jari;
        this.sudut = sudut;
        super(jari);//Mengambil dari lingkaran

    }

    public double hitungLuas() {
        double luasJuring = (sudut / 360) * super.hitungLuas();
        double luasSegitiga = 0.5 * jariJari * jariJari * Math.sin(Math.toRadians(sudut));
        return luasJuring - luasSegitiga;
    }
    public double hitungKeliling() {
        double panjangBusur = (sudut / 360) * 2 * Math.PI * jariJari;
        return panjangBusur + 2 * jariJari * Math.sin(Math.toRadians(sudut / 2));
    }
}
