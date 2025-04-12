package bangunRuang;
import bangunDatar.PersegiPanjang;

public class Balok extends BangunRuang {
    private PersegiPanjang alas;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.alas = new PersegiPanjang(panjang, lebar);
        this.tinggi = tinggi;
    }

    @Override
    public void hitungVolume() {
        double volume = alas.getPanjang() * alas.getLebar() * tinggi;
        System.out.println("Volume Balok: " + volume);
    }

    @Override
    public void hitungLuasPermukaan() {
        double p = alas.getPanjang();
        double l = alas.getLebar();
        double t = tinggi;
        double luas = 2 * (p * l + p * t + l * t);
        System.out.println("Luas Permukaan Balok: " + luas);
    }
}
