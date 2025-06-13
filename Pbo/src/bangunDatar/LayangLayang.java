package bangunDatar;

public class LayangLayang extends BangunDatar {
    protected double  diagonalA;
    protected double  diagonalB;
    protected double sisiPendek;
    protected double sisiPanjang;
    protected double luas;
    protected double keliling;
    


    public LayangLayang(double diagonalA, double diagonalB,double sisiPendek,double sisiPanjang ) {

        this.diagonalA = diagonalA;
        this.diagonalB = diagonalB;
        this.sisiPendek = sisiPendek;
        this.sisiPanjang = sisiPanjang;
        this.luas = hitungLuas();
        this.keliling = hitungKeliling();
    }

    @Override
    public double  hitungLuas() {
        luas = diagonalA*diagonalB/2;
        System.out.println("Luas Layang - Layang: " + luas);
        return luas;
    }

    @Override
    public double  hitungKeliling() {
        keliling = 2*(sisiPanjang+sisiPendek);
        System.out.println("Keliling Layang - Layang: " + keliling);
        return keliling;
    }
}
