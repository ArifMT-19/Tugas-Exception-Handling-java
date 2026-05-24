package aritmatika;

import java.util.Scanner;

public class MainKalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Kalkulator Pembagian Sederhana ===");

        try {
            System.out.print("Masukkan angka pembilang: ");
            int pembilang = input.nextInt();
            
            System.out.print("Masukkan angka penyebut (jangan 0): ");
            int penyebut = input.nextInt();
            
            int hasil = pembilang / penyebut;
            System.out.println("Hasil: " + pembilang + " / " + penyebut + " = " + hasil);
            
        } catch (ArithmeticException e) {
            System.out.println("Error Aritmatika: Pembagian dengan nol (0) tidak didefinisikan.");
        } catch (Exception e) {
            System.out.println("Error Input: Pastikan Anda memasukkan format angka yang benar.");
        } finally {
            System.out.println("Sesi kalkulator selesai.");
            input.close();
        }
    }
}