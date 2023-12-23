package model;
public class Buku {
    private String idBuku;
    private String judulBuku;
    private String pengarang;
    private int hargaPinjam;
    private boolean tersedia;

    public Buku setIdBuku(String idBuku){
        this.idBuku = idBuku;
        return this;
    }
    public Buku setJudulBuku(String judulBuku){
        this.judulBuku = judulBuku;
        return this;
    }
    public Buku setPengarang(String pengarang){
        this.pengarang = pengarang;
        return this;
    }    
    public Buku setHargaPinjam(int hargaPinjam){
        this.hargaPinjam = hargaPinjam;
        return this;
    }
    public Buku setTersedia(boolean tersedia){
        this.tersedia = tersedia;
        return this;
    }

    public String getIdBuku() {
        return idBuku;
    }

    public String getJudulBuku() {
        return judulBuku;
    }
    public String getPengarang() {
        return pengarang;
    }
    public int getHargaPinjam () {
        return hargaPinjam;
    }

    public boolean Tersedia() {
        return tersedia;
    }
}
