package bangunDatar;
import bangunDatar.Lingkaran;

public class JuringBola extends Bola {
    private Lingkaran lingkaran;
    private double sudut;

    public JuringBola(double jari, double sudut) {
        super(jari); // ✅ memanggil constructor Bola
        this.lingkaran = new Lingkaran(jari);
        this.sudut = sudut;
    }

    @Override
    public void hitungVolume() {
        double volume = (sudut / 360) * super.getVolume();
        System.out.println("Volume Juring Bola: " + volume);
    }

    @Override
    public void hitungLuasPermukaan() {
        double r = lingkaran.getJari();
        double luas = (sudut / 360) * super.getLuasPermukaan() + Math.PI * Math.pow(r,2);
        System.out.println("Luas Permukaan Bola Padat : " + luas);
    }
}
