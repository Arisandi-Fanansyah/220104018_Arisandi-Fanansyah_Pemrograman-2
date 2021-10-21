package latihan;

import java.util.Scanner;

public class tekotek_for {
    public static void main(String[] args) {
        int anak;
        int i;
        Scanner tekotek = new Scanner(System.in);

        System.out.print("Masukkan jumlah anak ayam : ");
        anak = tekotek.nextInt();
        System.out.println("Tek kotek kotek kotek, anak ayam turun berkotek");

        for (i = anak; i > 1; i--) {
            System.out.print("\nAnak ayam turun " + anak);
            anak = i - 1;
            System.out.println(", mati 1 tinggal " + anak + ".");
        }
        System.out.println("\nAnak ayam turunlah 1, mati satu tinggal Induknya");
    }
}
