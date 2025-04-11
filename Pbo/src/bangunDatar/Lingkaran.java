    package bangunDatar;

    public class Lingkaran extends BangunDatar {
        public double jari;

        public Lingkaran(double jari) {
            this.jari = jari;
        }

        @Override
        public void hitungLuas() {
            double luas = phi * jari * jari;
            System.out.println("Luas lingkaran: " + luas);
        }

        @Override
        public void hitungKeliling() {
            double keliling = 2 * phi * jari;
            System.out.println("Keliling lingkaran: " + keliling);
        }
            public double getLuas() {
        return Math.PI * jari * jari;
    }

    public double getJari() {
        return jari;
    }
    }

