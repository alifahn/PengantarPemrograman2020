import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {
        Scanner mobil = new Scanner(System.in);

        System.out.println("~~~~~ Nama/NIM : Annisa Nurul Islami/H071201013 ~~~~~");
        System.out.println("=== Program Menghitung Jumlah Bensin Yang Digunakan ==="); {
            
            System.out.println("Masukkan waktu yang ditempuh dalam perjalanan (jam) :");
            int waktu = mobil.nextInt();
            
            System.out.println("Masukkan kecepatan rata-rata dalam perjalanan (km/jam) :");
            int kecepatanRataRata = mobil.nextInt();

            float efisiensi = 14.0;
            float jarak = kecepatanRataRata * waktu;
            float jumlahBensin = jarak / efisiensi;

            System.out.println("Bensin yang digunakan : " + String.format("%.3f L", jumlahBensin));


        }
        mobil.close();
    }

}