package bangunDatar;
import bangunDatar.Segitiga;

public class PrismaSegiTiga extends BangunRuang {
    private final Segitiga alas;
    private final double tinggiPrisma;

    public PrismaSegiTiga(double alas, double tinggi, double sisiA, double sisiB, double tinggiPrisma) {
        this.alas = new Segitiga(alas, tinggi, sisiA, sisiB);
        this.tinggiPrisma = tinggiPrisma;
    }

    @Override
    public void hitungVolume() {
        double volume = alas.getLuas() * tinggiPrisma;
        System.out.println("Volume Prisma Segitiga: " + volume);
    }

    @Override
    public void hitungLuasPermukaan() {
        double luasPermukaan = (2 * alas.getLuas()) + (alas.getKeliling() * tinggiPrisma);
        System.out.println("Luas Permukaan Prisma Segitiga: " + luasPermukaan);
    }
}