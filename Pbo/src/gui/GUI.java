package GUI;

import bangunDatar.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GUI extends JFrame {
    private JComboBox<String> comboBangun;
    private JPanel inputPanel;
    private JTextArea hasilArea;
    private JButton hitungButton;
    private ArrayList<JTextField> inputFields;

    public GUI() {
        setTitle("Hitung Bangun Datar & Ruang");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        String[] daftarBangun = {
            "Segitiga", "Persegi", "Persegi Panjang", "Jajar Genjang",
            "Layang-layang", "Trapesium", "Belah Ketupat", "Lingkaran",
            "Bola", "Kerucut", "Kerucut Terpancung", "Prisma Segitiga",
            "Limas Segitiga", "Prisma Segiempat", "Limas Persegi Panjang",
            "Kubus", "Limas Jajar Genjang", "Prisma Jajar Genjang",
            "Limas Layang-layang", "Prisma Layang-layang", "Limas Trapesium",
            "Prisma Trapesium", "Limas Belah Ketupat", "Prisma Belah Ketupat",
            "Juring Lingkaran", "Tembereng Lingkaran", "Juring Bola",
            "Tembereng Bola", "Cincin Bola", "Tabung"
        };

        comboBangun = new JComboBox<>(daftarBangun);
        add(comboBangun, BorderLayout.NORTH);
        comboBangun.addActionListener(e -> buatInputFields());
        
        inputPanel = new JPanel(new GridLayout(0, 2));
        add(inputPanel, BorderLayout.CENTER);

        hasilArea = new JTextArea(8, 30);
        hasilArea.setEditable(false);
        add(new JScrollPane(hasilArea), BorderLayout.SOUTH);

        hitungButton = new JButton("Hitung");
        add(hitungButton, BorderLayout.EAST);
        hitungButton.addActionListener(e -> {
            Runnable task = () -> prosesPerhitungan();
            Thread thread = new Thread(task);
            thread.start();
        });

        inputFields = new ArrayList<>();
        buatInputFields();
    }

    private void buatInputFields() {
        inputPanel.removeAll();
        inputFields.clear();

        String bangun = (String) comboBangun.getSelectedItem();
        String[] param = ambilParameter(bangun);

        for (String p : param) {
            inputPanel.add(new JLabel(p + ": "));
            JTextField field = new JTextField(10);
            inputFields.add(field);
            inputPanel.add(field);
        }

        inputPanel.revalidate();
        inputPanel.repaint();
    }

    private String[] ambilParameter(String bangun) {
        return switch (bangun) {
            case "Segitiga" -> new String[]{"Alas", "Tinggi", "Sisi A", "Sisi B"};
            case "Persegi" -> new String[]{"Sisi"};
            case "Persegi Panjang" -> new String[]{"Panjang", "Lebar"};
            case "Jajar Genjang" -> new String[]{"Alas", "Sisi Miring", "Tinggi"};
            case "Layang-layang" -> new String[]{"Diagonal A", "Diagonal B", "Sisi Panjang", "Sisi Pendek"};
            case "Trapesium" -> new String[]{"Sisi Atas", "Sisi Bawah", "Sisi Miring", "Tinggi"};
            case "Belah Ketupat" -> new String[]{"Diagonal A", "Diagonal B", "Sisi"};
            case "Lingkaran", "Bola" -> new String[]{"Jari-jari"};
            case "Kerucut" -> new String[]{"Jari-jari", "Tinggi"};
            case "Kerucut Terpancung" -> new String[]{"Jari-jari", "Tinggi", "Tinggi Terpancung"};
            case "Prisma Segitiga" -> new String[]{"Alas", "Tinggi", "Sisi A", "Sisi B", "Tinggi Prisma"};
            case "Limas Segitiga" -> new String[]{"Alas", "Tinggi", "Sisi A", "Sisi B", "Tinggi Limas"};
            case "Prisma Segiempat" -> new String[]{"Panjang", "Lebar", "Tinggi"};
            case "Limas Persegi Panjang" -> new String[]{"Panjang", "Lebar", "Tinggi Limas"};
            case "Kubus" -> new String[]{"Sisi"};
            case "Limas Jajar Genjang" -> new String[]{"Alas", "Sisi Miring", "Tinggi", "Tinggi Limas"};
            case "Prisma Jajar Genjang" -> new String[]{"Alas", "Sisi Miring", "Tinggi", "Tinggi Prisma"};
            case "Limas Layang-layang" -> new String[]{"Diagonal A", "Diagonal B", "Sisi Panjang 1", "Sisi Panjang 2", "Tinggi Limas"};
            case "Prisma Layang-layang" -> new String[]{"Diagonal A", "Diagonal B", "Sisi Pendek", "Sisi Panjang", "Tinggi Prisma"};
            case "Limas Trapesium" -> new String[]{"Sisi Atas", "Sisi Bawah", "Sisi Miring", "Tinggi", "Tinggi Limas"};
            case "Prisma Trapesium" -> new String[]{"Sisi Atas", "Sisi Bawah", "Sisi Miring", "Tinggi", "Tinggi Prisma"};
            case "Limas Belah Ketupat" -> new String[]{"Diagonal A", "Diagonal B", "Sisi", "Tinggi Limas", "Tinggi Segitiga Tegak"};
            case "Prisma Belah Ketupat" -> new String[]{"Diagonal A", "Diagonal B", "Sisi", "Tinggi Limas", "Tinggi Prisma"};
            case "Juring Lingkaran", "Tembereng Lingkaran", "Juring Bola" -> new String[]{"Jari-jari", "Sudut"};
            case "Tembereng Bola" -> new String[]{"Tinggi", "Jari-jari"};
            case "Cincin Bola" -> new String[]{"Jari-jari", "Tinggi"};
            case "Tabung" -> new String[]{"Jari-jari", "Tinggi"};
            default -> new String[]{};
        };
    }

    private void prosesPerhitungan() {
        String bangun = (String) comboBangun.getSelectedItem();
        hasilArea.append("Memilih: " + bangun + "\n");
        try {
            switch (bangun) {
                case "Segitiga" -> {
                    double alas = Double.parseDouble(inputFields.get(0).getText());
                    double tinggi = Double.parseDouble(inputFields.get(1).getText());
                    double sisiA = Double.parseDouble(inputFields.get(2).getText());
                    double sisiB = Double.parseDouble(inputFields.get(3).getText());
                    Segitiga segitiga = new Segitiga(alas, tinggi, sisiA, sisiB);
                    hasilArea.append("Luas: " + segitiga.hitungLuas() + "\n");
                    hasilArea.append("Keliling: " + segitiga.hitungKeliling() + "\n\n");
                }
                case "Persegi" -> {
                    double sisi = Double.parseDouble(inputFields.get(0).getText());
                    Persegi persegi = new Persegi(sisi);
                    hasilArea.append("Luas: " + persegi.hitungLuas() + "\n");
                    hasilArea.append("Keliling: " + persegi.hitungKeliling() + "\n\n");
                }
                case "Persegi Panjang" -> {
                    double panjang = Double.parseDouble(inputFields.get(0).getText());
                    double lebar = Double.parseDouble(inputFields.get(1).getText());
                    PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
                    hasilArea.append("Luas: " + persegiPanjang.hitungLuas() + "\n");
                    hasilArea.append("Keliling: " + persegiPanjang.hitungKeliling() + "\n\n");
                }
                case "Jajar Genjang" -> {
                    double alas = Double.parseDouble(inputFields.get(0).getText());
                    double sisiMiring = Double.parseDouble(inputFields.get(1).getText());
                    double tinggi = Double.parseDouble(inputFields.get(2).getText());
                    JajarGenjang jajarGenjang = new JajarGenjang(alas, sisiMiring, tinggi);
                    hasilArea.append("Luas: " + jajarGenjang.hitungLuas() + "\n");
                    hasilArea.append("Keliling: " + jajarGenjang.hitungKeliling() + "\n\n");
                }
                case "Layang-layang" -> {
                    double diagonalA = Double.parseDouble(inputFields.get(0).getText());
                    double diagonalB = Double.parseDouble(inputFields.get(1).getText());
                    double sisiPendek = Double.parseDouble(inputFields.get(2).getText());
                    double sisiPanjang = Double.parseDouble(inputFields.get(3).getText());
                    LayangLayang layangLayang = new LayangLayang(diagonalA, diagonalB, sisiPendek, sisiPanjang);
                    hasilArea.append("Luas: " + layangLayang.hitungLuas() + "\n");
                    hasilArea.append("Keliling: " + layangLayang.hitungKeliling() + "\n\n");
                }
                case "Trapesium" -> {
                    double sisiAtas = Double.parseDouble(inputFields.get(0).getText());
                    double sisiBawah = Double.parseDouble(inputFields.get(1).getText());
                    double sisiMiring = Double.parseDouble(inputFields.get(2).getText());
                    double tinggi = Double.parseDouble(inputFields.get(3).getText());
                    Trapesium trapesium = new Trapesium(sisiAtas, sisiBawah, sisiMiring, tinggi);
                    hasilArea.append("Luas: " + trapesium.hitungLuas() + "\n");
                    hasilArea.append("Keliling: " + trapesium.hitungKeliling() + "\n\n");
                }
                case "Belah Ketupat" -> {
                    double diagonalA = Double.parseDouble(inputFields.get(0).getText());
                    double diagonalB = Double.parseDouble(inputFields.get(1).getText());
                    double sisi = Double.parseDouble(inputFields.get(2).getText());
                    BelahKetupat belahKetupat = new BelahKetupat(diagonalA, diagonalB, sisi);
                    hasilArea.append("Luas: " + belahKetupat.hitungLuas() + "\n");
                    hasilArea.append("Keliling: " + belahKetupat.hitungKeliling() + "\n\n");
                }
                case "Lingkaran" -> {
                    double jari = Double.parseDouble(inputFields.get(0).getText());
                    Lingkaran lingkaran = new Lingkaran(jari);
                    hasilArea.append("Luas: " + lingkaran.hitungLuas() + "\n");
                    hasilArea.append("Keliling: " + lingkaran.hitungKeliling() + "\n\n");
                }
                case "Bola" -> {
                    double jari = Double.parseDouble(inputFields.get(0).getText());
                    Bola bola = new Bola(jari);
                    hasilArea.append("Volume: " + bola.hitungVolume() + "\n");
                    hasilArea.append("Luas Permukaan: " + bola.hitungLuasPermukaan() + "\n\n");
                }
                case "Kerucut" -> {
                    double jari = Double.parseDouble(inputFields.get(0).getText());
                    double tinggi = Double.parseDouble(inputFields.get(1).getText());
                    Kerucut kerucut = new Kerucut(jari, tinggi);
                    hasilArea.append("Volume: " + kerucut.hitungVolume() + "\n");
                    hasilArea.append("Luas Permukaan: " + kerucut.hitungLuasPermukaan() + "\n\n");
                }
                case "Kerucut Terpancung" -> {
                    double jari = Double.parseDouble(inputFields.get(0).getText());
                    double tinggi = Double.parseDouble(inputFields.get(1).getText());
                    double tinggiTerpancung = Double.parseDouble(inputFields.get(2).getText());
                    KerucutTerpancung kerucutTerpancung = new KerucutTerpancung(jari, tinggi, tinggiTerpancung);
                    hasilArea.append("Volume: " + kerucutTerpancung.hitungVolume() + "\n");
                    hasilArea.append("Luas Permukaan: " + kerucutTerpancung.hitungLuasPermukaan() + "\n\n");
                }
                case "Prisma Segitiga" -> {
                    double alas = Double.parseDouble(inputFields.get(0).getText());
                    double tinggi = Double.parseDouble(inputFields.get(1).getText());
                    double sisiA = Double.parseDouble(inputFields.get(2).getText());
                    double sisiB = Double.parseDouble(inputFields.get(3).getText());
                    double tinggiPrisma = Double.parseDouble(inputFields.get(4).getText());
                    PrismaSegiTiga prismaSegiTiga = new PrismaSegiTiga(alas, tinggi, sisiA, sisiB, tinggiPrisma);
                    hasilArea.append("Volume: " + prismaSegiTiga.hitungVolume() + "\n");
                    hasilArea.append("Luas Permukaan: " + prismaSegiTiga.hitungLuasPermukaan() + "\n\n");
                }
                case "Limas Segitiga" -> {
                    double alas = Double.parseDouble(inputFields.get(0).getText());
                    double tinggi = Double.parseDouble(inputFields.get(1).getText());
                    double sisiA = Double.parseDouble(inputFields.get(2).getText());
                    double sisiB = Double.parseDouble(inputFields.get(3).getText());
                    double tinggiLimas = Double.parseDouble(inputFields.get(4).getText());
                    LimasSegitiga limasSegitiga = new LimasSegitiga(alas, tinggi, sisiA, sisiB, tinggiLimas);
                    hasilArea.append("Volume: " + limasSegitiga.hitungVolume() + "\n");
                    hasilArea.append("Luas Permukaan: " + limasSegitiga.hitungLuasPermukaan() + "\n\n");
                }
                case "Prisma Segiempat" -> {
                    double panjang = Double.parseDouble(inputFields.get(0).getText());
                    double lebar = Double.parseDouble(inputFields.get(1).getText());
                    double tinggi = Double.parseDouble(inputFields.get(2).getText());
                    PrismaSegiEmpat prismaSegiEmpat = new PrismaSegiEmpat(panjang, lebar, tinggi);
                    hasilArea.append("Volume: " + prismaSegiEmpat.hitungVolume() + "\n");
                    hasilArea.append("Luas Permukaan: " + prismaSegiEmpat.hitungLuasPermukaan() + "\n\n");
                }
                case "Limas Persegi Panjang" -> {
                    double panjang = Double.parseDouble(inputFields.get(0).getText());
                    double lebar = Double.parseDouble(inputFields.get(1).getText());
                    double tinggiLimas = Double.parseDouble(inputFields.get(2).getText());
                    LimasPersegiPanjang limasPersegiPanjang = new LimasPersegiPanjang(panjang, lebar, tinggiLimas);
                    hasilArea.append("Volume: " + limasPersegiPanjang.hitungVolume() + "\n");
                    hasilArea.append("Luas Permukaan: " + limasPersegiPanjang.hitungLuasPermukaan() + "\n\n");
                }
                case "Kubus" -> {
                    double sisi = Double.parseDouble(inputFields.get(0).getText());
                    Kubus kubus = new Kubus(sisi);
                    hasilArea.append("Volume: " + kubus.hitungVolume() + "\n");
                    hasilArea.append("Luas Permukaan: " + kubus.hitungLuasPermukaan() + "\n\n");
                }
                case "Limas Jajar Genjang" -> {
                    double alas = Double.parseDouble(inputFields.get(0).getText());
                    double sisiMiring = Double.parseDouble(inputFields.get(1).getText());
                    double tinggi = Double.parseDouble(inputFields.get(2).getText());
                    double tinggiLimas = Double.parseDouble(inputFields.get(3).getText());
                    LimasJajarGenjang limasJajarGenjang = new LimasJajarGenjang(alas, sisiMiring, tinggi, tinggiLimas);
                    hasilArea.append("Volume: " + limasJajarGenjang.hitungVolume() + "\n");
                    hasilArea.append("Luas Permukaan: " + limasJajarGenjang.hitungLuasPermukaan() + "\n\n");
                }
                case "Prisma Jajar Genjang" -> {
                    double alas = Double.parseDouble(inputFields.get(0).getText());
                    double sisiMiring = Double.parseDouble(inputFields.get(1).getText());
                    double tinggi = Double.parseDouble(inputFields.get(2).getText());
                    double tinggiPrisma = Double.parseDouble(inputFields.get(3).getText());
                    PrismaJajarGenjang prismaJajarGenjang = new PrismaJajarGenjang(alas, sisiMiring, tinggi, tinggiPrisma);
                    hasilArea.append("Volume: " + prismaJajarGenjang.hitungVolume() + "\n");
                    hasilArea.append("Luas Permukaan: " + prismaJajarGenjang.hitungLuasPermukaan() + "\n\n");
                }
                case "Limas Layang-layang" -> {
                    double diagonalA = Double.parseDouble(inputFields.get(0).getText());
                    double diagonalB = Double.parseDouble(inputFields.get(1).getText());
                    double sisiPendek = Double.parseDouble(inputFields.get(2).getText());
                    double sisiPanjang = Double.parseDouble(inputFields.get(3).getText());
                    double tinggiLimas = Double.parseDouble(inputFields.get(4).getText());
                    LimasLayangLayang limasLayangLayang = new LimasLayangLayang(diagonalA, diagonalB, sisiPendek, sisiPanjang, tinggiLimas);
                    hasilArea.append("Volume: " + limasLayangLayang.hitungVolume() + "\n");
                    hasilArea.append("Luas Permukaan: " + limasLayangLayang.hitungLuasPermukaan() + "\n\n");
                }
                case "Prisma Layang-layang" -> {
                    double diagonalA = Double.parseDouble(inputFields.get(0).getText());
                    double diagonalB = Double.parseDouble(inputFields.get(1).getText());
                    double sisiPendek = Double.parseDouble(inputFields.get(2).getText());
                    double sisiPanjang = Double.parseDouble(inputFields.get(3).getText());
                    double tinggiPrisma = Double.parseDouble(inputFields.get(4).getText());
                    PrismaLayangLayang prismaLayangLayang = new PrismaLayangLayang(diagonalA, diagonalB, sisiPendek, sisiPanjang, tinggiPrisma);
                    hasilArea.append("Volume: " + prismaLayangLayang.hitungVolume() + "\n");
                    hasilArea.append("Luas Permukaan: " + prismaLayangLayang.hitungLuasPermukaan() + "\n\n");
                }
                case "Limas Trapesium" -> {
                    double sisiAtas = Double.parseDouble(inputFields.get(0).getText());
                    double sisiBawah = Double.parseDouble(inputFields.get(1).getText());
                    double sisiMiring = Double.parseDouble(inputFields.get(2).getText());
                    double tinggi = Double.parseDouble(inputFields.get(3).getText());
                    double tinggiLimas = Double.parseDouble(inputFields.get(4).getText());
                    LimasTrapesium limasTrapesium = new LimasTrapesium(sisiAtas, sisiBawah, sisiMiring, tinggi, tinggiLimas);
                    hasilArea.append("Volume: " + limasTrapesium.hitungVolume() + "\n");
                    hasilArea.append("Luas Permukaan: " + limasTrapesium.hitungLuasPermukaan() + "\n\n");
                }
                case "Prisma Trapesium" -> {
                    double sisiAtas = Double.parseDouble(inputFields.get(0).getText());
                    double sisiBawah = Double.parseDouble(inputFields.get(1).getText());
                    double sisiMiring = Double.parseDouble(inputFields.get(2).getText());
                    double tinggi = Double.parseDouble(inputFields.get(3).getText());
                    double tinggiPrisma = Double.parseDouble(inputFields.get(4).getText());
                    PrismaTrapesium prismaTrapesium = new PrismaTrapesium(sisiAtas, sisiBawah, sisiMiring, tinggi, tinggiPrisma);
                    hasilArea.append("Volume: " + prismaTrapesium.hitungVolume() + "\n");
                    hasilArea.append("Luas Permukaan: " + prismaTrapesium.hitungLuasPermukaan() + "\n\n");
                }
                case "Limas Belah Ketupat" -> {
                    double diagonalA = Double.parseDouble(inputFields.get(0).getText());
                    double diagonalB = Double.parseDouble(inputFields.get(1).getText());
                    double sisi = Double.parseDouble(inputFields.get(2).getText());
                    double tinggiLimas = Double.parseDouble(inputFields.get(3).getText());
                    double tinggiSegitigaTegak = Double.parseDouble(inputFields.get(4).getText());
                    LimasBelahKetupat limasBelahKetupat = new LimasBelahKetupat(diagonalA, diagonalB, sisi, tinggiLimas, tinggiSegitigaTegak);
                    hasilArea.append("Volume: " + limasBelahKetupat.hitungVolume() + "\n");
                    hasilArea.append("Luas Permukaan: " + limasBelahKetupat.hitungLuasPermukaan() + "\n\n");
                }
                case "Prisma Belah Ketupat" -> {
                    double diagonalA = Double.parseDouble(inputFields.get(0).getText());
                    double diagonalB = Double.parseDouble(inputFields.get(1).getText());
                    double sisi = Double.parseDouble(inputFields.get(2).getText());
                    double tinggiPrisma = Double.parseDouble(inputFields.get(3).getText());
                    PrismaBelahKetupat prismaBelahKetupat = new PrismaBelahKetupat(diagonalA, diagonalB, sisi, tinggiPrisma);
                    hasilArea.append("Volume: " + prismaBelahKetupat.hitungVolume() + "\n");
                    hasilArea.append("Luas Permukaan: " + prismaBelahKetupat.hitungLuasPermukaan() + "\n\n");
                }
                case "Juring Lingkaran" -> {
                    double jari = Double.parseDouble(inputFields.get(0).getText());
                    double sudut = Double.parseDouble(inputFields.get(1).getText());
                    JuringLingkaran juringLingkaran = new JuringLingkaran(jari, sudut);
                    hasilArea.append("Luas: " + juringLingkaran.hitungLuas() + "\n");
                    hasilArea.append("Keliling: " + juringLingkaran.hitungKeliling() + "\n\n");
                    
                }
                case "Tembereng Lingkaran" -> {
                    double jari = Double.parseDouble(inputFields.get(0).getText());
                    double sudut = Double.parseDouble(inputFields.get(1).getText());
                    TemberengLingkaran temberengLingkaran = new TemberengLingkaran(jari, sudut);
                    hasilArea.append("Luas: " + temberengLingkaran.hitungLuas() + "\n");
                    hasilArea.append("Keliling: " + temberengLingkaran.hitungKeliling() + "\n\n");
                }
                case "Juring Bola" -> {
                    double jari = Double.parseDouble(inputFields.get(0).getText());
                    double sudut = Double.parseDouble(inputFields.get(1).getText());
                    JuringBola juringBola = new JuringBola(jari, sudut);
                    hasilArea.append("Volume: " + juringBola.hitungVolume() + "\n");
                    hasilArea.append("Luas Permukaan: " + juringBola.hitungLuasPermukaan() + "\n\n");
                }
                case "Tembereng Bola" -> {
                    double tinggi = Double.parseDouble(inputFields.get(0).getText());
                    double jari = Double.parseDouble(inputFields.get(1).getText());
                    TemberengBola temberengBola = new TemberengBola(tinggi, jari);
                    hasilArea.append("Volume: " + temberengBola.hitungVolume() + "\n");
                    hasilArea.append("Luas Permukaan: " + temberengBola.hitungLuasPermukaan() + "\n\n");
                }
                case "Cincin Bola" -> {
                    double jari = Double.parseDouble(inputFields.get(0).getText());
                    double tinggi = Double.parseDouble(inputFields.get(1).getText());
                    CincinBola cincinBola = new CincinBola(jari, tinggi);
                    hasilArea.append("Volume: " + cincinBola.hitungVolume() + "\n");
                    hasilArea.append("Luas Permukaan: " + cincinBola.hitungLuasPermukaan() + "\n\n");
                }
                case "Tabung" -> {
                    double jari = Double.parseDouble(inputFields.get(0).getText());
                    double tinggi = Double.parseDouble(inputFields.get(1).getText());
                    Tabung tabung = new Tabung(jari, tinggi);
                    hasilArea.append("Volume: " + tabung.hitungVolume() + "\n");
                    hasilArea.append("Luas Permukaan: " + tabung.hitungLuasPermukaan() + "\n\n");
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Input harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new GUI().setVisible(true);
    }
}





