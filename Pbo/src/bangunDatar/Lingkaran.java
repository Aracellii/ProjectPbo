    package bangunDatar;

    public class Lingkaran extends BangunDatar {
        protected double jari;
        protected double luas;
        protected double keliling;

        public Lingkaran(double jari) {
            this.jari = jari;
        }

        @Override
        public double  hitungLuas() {
           luas = Math.PI * jari * jari;
           return luas;
        }

        @Override
        public double  hitungKeliling() {
            keliling = 2 * Math.PI * jari;
            return keliling;
        }

        

    }
