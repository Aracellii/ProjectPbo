package bangunDatar;
public class JuringBola extends Bola {
    protected Lingkaran lingkaran;
    protected double sudut;
    protected double volumeJuring;
    protected double luasPermukaanJuring;
    public JuringBola(double jari, double sudut) {
        super(jari); 
        this.sudut = sudut;
    }
    @Override
    public double hitungVolume() {
        volumeJuring = (sudut / 360) * super.hitungVolume();
        return volumeJuring;
    }

    @Override
    public double hitungLuasPermukaan() {
        luasPermukaanJuring = (sudut / 360) * super.hitungLuasPermukaan()+ Math.PI * Math.pow(super.jari,2);
        return luasPermukaanJuring;
    }

    @Override
    public double hitungVolume(double jariBaru){
        volumeJuring = (sudut / 360.0) * Math.PI * ((4.0/3.0) * Math.pow(jariBaru, 3));
        return volumeJuring;
    }
    
    @Override
    public double hitungLuasPermukaan(double jariBaru) {
    double luasPermukaanBola = 4 * Math.PI * Math.pow(jariBaru, 2);
    double luasLingkaranPenutup = Math.PI * Math.pow(jariBaru, 2);
    luasPermukaanJuring = (sudut / 360.0) * luasPermukaanBola + luasLingkaranPenutup;
    return luasPermukaanJuring;
}

}
