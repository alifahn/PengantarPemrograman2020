import java.util.Scanner;

class Detik{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int input_detik = input.nextInt();
        int detik = (input_detik % 3600) % 60;
        int menit = (input_detik % 3600) / 60 ;
        int jam = input_detik / 3600;

        System.out.printf("%02d : %02d : %02d \n", jam, menit, detik);
    }
}