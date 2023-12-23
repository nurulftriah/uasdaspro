import java.io.BufferedReader;
import java.io.InputStreamReader;
import controller.InventarisPerpustakaan;

public class App {

    public static void main(String[] args) throws Exception {
        InventarisPerpustakaan inventarisPerpustakaan = new InventarisPerpustakaan();
        inventarisPerpustakaan.setUp();
        boolean lanjut = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (lanjut) {
            tampilkanMenu();

            System.out.println();
            System.out.print("Pilih Menu : ");
            String pilihan = reader.readLine();
            switch (pilihan) {
                case "1":
                    inventarisPerpustakaan.lihatDaftarBuku();
                    break;
                case "2":
                    inventarisPerpustakaan.pinjam();
                    break;
                case "3":
                    inventarisPerpustakaan.tampilkanLaporanPeminjaman();
                    break;
                default:
                    lanjut = false;
                    break;
            }
        }

        System.out.println("Terima Kasih Yaa, Teruslah Membaca dan Mencari Ilmu, Jangan Pernah Bosan Terhadapnya.");

    }
    
    public static void tampilkanMenu() {
        System.out.println("=====PERPUSTAKAAN HEAVEN OF READER=====");
        System.out.println("Selamat datang di Perpustakaan Heaven of Reader, mau pinjam buku apa hari ini?");    
        System.out.println("1. Lihat daftar buku");
        System.out.println("2. Pinjam");
        System.out.println("3. Laporan Peminjaman");
        System.out.println("4. Keluar");
    }
}