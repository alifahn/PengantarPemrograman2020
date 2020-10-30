import java.util.Scanner;
public class Soal2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();

        for (int i = 1; i <= y; i++){
            for (int j = 0; j < 1; j++){
                System.out.print(i + " ");
                if (i % x == 0) {
                     System.out.println();
                }
            }
        }
        scan.close();
    }
}
