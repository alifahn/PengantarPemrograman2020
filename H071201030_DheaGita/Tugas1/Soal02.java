// Buatlah program yang merubah detik ke dalam format jam:menit:detik.

// Format Input : Menerima satu inputan dengan tipe data Integer berupa detik.

// Format Output : Menampilkan hasil konversi dari detik ke format jam:menit:detik.

// input 1 = 140153
// output 1 = 38:55:53
// input 2 = 270320
// output 2 = 75:05:20
import java.util.Scanner;

public class Soal02 {
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      System.out.println("=================MULAI=================");
      int detik, menit, jam, sisaDetik, detikAkhir;

      System.out.print("Detik = ");
      detik = userInput.nextInt();

      jam = detik / 3600;
      sisaDetik = detik % 3600;

      menit = sisaDetik / 60;
      detikAkhir = sisaDetik % 60;

      System.out.printf("%02d: \t", jam);
      System.out.printf("%02d: \t", menit);
      System.out.printf("%02d \n", detikAkhir);
      System.out.println("================SELESAI================");
   }
}
