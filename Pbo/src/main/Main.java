        package main;

        import bangunDatar.*;
        import bangunRuang.*;
        
        public class Main {
            public static void main(String[] args) {
                // Polymorphism - Lingkaran
                BangunDatar lingkaran = new Lingkaran(7);
                lingkaran.hitungLuas();
                lingkaran.hitungKeliling();

                System.out.println("");

                // Polymorphism - Persegi
                BangunDatar persegi = new Persegi(3);
                persegi.hitungLuas();
                persegi.hitungKeliling();

                System.out.println("");

                // Polymorphism - Segitiga
                BangunDatar segitiga = new Segitiga(3,4,5,6);
                segitiga.hitungLuas();
                segitiga.hitungKeliling();

                System.out.println("");

                // Polymorphism - Layang - Layang
                BangunDatar layangLayang = new LayangLayang(3,4,5,6,8,9);
                layangLayang.hitungLuas();
                layangLayang.hitungKeliling();

                System.out.println("");
                
                //Inisiasi Kubus
                Kubus kubus = new Kubus(5);
                kubus.hitungVolume();
                kubus.hitungLuasPermukaan();
                
                System.out.println("");

                //Inisisasi Balok
                Balok balok = new Balok(4,6,8);
                balok.hitungVolume();
                balok.hitungLuasPermukaan();
                
                System.out.println("");
                
                //inisiasi Bola
                Bola bola = new Bola(7);
                bola.hitungVolume();
                bola.hitungLuasPermukaan();
                
                //Insiasi Tabung
                Tabung tabung = new Tabung(7, 10);
                tabung.hitungVolume();
                tabung.hitungLuasPermukaan();

            }
        }
