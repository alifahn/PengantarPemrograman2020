import java.util.Scanner;
public class Soal01 {
    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);
        int waktu;
        int kecepatan;

        System.out.println("Waktu Perjalanan (Jam) :");
        waktu = obj.nextInt();
        System.out.println("Kecepatan Kendaraan :");
        kecepatan = obj.nextInt();
        double jarak = kecepatan * waktu;
        double bensin = jarak/14;
        System.out.println("Total Bensin yang Digunakan :" + String.format("%.3f", bensin) + " liter ");

    }
    
}
