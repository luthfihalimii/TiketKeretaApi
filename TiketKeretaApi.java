import java.util.Scanner;

public class TiketKeretaApi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menampilkan daftar jurusan dan harga tiket
        System.out.println("Jurusan | Bisnis | Eksekutif | Harga Tiket");
        System.out.println("------- | ------ | --------- | --------");
        System.out.println("Cikampek-Tuparev | 20000 | 30000 | ");
        System.out.println("Johar-Bypass | 10000 | 20000 | ");
        System.out.println("Klari-Badami | 15000 | 25000 | ");

        // Memasukkan input dari user
        System.out.print("Masukkan jurusan: ");
        String jurusan = scanner.nextLine();
        System.out.print("Masukkan jenis kelas (Bisnis/Eksekutif): ");
        String kelas = scanner.nextLine();
        
        scanner.close();

        // Menghitung harga tiket
        int hargaTiket = 0;
        if (jurusan.equals("Cikampek-Tuparev")) {
            if (kelas.equals("Bisnis")) {
                hargaTiket = 20000;
            } else if (kelas.equals("Eksekutif")) {
                hargaTiket = 30000;
            }
        } else if (jurusan.equals("Johar-Bypass")) {
            if (kelas.equals("Bisnis")) {
                hargaTiket = 10000;
            } else if (kelas.equals("Eksekutif")) {
                hargaTiket = 20000;
            }
        } else if (jurusan.equals("Klari-Badami")) {
            if (kelas.equals("Bisnis")) {
                hargaTiket = 15000;
            } else if (kelas.equals("Eksekutif")) {
                hargaTiket = 25000;
            }
        }

        // Menampilkan informasi tiket
        System.out.println("======== Informasi Tiket Kereta Api =========");
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Kelas: " + kelas);
        System.out.println("Harga Tiket: Rp" + hargaTiket);
        System.out.println("Terima kasih telah menggunakan layanan kami!");
        System.out.println("=============================================");
    }
}

// Nama : Muhammad Luthfi Halimi
// Kelas : X RPL 2
// Absen : 12