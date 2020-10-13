// Buatlah program yang menghitung dan menunjukkan jumlah liter bahan bakar yang dihabiskan untuk perjalanan, menggunakan mobil dengan efisiensi 14 Km/L.

// Format Input : Menerima dua inputan dengan tipe data Integer berupa waktu yang ditempuh dalam perjalanan (jam) dan kecepatan rata-rata dalam perjalanan (km/jam) secara berurutan.

// Format Output : Menampilkan jumlah bensin yang digunakan dalam perjalanan tersebut dengan tipe data float/double (tiga angka dibelakang koma).

// input 1 = 10 85
// output 1 = Bensin Yang Digunakan : 60,714 L
// input 2 = 8 10
// output 2 = Bensin Yang Digunakan = 51,429 L
import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("=================MULAI=================");
        int jarak, waktu, kecepatan;
        float liter;
        jarak = 14;

        // System.out.print("Waktu tempuh (jam)        : ");
        waktu = userInput.nextInt();
        // System.out.print("Kecepatan tempuh (km/jam) : ");
        kecepatan = userInput.nextInt();

        liter = (kecepatan * waktu) / (float) jarak;
        System.out.printf("Bensin Yang Digunakan     : %.3f", liter);
        System.out.println(" L");

        System.out.println("================SELESAI================");
    }
}