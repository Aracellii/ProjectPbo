package bangunDatar;

public class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;
    private double sisiA;
    private double sisiB;

    public Segitiga(double alas, double tinggi, double sisiA, double sisiB) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
    }

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = 0;
        this.sisiB = 0;
    }

    @Override
    public void hitungLuas() {
        double luas = alas*tinggi/2;
        System.out.println("Luas Segitiga: " + luas);
    }

    @Override
    public void hitungKeliling() {
        double keliling = alas+sisiA+sisiB;
        System.out.println("Keliling Segitiga: " + keliling);
    }

     public double getAlas() {
        return alas;
    }

    public double getTinggi() {
        return tinggi;
    }
    
    @Override
    public double getLuas() {
    return 0.5 * alas * tinggi;
    }   
    
    public double getKeliling() {
        return alas+sisiA+sisiB;
    }
}
