import java.util.Scanner;

public class SoalSedang1 {

    public static void main(String[] args) {
        // Membuat Scanner untuk menerima input dari user        <-------- Tidak Lupa lagi Scannernyaaaaa
        Scanner input = new Scanner(System.in);
        int bilangan;                                              <--------- Buat variabel untuk program factorial
        int Faktorial = 1; 
        
        System.out.println("Masukkan Bilangan Yang Ingin Dihitung Faktorialnya : ");            <-------- buat sout diikuti Scanner untuk memasukkan bilangan yang ingin dihtung 
        bilangan = input.nextInt();
        
        //Untuk Menghitung Faktorial                      <------ cara untuk menghitung factorialnya
        if (bilangan < 0) {                                          <---------- Kalau bilangan yang diinput kurang dari 0 maka sout dibawah akan muncul
            System.out.println("Angka Tidak Boleh Bilangan Negatif.");

        } else if (bilangan == 0) {                              <-------- Kalau yang diinput adalah 0 maka akan langsung keluar bahwa factorial dari 0 adalah 1 
            System.out.println("Faktorial dari 0 adalah 1");

        } else {                                            <------ Lalu untuk program utamanya int i = 1; digunakan untuk menentukan awal angka factorial yakni 1, untuk i <= bilangan digunakan untuk batas akhir perulangan factorial
            for (int i = 1; i <= bilangan; i++) {                   i++ itu untuk penambahan perulangan. Cara kerja nya misal bilangan = 5. Jadi nanti akan terjadi perulangan perkalian dari 1 sampai 5 dan mendapat hasil = 120.
                Faktorial = Faktorial * i;
            }
            
            //Hasil
            System.out.println("Faktorial dari Angka " + bilangan + " adalah: " + Faktorial);                <---------- Untuk Menampilkan hasil akhir
        }

        input.close();

    }<img width="1920" height="1200" alt="Screenshot 2025-11-03 122354" src="https://github.com/user-attachments/assets/384a1193-9c08-498f-9724-0671735743ef" /> <------ SS Output

}
