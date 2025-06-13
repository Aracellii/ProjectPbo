package bangunDatar;

public class KerucutTerpancung extends Kerucut {
    private double tinggiTerpancung;
    private double volume;
    private double luasPermukaan;
    private double jariTerpancung;
    
    public KerucutTerpancung (double jari, double tinggi, double tinggiTerpancung){
        super(jari, tinggi);
        this.tinggiTerpancung = tinggiTerpancung;
        jariTerpancung = super.jari * ((super.tinggi - tinggiTerpancung)/super.tinggi);
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
