public class MainDataNull {
    public static void main(String[] args) {
        String namaLengkap = ambilNamaPenggunaDariDatabase();

        try {
            String namaKapital = namaLengkap.toUpperCase();
            System.out.println("Nama pengguna: " + namaKapital);
        } catch (NullPointerException e) {
            System.out.println("Nama pengguna belum diisi.");
        }

        System.out.println("Program tetap berjalan.");
    }

    public static String ambilNamaPenggunaDariDatabase() {
        return null;
    }
}