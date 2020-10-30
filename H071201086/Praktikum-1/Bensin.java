import java.util.Scanner;
public class Bensin {
    static Scanner x = new Scanner(System.in);
    public static void main(String[] args) {
        int jam = x.nextInt();
        int kecepatan = x.nextInt();
        
        double bensin = (double)kecepatan/jam/14*100;

        System.out.printf("bensin yang digunakan = %.3f L\n", bensin);

    }
}