import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
       
       
       Scanner input = new Scanner(System.in);

       int detik;

       detik = input.nextInt();

        int jam, menit, sekon;
        jam = detik / 3600;
        menit = (detik % 3600) / 60;
        sekon = (detik % 3600) % 60;

        System.out.printf("%02d:" , jam);
        System.out.printf("%02d:" , menit);
        System.out.printf("%02d" , sekon);
        
        input.close();
   
    }

    
}
