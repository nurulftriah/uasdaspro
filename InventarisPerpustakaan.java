package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import model.Buku;
import model.DetilPeminjaman;
import model.Reader;
import model.Petugas;
import model.Peminjaman;

public class InventarisPerpustakaan {
    HashMap<String, Buku> books = new HashMap();
    ArrayList<Peminjaman> peminjamans = new ArrayList<>();
    ArrayList<DetilPeminjaman> detilPeminjaman = new ArrayList<>();
    HashMap<String, Reader> readers = new HashMap();
    HashMap<String, Petugas> petugasz = new HashMap();

    public void setUp() {
        Buku buku1 = new Buku();
        Buku buku2 = new Buku();
        Buku buku3 = new Buku();
        Buku buku4 = new Buku();
        Buku buku5 = new Buku();
        Buku buku6 = new Buku();
        Buku buku7 = new Buku();
        Buku buku8 = new Buku();
        Buku buku9 = new Buku();
        Buku buku10 = new Buku();
        
        buku1.setIdBuku("332").setJudulBuku("Laut Bercerita").setPengarang("Leila Chudori").setHargaPinjam(5000).setTersedia(true);
        buku2.setIdBuku("432").setJudulBuku("Madilog").setPengarang("Tan Malaka").setHargaPinjam(6000).setTersedia(true);
        buku3.setIdBuku("231").setJudulBuku("Security Engineering: A Guide to Building Dependable Distributed Systems").setPengarang("Ross J. Anderson").setHargaPinjam(7000).setTersedia(true);
        buku4.setIdBuku("142").setJudulBuku("Network Security Essentials").setPengarang("William Stallings").setHargaPinjam(5000).setTersedia(true); 
        buku5.setIdBuku("486").setJudulBuku("The Data Science Handbook").setPengarang("Field Cady").setHargaPinjam(5000).setTersedia(true); 
        buku6.setIdBuku("358").setJudulBuku("The Art of Data Science").setPengarang("Roger D. Peng dan Elizabeth Matsui").setHargaPinjam(6000).setTersedia(true);
        buku7.setIdBuku("253").setJudulBuku("Bumi Manusia").setPengarang("Pramoedya Ananta Toer").setHargaPinjam(7000).setTersedia(true); 
        buku8.setIdBuku("345").setJudulBuku("Filosofi Teras").setPengarang("Henry Manampiring").setHargaPinjam(7000).setTersedia(true); 
        buku9.setIdBuku("134").setJudulBuku("You do You").setPengarang("Fellexandro Ruby").setHargaPinjam(5000).setTersedia(true); 
        buku10.setIdBuku("249").setJudulBuku("How to Win Friends and Influence People").setPengarang("Dale Carnegie").setHargaPinjam(7000).setTersedia(true); 

        books.put(buku1.getIdBuku(), buku1);
        books.put(buku2.getIdBuku(), buku2);
        books.put(buku3.getIdBuku(), buku3);
        books.put(buku4.getIdBuku(), buku4);
        books.put(buku5.getIdBuku(), buku5);
        books.put(buku6.getIdBuku(), buku6);
        books.put(buku7.getIdBuku(), buku7);
        books.put(buku8.getIdBuku(), buku8);
        books.put(buku9.getIdBuku(), buku9);
        books.put(buku10.getIdBuku(),buku10);
    
        Reader reader1 = new Reader();
        Reader reader2 = new Reader();
        Reader reader3 = new Reader();

        reader1.setIdReader("01").setName("Nami").setEmail("nami@gmail.com");
        reader2.setIdReader("02").setName("Kinasih").setEmail("kinasih@gmail.com");
        reader3.setIdReader("03").setName("Senjani").setEmail("senjani@gmail.com");

        readers.put(reader1.getIdReader(), reader1);
        readers.put(reader2.getIdReader(), reader2);
        readers.put(reader3.getIdReader(), reader3);
        
        Petugas petugas1 = new Petugas();
        Petugas petugas2 = new Petugas();
        Petugas petugas3 = new Petugas();

        petugas1.setIdPetugas("01").setName("Bumi").setEmail("bumi@gmail.com");
        petugas2.setIdPetugas("02").setName("Arkan").setEmail("arkan@gmail.com");
        petugas3.setIdPetugas("03").setName("Laut").setEmail("laut@gmail.com");
        
        petugasz.put(petugas1.getIdPetugas(), petugas1);
        petugasz.put(petugas2.getIdPetugas(), petugas2);
        petugasz.put(petugas3.getIdPetugas(), petugas3);

    }

