
package bangunRuang;

public class Kubus extends Persegi implements BangunRuang {
    
    public Kubus(double sisi) {
        super(sisi);
    }
    
    public void hitungVolume() {
        double volume = sisi * sisi * sisi;
        System.out.println("Luas Kubus: " + volume);
    }
    
}
