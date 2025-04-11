package bangunDatar;
public class Main {
    public static void main(String[] args) {
        // Polymorphism - Lingkaran
        BangunDatar lingkaran = new Lingkaran(7);
        lingkaran.hitungLuas();
        lingkaran.hitungKeliling();

        System.out.println("");

        // Polymorphism - Persegi
        BangunDatar persegi = new Persegi(3);
        persegi.hitungLuas();
        persegi.hitungKeliling();

        System.out.println("");

        // Polymorphism - Segitiga
        BangunDatar segitiga = new Segitiga(3,4,5,6);
        segitiga.hitungLuas();
        segitiga.hitungKeliling();
    }
}
