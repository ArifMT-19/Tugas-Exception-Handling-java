package Studi_Kasus3_validasiinputumur;
// 105224031 Gionaldo


public class ValidasiUmur {
    public static void main(String[] args) {
        String umur = "dua puluh"; 
        
        System.out.println("Validasi Umur");

        try {
            
            int umurInt = Integer.parseInt(umur); // disini sistem mencoba mengkonversi string "Sepuluh" menjadi integer, yang akan menyebabkan NumberFormatException

            System.out.println("umur anda : " + umur);


        } catch (NumberFormatException e) {
            System.out.println ("ERORR : sistem hanya bisa membaca '20' bukan 'dua puluh'");
            System.out.println("ERORR : Sistem menangkap NumberFormatException!");

        } finally {
            System.out.println("Program selesai dijalankan.");
        }

    
        

    }
}