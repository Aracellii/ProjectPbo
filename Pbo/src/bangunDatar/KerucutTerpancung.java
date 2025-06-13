package bangunDatar;

public class KerucutTerpancung extends Kerucut {
    private double tinggiTerpancung;
    private double jariTerpancung;
    private double volume;
    private double luasPermukaan;
    
    public KerucutTerpancung (double jari, double tinggi, double jariTerpancung, double tinggiTerpancung){
        super(jari, tinggi);
        this.jariTerpancung = jariTerpancung;
        this.tinggiTerpancung = tinggiTerpancung;
    }

    public double hitungVolume (){
        volume = super.volume - (1.0/3.0) * Math.PI * jariTerpancung * jariTerpancung * tinggiTerpancung;
        return volume;
    }
    
    public double hitungLuasPermukaan (){ 
        luasPermukaan = Math.PI * jariTerpancung * (jariTerpancung + Math.sqrt((jariTerpancung - super.jari)*(jariTerpancung - super.jari) + (tinggiTerpancung)*(tinggiTerpancung)));
        return luasPermukaan;
    }
}
