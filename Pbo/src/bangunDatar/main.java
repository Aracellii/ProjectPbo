package bangunDatar;

public class main {
    public static void main(String[] args) {
        // Lingkaran
        // Polymorphism
        BangunDatar lingkaran = new Lingkaran(7);
        // Memanggil Method 
        lingkaran.hitungLuas();
        lingkaran.hitungKeliling();
        
        // Persegi
        // Polymorphism
        BangunDatar persegi = new Persegi(3);
        // Memanggil Method 
        persegi.hitungLuas();
        persegi.hitungKeliling();
    }
}
