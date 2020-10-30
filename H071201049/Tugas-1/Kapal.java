import java.util.Scanner;

class Kapal{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double h = input.nextDouble();
        double a = input.nextDouble();
        double b = input.nextDouble();
        double sud1 = Math.tan(Math.toRadians(a)) * (double) h;
        double sud2 = Math.tan(Math.toRadians(b)) * (double) h;
        double pk = sud1-sud2;

        System.out.printf("%.1f m\n", pk);
    
    }
}