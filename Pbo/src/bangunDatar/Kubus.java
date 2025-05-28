package bangunDatar;
import bangunDatar.Persegi;
public class Kubus extends Persegi  {
    
    public Kubus(double sisi) {
        super(sisi);
    }
    
    public void hitungVolume() {
        double volume = sisi * sisi * sisi;
        System.out.println("Luas Kubus: " + volume);
    }
    public void hitungLuasPermukaan() {
        double luas = 6 * sisi * sisi;
        System.out.println("Luas Permukaan Kubus: " + luas);
    }
}
