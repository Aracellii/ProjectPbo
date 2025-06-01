package bangunDatar;

public class Bola extends Lingkaran {
    public Bola(double jari) {
        super(jari);
    }

    public void hitungVolume() {
        double r = getJari();
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        System.out.println("Volume Bola: " + volume);
    }

    public void hitungLuasPermukaan() {
        double r = getJari();
        double luas = 4 * Math.PI * r * r;
        System.out.println("Luas Permukaan Bola: " + luas);
    }

    public double getVolume() {
        double r = getJari();
        return (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
    }

    public double getLuasPermukaan() {
        double r = getJari();
        return 4 * Math.PI * r * r;
    }
}
