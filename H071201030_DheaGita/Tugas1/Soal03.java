// Sebuah kapal sedang berlabuh dalam posisi menghadap ke menara (lihat pada gambar). Seorang pengamat (berada di puncak Menara) ingin menghitung panjang kapal tersebut dengan mengetahui ketinggian menara (h), sudut elevasi pengamat  ujung depan kapal (b) dan sudut elevasi pengamat terhadap ujung belakang kapal (a). Buatlah program untuk menghitung panjang kapal tersebut.

// Format input: Menerima tiga inputan h, a, dan b secara berurutan yang menyatakan ketinggian menara dalam satuan meter, sudut elevasi terhadap ujung depan kapal dan sudut elevasi terhadap ujuang belakang kapal (90 > a > b).

// Format output: Menampilkan panjang kapal dengan tipe data float atau double (satu angka di belakang koma) dalam satuan menit

// input  1 = 100 60 45
// output 1 = 73.2 m
// input 2 = 120 87 50
// output 2 = 2346.7
import java.util.Scanner;

public class Soal03 {
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      System.out.println("=================MULAI=================");
      double h, a, b, c, d, panjangKapal;
      // c = jarak menara ke ujung belakang kapal
      // d = jarak menara ke ujung b depan kapal

      System.out.println("Input data : ");
      System.out.print("h (dalam meter) = ");
      h = userInput.nextDouble();
      System.out.print("a = ");
      a = userInput.nextDouble();
      System.out.print("b = ");
      b = userInput.nextDouble();

      c = Math.tan(Math.toRadians(a)) * h;
      d = Math.tan(Math.toRadians(b)) * h;
      panjangKapal = c - d;

      System.out.printf("Panjang kapal = %.1f", panjangKapal);
      System.out.println(" m");

      System.out.println("================SELESAI================");
   }
}
