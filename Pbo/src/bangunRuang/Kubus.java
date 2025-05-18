
package bangunRuang;
import bangunDatar.Persegi;
public class Kubus extends Persegi implements BangunRuang {
    
    public Kubus(double sisi) {
        super(sisi);
    }
    
    public void hitungVolume() {
        double volume = sisi * sisi * sisi;
        System.out.println("Luas Kubus: " + volume);
    }
    
}
