package bangunDatar;

public class TemberengLingkaran extends Lingkaran {
    private final double sudut;
    
    public TemberengLingkaran(double jari, double sudut){
        super(jari); 
        this.sudut = sudut;
                                                                           //Mengambil dari lingkaran

    }
    
    @Override
    public void hitungLuas() {
            
        double luasJuring = (sudut / 360) * super.getLuas();
        double luasSegitiga = 0.5 * jari * jari * Math.sin(Math.toRadians(sudut));
        System.out.println(luasJuring - luasSegitiga); 
    }
    
    @Override
    public void hitungKeliling() {
        double panjangBusur = (sudut / 360) * 2 * Math.PI * jari;
        System.out.println(panjangBusur + 2 * jari * Math.sin(Math.toRadians(sudut / 2))); 
    }

}
