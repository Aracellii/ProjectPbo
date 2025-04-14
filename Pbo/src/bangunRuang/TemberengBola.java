package bangunRuang;
import bangunDatar.Lingkaran;

public class TemberengBola extends BangunRuang {
    private Lingkaran lingkaran;
    private double tinggi;

    public TemberengBola(double jari, double tinggi) {
        this.lingkaran = new Lingkaran(jari);
        this.tinggi = tinggi;
    }

    @Override
    public void hitungVolume() {
        double r = lingkaran.getJari();
        double volume = (1.0 / 6.0) * Math.PI * tinggi * tinggi * (3 * r - tinggi);
        System.out.println("Volume Tembereng Bola: " + volume);
    }

    @Override
    public void hitungLuasPermukaan() {
        double r = lingkaran.getJari();
        double luas = 2 * Math.PI * r * tinggi;
        System.out.println("Luas Permukaan Tembereng Bola: " + luas);
    }
}