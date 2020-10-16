import java.util.Scanner;
public class Waktu {
    static Scanner x = new Scanner(System.in);
    public static void main(String[] args) {
        int waktu = x.nextInt();

        int jam = waktu/3600;
        int a = waktu % 3600;
        int menit = waktu/60;
        int detik = a - (menit *60);

        System.out.printf("%d:%d:%d\n" , jam, menit, detik);
    }
}