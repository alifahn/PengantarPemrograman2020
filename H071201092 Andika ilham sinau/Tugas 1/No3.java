import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        float h,a,b;
        h = user.nextFloat();
        a = user.nextFloat();
        b = user.nextFloat();

        float jarak1, jarak2;
        jarak1 = (float) (Math.tan(Math.toRadians(b)) * h);
        jarak2 = (float) (Math.tan(Math.toRadians(a)) * h);
       
        float panjangkapal = jarak2 - jarak1;

        System.out.printf("%.1f m" , panjangkapal);
        
        
    }
    
}
