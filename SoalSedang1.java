import java.util.Scanner;

public class SoalSedang1 {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari user
        Scanner input = new Scanner(System.in);
        int bilangan;
        int Faktorial = 1; 
        
        System.out.println("Masukkan Bilangan Yang Ingin Dihitung Faktorialnya : ");
        bilangan = input.nextInt();
        
        //Untuk Menghitung Faktorial
        if (bilangan < 0) {
            System.out.println("Angka Tidak Boleh Bilangan Negatif.");

        } else if (bilangan == 0) {
            System.out.println("Faktorial dari 0 adalah 1");

        } else {
            for (int i = 1; i <= bilangan; i++) {
                Faktorial = Faktorial * i;
            }
            
            //Hasil
            System.out.println("Faktorial dari Angka " + bilangan + " adalah: " + Faktorial);
        }

        input.close();

    }
}