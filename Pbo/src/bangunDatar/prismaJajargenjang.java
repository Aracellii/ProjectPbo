package bangunDatar;

public class prismaJajargenjang extends JajarGenjang{
    protected double tinggiPrisma;
        
    public prismaJajargenjang(double alas, double sisiMiring, double tinggi, double luas, double keliling, double tinggiPrisma) {
        super(alas, sisiMiring, tinggi, luas, keliling);
        this.tinggiPrisma = tinggiPrisma;
    }
    
    private double hitungVolume(){
        return hitungLuas() * tinggiPrisma;
    }
    
    private double hitungLuasPermukaan(){
        return (2 * hitungLuas()) + (hitungKeliling() * tinggiPrisma);
    }
         
}
