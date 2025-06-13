package bangunDatar;

public class TemberengLingkaran extends Lingkaran {
    private final double sudut;
    private double sudutRadian;
    private double panjangBusur;
    private double taliBusur;
    protected double luasTembereng;
    protected double kelilingTembereng;

    public TemberengLingkaran(double jari, double sudut){
        super(jari); 
        this.sudut = sudut;
    }
    
    @Override
    public double hitungLuas() {  
        sudutRadian = Math.toRadians(sudut);
        double luasJuring = (sudut / 360.0) * super.hitungLuas();
        double luasSegitiga = 0.5 * super.jari* super.jari * Math.sin(sudutRadian);
        luasTembereng = luasJuring - luasSegitiga;
        return luasTembereng;
    }
    
    @Override
    public double hitungKeliling() {
        sudutRadian = Math.toRadians(sudut);
        panjangBusur = sudutRadian * super.jari;
        taliBusur = 2 * super.jari * Math.sin(sudutRadian / 2);
        kelilingTembereng = panjangBusur + taliBusur;
        return kelilingTembereng;
    }

    public double hitungLuas(double jariJariBaru, double sudutBaru) {
        sudutRadian = Math.toRadians(sudutBaru);
        double luasJuring = (sudutBaru / 360.0) * Math.PI * jariJariBaru * jariJariBaru;
        double luasSegitiga = 0.5 * jariJariBaru * jariJariBaru * Math.sin(sudutRadian);
        luasTembereng = luasJuring - luasSegitiga;
        return luasTembereng;
    }

    public double hitungKeliling(double jariJariBaru, double sudutBaru) {
        sudutRadian = Math.toRadians(sudutBaru);
        panjangBusur = sudutRadian * jariJariBaru;
        taliBusur = 2 * jariJariBaru * Math.sin(sudutRadian / 2);
        kelilingTembereng= panjangBusur + taliBusur;
        return kelilingTembereng;
    }

}
