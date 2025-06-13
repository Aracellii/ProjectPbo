package bangunDatar;

public class Balok extends PersegiPanjang {
    protected double tinggi;
    protected double volume;
    protected double LuasPermukaan;

    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
    }

    @Override
    public double hitungVolume() {
        double volume = alas.getPanjang() * alas.getLebar() * tinggi;
        System.out.println("Volume Balok: " + volume);
    }

    @Override
    public double hitungLuasPermukaan() {
        double p = alas.getPanjang();
        double l = alas.getLebar();
        double t = tinggi;
        double luas = 2 * (p * l + p * t + l * t);
        System.out.println("Luas Permukaan Balok: " + luas);
    }
}
