package bangunDatar;
import bangunDatar.Lingkaran;

public class Tabung extends BangunRuang {
    private Lingkaran lingkaran;
    private double tinggi;

    public Tabung(double jari, double tinggi) {
        this.lingkaran = new Lingkaran(jari);
        this.tinggi = tinggi;
    }

    @Override
    public void hitungVolume() {
        double r = lingkaran.getJari();
        double volume = Math.PI * r * r * tinggi;
        System.out.println("Volume Tabung: " + volume);
    }

    @Override
    public void hitungLuasPermukaan() {
        double r = lingkaran.getJari();
        double luas = 2 * Math.PI * r * (r + tinggi);
        System.out.println("Luas Permukaan Tabung: " + luas);
    }
}