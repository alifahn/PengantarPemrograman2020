import java.util.Scanner;

public class Bensin{
    public static void main(String[] args){
        Scanner km = new Scanner(System.in);
        int waktu = km.nextInt();
        int kecepatan = km.nextInt();
        int efisiensi = 14;
        double bensin_total = (double) kecepatan * waktu / efisiensi;
    System.out.printf("Bensin yang digunakan %.3f Liter \n", bensin_total);
    }
}