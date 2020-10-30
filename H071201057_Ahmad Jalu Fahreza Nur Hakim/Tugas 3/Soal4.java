import java.util.Scanner;
public class Soal4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int data[] = {100000, 50000, 20000, 10000, 5000, 2000, 1000};

        int harga = scan.nextInt();
        int bayar = scan.nextInt();

        int kembali = bayar - harga;

        for (int i = 0; i < 7; i++){
            int jumlah = kembali / data[i];
            kembali = kembali - (data[i] * jumlah);

            System.out.printf("\n%d %s %d", jumlah, " Uang Rp.",data[i]);
        }
        scan.close();
    }
}
