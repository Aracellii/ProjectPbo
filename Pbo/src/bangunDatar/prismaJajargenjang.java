package bangunDatar;

public class PrismaJajargenjang extends JajarGenjang{
    protected double tinggiPrisma;
        
    public PrismaJajargenjang(double alas, double sisiMiring, double tinggi, double tinggiPrisma) {
        super(alas, sisiMiring, tinggi);
        this.tinggiPrisma = tinggiPrisma;
    }
    
    private double hitungVolume(){
        return hitungLuas() * tinggiPrisma;
    }
    
    private double hitungLuasPermukaan(){
        return (2 * hitungLuas()) + (hitungKeliling() * tinggiPrisma);
    }
         
}
