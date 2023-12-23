package model;

public class DetilPeminjaman {
    private String idDetilPeminjaman;
    private Peminjaman peminjaman;
    private String judulBuku;
    private int hargaSewa;
    private int jumlahSewa;
    private int subTotal;
    
    public String getIdDetilPeminjaman() {
        return idDetilPeminjaman;
    }

    public void setIdDetilPeminjaman(String idDetilPeminjaman) {
        this.idDetilPeminjaman = idDetilPeminjaman;
    }

    public Peminjaman getPeminjaman() {
        return peminjaman;
    }

    public void setPeminjaman(Peminjaman peminjaman) {
        this.peminjaman = peminjaman;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }
    
    public int getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(int hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    public int getJumlahSewa() {
        return jumlahSewa;
    }

    public void setJumlahSewa(int jumlahSewa) {
        this.jumlahSewa = jumlahSewa;
    }

    public int getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }

}