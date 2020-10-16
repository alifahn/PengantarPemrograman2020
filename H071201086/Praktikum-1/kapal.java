import java.util.Scanner;
public class kapal {
static Scanner x = new Scanner (System.in);
public static void main(String[] args) {
    int t = x.nextInt();
    int a = x.nextInt();
    int b = x.nextInt();

    if (90<a) {
        System.out.println("a harus lebih kecil dari 90");
    }else if (a>b){
        double kapal = (double)t*(Math.tan(Math.tpRadians(a))-Math.tan(Math.toRadians(b)));  
        System.out.printf("%.1f m\n", kapal);
    }else {
        System.out.println("a harus lebih besar dari b, input ulang nilai a dan b");

    }
}
}