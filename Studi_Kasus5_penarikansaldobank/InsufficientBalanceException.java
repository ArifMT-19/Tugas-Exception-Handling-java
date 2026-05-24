package Studi_Kasus5_penarikansaldobank;

public class InsufficientBalanceException {
    public static void main(String[] args) {
        double balance = 1000.0; // Saldo awal
        double withdrawalAmount = 1500.0; // Jumlah penarikan

        try{
            if(withdrawalAmount > balance){
                throw new Exception("Saldo tidak CUKUP");
            } else {
                balance -= withdrawalAmount;
                System.out.println("Penarikan berhasil. Sisa saldo: " + balance);
            }
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Program Selesai.");
        }
    }
}
