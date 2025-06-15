    package bangunDatar;

    public class Lingkaran extends BangunDatar {
        protected double jari;
        protected double luas;
        protected double keliling;

        public Lingkaran(double jari) {
            this.jari = jari;
            this.keliling=hitungKeliling();
            this.luas=hitungLuas();
        }     
        
        @Override
        public double  hitungLuas() {
           luas = Math.PI * jari * jari;
           return luas;
        }

        @Override
        public  double  hitungKeliling() {
            keliling = 2 * Math.PI * jari;
            return keliling;
        }

        public double getJari() {
        return jari;
}

    public double getLuas() {
    return luas;
}

    }
