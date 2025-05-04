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
                
                // Polymorphism - Persegi Panjang
                BangunDatar persegiPanjang = new PersegiPanjang(3,7);
                persegiPanjang.hitungLuas();
                persegiPanjang.hitungKeliling();

                System.out.println("");

                // Polymorphism - Segitiga
                BangunDatar segitiga = new Segitiga(3,4,5,6);
                segitiga.hitungLuas();
                segitiga.hitungKeliling();

                System.out.println("");

                // Polymorphism - Layang - Layang
                BangunDatar layangLayang = new LayangLayang(3,4,5,6);
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
                
                System.out.println("");

                //Insiasi Tabung
                Tabung tabung = new Tabung(7, 10);
                tabung.hitungVolume();
                tabung.hitungLuasPermukaan();
                
                System.out.println("");
                    
                //Inisiasi Kerucut
                Kerucut kerucut = new Kerucut(7, 10,13);
                kerucut.hitungVolume();
                kerucut.hitungLuasPermukaan(); 
                
                System.out.println("");
                    
                //Inisiasi Kerucut
                JuringBola juringBola = new JuringBola(7,180);
                juringBola.hitungVolume();
                juringBola.hitungLuasPermukaan(); 
                
                System.out.println("");
                LimasSegitiga limasSegitiga = new LimasSegitiga(5,10,6,4);
                limasSegitiga.hitungVolume();
                limasSegitiga.hitungLuasPermukaan();
                
                System.out.println("");
                PrismaSegiTiga prismaSegiTiga = new PrismaSegiTiga(5,6,5,5,10);
                prismaSegiTiga.hitungVolume();
                prismaSegiTiga.hitungLuasPermukaan();
                
                System.out.println("");
                Segitiga sisiLimas = new Segitiga(3,5);
                LimasSegiempat limasSegiempat = new LimasSegiempat(6,4,sisiLimas,sisiLimas);
                limasSegiempat.hitungVolume();
                limasSegiempat.hitungLuasPermukaan();
                
                System.out.println("");
                KerucutTerpancung kerucutTerpancung = new KerucutTerpancung (6,3,2,1);
                kerucutTerpancung.hitungVolume();
                kerucutTerpancung.hitungLuasPermukaan();
<<<<<<< HEAD

                System.out.println("");
                TemberengBola temberengBola = new TemberengBola(7, 3);
                temberengBola.hitungVolume();
                temberengBola.hitungLuasPermukaan();
=======
                
                System.out.println("");
                TemberengBola temberengBola = new TemberengBola(7, 3); // contoh: jari-jari = 7, tinggi = 3
                temberengBola.hitungVolume();
                temberengBola.hitungLuasPermukaan();

>>>>>>> 9e3ef174b445a95eeb00f9f4894ded8b9e4d7e71
            }
        }
