import java.util.Scanner;
public class Soal5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            float m = scan.nextFloat();
            if (0 <= m && m < 360) {
                int sec = (int) (m * 86400) / 360;
                int jam = (sec / 3600) + 6;
                int menit = (sec % 3600) / 60;
                int detik = (sec % 3600) % 60;
                if (m >= 0 && m < 90) {
                    System.out.println("Selamat Pagi");
                } else if (m >= 90 && m < 150) {
                    System.out.println("Selamat Siang");
                } else if (m >= 150 && m < 195) {
                    System.out.println("Selamat Sore");
                } else if (m >= 195 && m < 270) {
                    System.out.println("Selamat Malam");
                } else if (m >= 270 && m < 360) {
                    System.out.println("Tengah Malam");
                }
                System.out.printf("%02d:%02d:%02d \n", jam, menit, detik);
            } else {
                System.out.println("End of File");
            }
        }
        scan.close();
    }
}