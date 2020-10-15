import java.util.Scanner;
public class Soal02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Detik");
        int X = input.nextInt();
        int jam;
        jam = X/3600;
        int menit;
        menit = (X/60) - (jam*60);
        int detik;
        detik = X - (menit*60) - (jam*3600);

        System.out.print(jam);
        System.out.print(":" + menit);
        System.out.print(":" + detik);

        

    }
}
