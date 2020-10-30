import java.util.Scanner;
class Soal03 {
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        System.out.println("Masukkan Ketinggian Menara");
        int h = X.nextInt();
        System.out.println("Masukkan Sudut Elevasi Depan Kapal");
        int a = X.nextInt();
        System.out.println("Masukkan Sudut Elevansi Belakang Kapal");
        int b = X.nextInt();
        double BD, CD, BC;

        BD = Math.tan(Math.toRadians(a))*(double)h;
        CD = Math.tan(Math.toRadians(b))*(double)h;
        BC = BD - CD;
        System.out.println(String.format("BC = %.1f" , BC) + " m ");

    }
}