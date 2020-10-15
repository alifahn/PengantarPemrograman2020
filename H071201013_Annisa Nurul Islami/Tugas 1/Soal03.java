import java.util.Scanner;

public class Soal03 {
    public static void main(String[] args) {
        Scanner kapal = new Scanner(System.in);

        System.out.println("~~~~~ Nama/NIM : Annisa Nurul Islami/H071201013 ~~~~~");
        System.out.println("===== Program Menghitung Panjang Kapal ====="); 
            // h = tinggi menara dalam satuan meter
            // a = sudut elevasi terhadap ujung depan kapal (a < 90 derajat)
            // b = sudut elevasi terhadap ujung belakang kapal (b < a)
            System.out.println("Masukkan tinggi menara : ");
            double h = kapal.nextDouble();
            
            System.out.println("Masukkan sudut a : ");
            double a = kapal.nextDouble();
    
            System.out.println("Masukkan sudut b : ");
            double b = kapal.nextDouble();
            
            double sudutA = Math.tan(Math.toRadians(a));
            // panjangA = jarak dari ujung belakang kapal ke menara
            double panjangA = sudutA * h;
    
            double sudutB = Math.tan(Math.toRadians(b));
            // panjangB = jarak dari ujung depan kapal ke menara
            double panjangB = sudutB * h;
    
            double panjangKapal = panjangA - panjangB;
            System.out.printf("Panjang Kapal : %.1f m", panjangKapal);
        
        kapal.close();
    }
    
    
}