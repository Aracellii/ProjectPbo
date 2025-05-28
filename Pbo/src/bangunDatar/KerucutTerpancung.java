package bangunDatar;
import bangunDatar.Lingkaran;

public class KerucutTerpancung extends BangunRuang {
    private Lingkaran lingkaran1;
    private Lingkaran lingkaran2;
    private double tinggi;
    private double sisiMiring;
    
    public KerucutTerpancung (double r1, double r2, double tinggi, double sisiMiring){
        this.lingkaran1 = new Lingkaran(r1);
        this.lingkaran2 = new Lingkaran(r2);
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }
    @Override 
    public void hitungVolume (){
        double r1 = lingkaran1.getJari();
        double r2 = lingkaran2.getJari();
        double volume = (1.0/3.0) * Math.PI * tinggi * (r1 * r1 + r1 * r2 + r2 * r2);
        System.out.println("Volume Kerucut Terpancung :" + volume);
    }
    
    @Override 
    public void hitungLuasPermukaan (){
        double r1 = lingkaran1.getJari();
        double r2 = lingkaran2.getJari();
        double luas = Math.PI * (r1 + r2) * sisiMiring + Math.PI * (r1*r1-r2*r2);
        System.out.println("Luas Permukaan Kerucut Terpancung :" + luas);
    }
}
