package bangunDatar;

public class JajarGenjang extends BangunDatar {
    protected double alas;
    protected double sisiMiring;
    protected double tinggi;
    protected double luas;
    protected double keliling;

    public JajarGenjang(double alas, double sisiMiring, double tinggi, double luas, double keliling) {
        this.alas = alas;
        this.sisiMiring = sisiMiring;
        this.tinggi = tinggi;
        this.luas = hitungLuas();
        this.keliling = hitungKeliling();
    }

    @Override
    public double hitungLuas() {
        this.luas = alas * tinggi;
        System.out.println("Luas Jajar Genjang: " + luas);
        return luas;
    }

    @Override   
    public double hitungKeliling() {
        this.keliling = (alas + sisiMiring) * 2;
        System.out.println("Keliling Jajar Genjang: " + keliling);
        return keliling;
    }
    public void prosesInputDanValidasi() 
    {
        
    }
}
