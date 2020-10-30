import java.util.Scanner;
class Soal1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int negatif = 0;
        int positif = 0;
        int ganjil = 0;
        int genap = 0;
        int bil1, bil2, bil3, bil4, bil5;

        try {
        bil1 = scan.nextInt();
        bil2 = scan.nextInt();
        bil3 = scan.nextInt();
        bil4 = scan.nextInt();
        bil5 = scan.nextInt(); scan.close();
        
        
        if (bil1 % 2 == 0) {
            genap += 1;
        }else ganjil +=1;

        if (bil2 % 2 == 0) {
            genap += 1;
        }else ganjil += 1;

        if (bil3 % 2 == 0) {
            genap += 1;
        }else ganjil += 1;

        if (bil4 % 2 == 0) {
            genap += 1;
        }else ganjil += 1;

        if (bil5 % 2 == 0) {genap += 1;}
        else ganjil += 1;

        if (bil1 > 0) {positif += 1;}
        else if (bil1 < 0) {negatif += 1;}
            
        if (bil2 > 0) {positif += 1;}
        else if (bil2 < 0){negatif += 1;}
            
        if (bil3 > 0) {positif += 1;}
        else if (bil3 < 0) {negatif += 1;}

        if (bil4 > 0) {positif += 1;}
        else if (bil4 < 0) {negatif += 1;}
            
        if (bil5 > 0) {positif += 1;}
        else if (bil5 < 0) {negatif += 1;}

        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Inputan Tidak Valid");
        }

        System.out.println(genap + " Angka Genap\n" + ganjil + " Angka Ganjil\n" + positif +" Angka Positif\n" + negatif + " Angka Negatif");
    }


}