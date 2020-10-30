import java.util.Scanner;
public class Soal1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        
        scan.close();

        if (x < y) {
            while (x<=y) {
                if (x % 2 == 0) {
                    if (x == 0) {
                        System.out.println(x + " nol");
                    }
                    if (x > 0) {
                        System.out.println(x + " Genap Positif");
                    }else if (x < 0) {
                        System.out.println(x + " Genap Negatif");
                    }
                }
                else if ((x % 2 == 1) | (x % 2 == -1)) {
                    if (x > 0) {
                        System.out.println(x + " Ganjil Positif");
                    }else if (x < 0) {
                        System.out.println(x + " Ganjil Negatif");
                    }
                }x++;
            }
        }
        else if (x > y) {
            while (x>=y) {
                if (x % 2 == 0) {
                    if (x == 0) {
                        System.out.println(x + " nol");
                    }
                    if (x > 0) {
                        System.out.println(x + " Genap Positif");
                    }else if (x < 0) {
                        System.out.println(x + " Genap Negatif");
                    }
                }
                else if ((x % 2 == 1) | (x % 2 == -1)) {
                    if (x > 0) {
                        System.out.println(x + " Ganjil Positif");
                    }else if (x < 0) {
                        System.out.println(x + " Ganjil Negatif");
                    }
                }x--;
                }
            }
    }
}
