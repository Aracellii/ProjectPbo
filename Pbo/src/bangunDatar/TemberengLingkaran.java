package bangunDatar;

public class TemberengLingkaran extends Lingkaran {
    private double sudut;
<<<<<<< HEAD
    
    public TemberengLingkaran(double sudut) {
=======

    public TemberengLingkaran(double jari, double sudut) {
        super(jari);
>>>>>>> f37271048addecac3bdba68c902b75fbf23371a2
        this.sudut = sudut;
        super(jari);                                                                     //Mengambil dari lingkaran

    }
    @Override
    public void hitungLuas() {
        double luasJuring = (sudut / 360) * super.hitungLuas();
        double luasSegitiga = 0.5 * jari * jari * Math.sin(Math.toRadians(sudut));
        return luasJuring - luasSegitiga;
    }
    @Override
    public void hitungKeliling() {
        double panjangBusur = (sudut / 360) * 2 * Math.PI * jari;
        return panjangBusur + 2 * jari * Math.sin(Math.toRadians(sudut / 2));
    }
}
