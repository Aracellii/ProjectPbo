package bangunRuang;

public class TemberengBola extends BangunRuang {
    private double jari;
    private double tinggi;

    public TemberengBola(double jari, double tinggi) {
        this.jari = jari;
        this.tinggi = tinggi;
    }

    @Override
    public void hitungVolume() {
        double volume = (Math.PI * tinggi * tinggi * (3 * jari - tinggi)) / 3;
        System.out.println("Volume Tembereng Bola: " + volume);
    }

    @Override
    public void hitungLuasPermukaan() {
        double luas = 2 * Math.PI * jari * tinggi;
        System.out.println("Luas Permukaan Tembereng Bola: " + luas);
    }
}