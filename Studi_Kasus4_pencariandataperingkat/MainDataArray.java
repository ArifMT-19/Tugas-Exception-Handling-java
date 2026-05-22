package Studi_Kasus4_pencariandataperingkat;

import java.util.Scanner;

public class MainDataArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] mahasiswa = {"Gio", "Zaki", "Alex", "Chandra", "Dimas"};

        System.out.print("Masukkan peringkat yang ingin dicari (1-5): ");
        
        try {
            int peringkat = in.nextInt();

            int indeks = peringkat - 1;

            String ketemu = mahasiswa[indeks];

            System.out.println("Peringkat ke-" + indeks + ", Nama Mahasiswa : " + ketemu);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error : Peringkat di luar batas");
        }
        finally {
            in.close();
            System.out.println("Selesai");
        }
    }
}
