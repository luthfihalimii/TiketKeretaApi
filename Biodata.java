import java.util.Scanner;

public class Biodata {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta masukan dari pengguna
        System.out.print("Masukkan NIS: ");
        String nis = scanner.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Jenis Kelamin (L/P): ");
        String jenisKelamin = scanner.nextLine();
        System.out.print("Masukkan Agama: ");
        String agama = scanner.nextLine();

        scanner.close();
        // Menampilkan biodata
        System.out.println("=====================");
        System.out.println("       BIODATA       ");
        System.out.println("=====================");
        System.out.println("NIS: " + nis);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Agama: " + agama);
    }
}

// Nama : Muhammad Luthfi Halimi
// Kelas : X RPL 2
// Absen : 12