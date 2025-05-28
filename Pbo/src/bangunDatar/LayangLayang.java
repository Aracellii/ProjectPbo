package bangunDatar;

public class LayangLayang extends BangunDatar {
    double diagonalA;
    double diagonalB;
    double sisiPendek;
    double sisiPanjang;


    public LayangLayang(double diagonalA, double diagonalB,double sisiPendek,double sisiPanjang ) {

        this.diagonalA = diagonalA;
        this.diagonalB = diagonalB;
        this.sisiPendek = sisiPendek;
        this.sisiPanjang = sisiPanjang;
    }

    @Override
    public void hitungLuas() {
        double luas = diagonalA*diagonalB/2;
        System.out.println("Luas Layang - Layang: " + luas);
    }

    @Override
    public void hitungKeliling() {
        double keliling = 2*(sisiPanjang+sisiPendek);
        System.out.println("Keliling Layang - Layang: " + keliling);
    }
}
