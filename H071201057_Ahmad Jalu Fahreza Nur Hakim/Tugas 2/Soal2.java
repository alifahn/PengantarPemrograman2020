import java.util.Scanner;
public class Soal2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menu, bd, br;

        System.out.println(" * * Menu * *");
        System.out.println("1. Mencari Luas Bangun Datar" + "\n2. Mencari Volume Bangun Ruang");
        System.out.println("Input angka sesuai dengan Menu yang diiginkan :");
        menu = scan.nextInt();

        if (menu == 1) {
            System.out.println("* * Pilih Bangun Datar * *");
            System.out.println("1. Persegi" + "\n2. Persegi Panjang" + "\n3. Segitiga" + "\n4. Lingkaran" + "\n5. Jajar Genjang" + "\n6. Trapesium" + "\n7. Belah Ketupat" + "\n8. Layang-Layang");
            System.out.println("Input angka sesuai dengan nomor bangun datar yang diinginkan :");
            bd = scan.nextInt();

            if (bd == 1) {
                System.out.println("Input Sisi");
                double sisi = scan.nextDouble();
                double luasPersegi = Math.pow(sisi, 2);
                System.out.println("Luas Persegi = " + luasPersegi);
            }
            else if (bd == 2) {
                System.out.println("Input Panjang");
                double panjang = scan.nextDouble();
                System.out.println("Input Lebar");
                double lebar = scan.nextDouble();
                double luasPersegiPanjang = panjang * lebar;
                System.out.println("Luas Persegi Panjang = " + luasPersegiPanjang);
            }
            else if (bd == 3) {
                System.out.println("Input Alas");
                double alas = scan.nextDouble();
                System.out.println("Input Tinggi");
                double tinggi = scan.nextDouble();
                double luasSegitiga = alas * tinggi * 1 / 2;
                System.out.println("Luas Segitiga = " + luasSegitiga);
            }
            else if (bd == 4) {
                System.out.println("Input jari-jari");
                double jari = scan.nextDouble();
                double luasLingkaran = Math.PI * Math.pow(jari, 2);
                System.out.print("Luas Lingkaran = ");
                System.out.printf("%.1f",luasLingkaran);
            }
            else if (bd == 5) {
                System.out.println("Input Alas");
                double alas = scan.nextDouble();
                System.out.println("Input tinggi");
                double tinggi = scan.nextDouble();
                double luasJajar = alas * tinggi;
                System.out.println("Luas Jajaran Genjang = " + luasJajar);
            }
            else if (bd == 6) {
                System.out.println("Input Sisi yang Sejajar");
                double a1 = scan.nextDouble();
                double a2 = scan.nextDouble();
                System.out.println("Input Tinggi");
                double tinggi = scan.nextDouble();
                double luasTrapesium = (a1 + a2) * tinggi * 1/2;
                System.out.println("Luas Trapesium = " + luasTrapesium);
            }
            else if (bd == 7) {
                System.out.println("Input d1 dan d2");
                double d1 = scan.nextDouble();
                double d2 = scan.nextDouble();
                double luasKetupat = d1 * d2 * 1 /2;
                System.out.println("Luas Belah Ketupat = " + luasKetupat);
            }
            else if (bd == 8) {
                System.out.println("Input d1 dan d2");
                double d1 = scan.nextDouble();
                double d2 = scan.nextDouble();
                double luaslayang = d1 * d2 * 1 /2;
                System.out.println("Luas Layang-Layang = " + luaslayang);   
            }
            else System.out.println("Input Tidak Valid");
        }
        else if (menu == 2) {
            System.out.println("* * Pilih Bangun Ruang ");
            System.out.println("1. Kubus" + "\n2. Balok" + "\n3. Limas " + "\n4. Prisma " + "\n5. Tabung" + "\n6. Kerucut" + "\n7. Bola");
            br = scan.nextInt();

            if (br == 1) {
                System.out.println("Input Sisi");
                double sisi = scan.nextDouble();
                double volume = Math.pow(sisi, 3);
                System.out.println("Volume kubus = " + volume);
            }
            else if (br == 2) {
                System.out.println("Input Panjang");
                double p = scan.nextDouble();
                System.out.println("Input Lebar");
                double l = scan.nextDouble();
                System.out.println("Input Tinggi");
                double t = scan.nextDouble();
                double volume = p * l * t;
                System.out.println("Volume Balok = " + volume);
            }
            else if (br == 3) {
                System.out.println("Input Luas alas");
                double la = scan.nextDouble();
                System.out.println("Input Tinggi");
                double t = scan.nextDouble();
                double volume = la * t * 1 / 3;
                System.out.println("Volume Limas = " + volume);
            }
            else if (br == 4){
                System.out.println("Input Luas Alas");
                double la = scan.nextDouble();
                System.out.println("Input Tinggi");
                double t = scan.nextDouble();
                double volume = la * t;
                System.out.println("Volume Prisma = " + volume);
            }
            else if (br == 5) {
                System.out.println("Input Jari-Jari");
                double r = scan.nextDouble();
                System.out.println("Input Tinggi");
                double t = scan.nextDouble();
                double volume = Math.PI * Math.pow(r, 2) * t;
                System.out.println("Volume Tabung = " + volume);
            }
            else if (br == 6) {
                System.out.println("Input Jari-Jari");
                double r = scan.nextDouble();
                System.out.println("Input Tinggi");
                double t = scan.nextDouble();
                double volume = Math.PI * Math.pow(r, 2) * t * 1 / 3;
                System.out.println("Volume Tabung = " + volume);
            }
            else if (br == 7) {
                System.out.println("Input Jari-Jari");
                double r = scan.nextDouble();
                double volume = Math.PI * Math.pow(r, 3) * 4 / 3;
                System.out.println("Volume Bola = " + volume);
            }else System.out.println("Inputan Tidak Valid");

        }else System.out.println("Inputan Tidak Valid");

        scan.close();
    }
}

