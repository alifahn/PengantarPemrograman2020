import java.util.Scanner;
public class Soal3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int a = 0;
        int b = 1;
        int next;

        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++){
            next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
        scan.close();
    }
}