    public void lihatDaftarBuku() {
        System.out.println();
        System.out.println("======Daftar Buku======");
        for (Map.Entry<String, Buku> buku : books.entrySet()) {
            String key = buku.getKey();
            Buku tBuku = buku.getValue();
            if (tBuku.Tersedia()) {
                System.out.println("ID Buku \t\t : " + key);
                System.out.println("Judul Buku\t\t : " + tBuku.getJudulBuku());
                System.out.println("Pengarang\t\t : " + tBuku.getPengarang());
                System.out.println("Harga Sewa \t\t : " + tBuku.getHargaPinjam());
                System.out.println();
            }

        }
    }

    public Buku getBuku(String idBuku) {
        return books.get(idBuku);
    }

    public Petugas getPetugas(String idPetugas) {
        return petugasz.get(idPetugas);
    }

    public Reader getReader(String idReader) {
        return readers.get(idReader);
    }

    public void pinjam() {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<DetilPeminjaman> tDetilPeminjaman = new ArrayList<>();
        int increment = 0;
        String lanjut = "";
        try {
            do {
                increment++;
                System.out.println();
                System.out.print("Silahkan masukkan id buku\t: ");
                String kodeBuku = input.readLine();
                System.out.print("Jumlah buku yang akan dipinjam\t: ");
                int jumlah = Integer.valueOf(input.readLine());
                System.out.print("Kembali Meminjam? (Y/N)?\t: ");
                lanjut = input.readLine();

                DetilPeminjaman dp = new DetilPeminjaman();
                Buku tBuku = getBuku(kodeBuku);
                dp.setIdDetilPeminjaman("dp" + increment);
                dp.setJudulBuku(tBuku.getJudulBuku());
                dp.setHargaSewa(tBuku.getHargaPinjam());
                dp.setJumlahSewa(jumlah);
                dp.setSubTotal(tBuku.getHargaPinjam() * jumlah);
                tDetilPeminjaman.add(dp);

            } while (lanjut.equalsIgnoreCase("Y"));

            System.out.println("");
            System.out.println("===Berikut Daftar Pinjaman Anda===");
            tampilkanDaftarPeminjaman(tDetilPeminjaman);
            System.out.println("TOTAL: " + hitungTotalPeminjaman(tDetilPeminjaman));
            BufferedReader inputKonfirmasi = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Konfirmasi Peminjaman (Y/N)?");
            String konfirm = "n";
            konfirm = inputKonfirmasi.readLine();
            if (konfirm.equalsIgnoreCase("y")) {
                Peminjaman peminjaman = new Peminjaman();
                peminjaman.setDetilPeminjamans(tDetilPeminjaman)
                        .setIdPeminjaman("P" + peminjamans.size() + 1)
                        .setReader(getReader("01"))
                        .setPetugas(getPetugas("02"))
                        .setTanggal(LocalDate.now())
                        .setTotal(hitungTotalPeminjaman(tDetilPeminjaman));
                peminjamans.add(peminjaman);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void tampilkanDaftarPeminjaman(ArrayList<DetilPeminjaman> dp) {
        for (DetilPeminjaman detilPeminjaman : dp) {
            System.out.println("Judul Buku\t : " + detilPeminjaman.getJudulBuku());
            System.out.println("Harga \t \t : " + detilPeminjaman.getHargaSewa());
            System.out.println("Jumlah \t \t : " + detilPeminjaman.getJumlahSewa());
            System.out.println("");
        }
    }

    public int hitungTotalPeminjaman(ArrayList<DetilPeminjaman> dp) {
        int total = 0;
        for (DetilPeminjaman detilPeminjaman : dp) {
            total += detilPeminjaman.getSubTotal();
        }
        return total;
    }

   public void tampilkanLaporanPeminjaman() {
        for (Peminjaman peminjaman : peminjamans) {
            System.err.println();
            System.out.println("Kode Peminjaman \t : "+peminjaman.getIdPeminjaman());
            System.out.println("Tanggal transaksi \t : "+peminjaman.getTanggal());
            System.out.println("Petugas \t \t : "+peminjaman.getPetugas().getName());
            System.out.println("Reader \t \t \t : "+peminjaman.getReader().getName());
            System.out.println("===========================================");
            ArrayList<DetilPeminjaman> detilPeminjamans = peminjaman.getDetilPeminjamans();
            for (DetilPeminjaman dp : detilPeminjamans) {
                System.out.println("Judul Buku \t \t : " + dp.getJudulBuku());
                System.out.println("Jumlah Pinjam \t \t : " + dp.getJumlahSewa());
                System.out.println("Subtotal \t \t : " + dp.getSubTotal());
            }
            System.out.println("===========================================");
            System.out.println("Total \t \t : "+peminjaman.getTotal());
        }
    }

}