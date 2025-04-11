package bangunDatar;

public class LayangLayang extends BangunDatar {
    double diagonalA;
    double diagonalB;
    double sisiA;
    double sisiB;
    double sisiC;
    double sisiD;

    public LayangLayang(double diagonalA, double diagonalB,double sisiA,double sisiB,double sisiC,double sisiD ) {

        this.diagonalA = diagonalA;
        this.diagonalB = diagonalB;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
        this.sisiD = sisiD;
    }

    @Override
    public void hitungLuas() {
        double luas = diagonalA*diagonalB/2;
        System.out.println("Luas Layang - Layang: " + luas);
    }

    @Override
    public void hitungKeliling() {
        double keliling = sisiA+sisiB+sisiC+sisiD;
        System.out.println("Keliling Layang - Layang: " + keliling);
    }
}
