package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Peminjaman {
    private String idPeminjaman;
    private Reader reader;
    private Petugas petugas;
    private int total;
    private LocalDate tanggal;
    private ArrayList<DetilPeminjaman> detilPeminjamans;

    public String getIdPeminjaman() {
        return idPeminjaman;
    }

    public Peminjaman setIdPeminjaman(String idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
        return this;
    }

    public Reader getReader() {
        return reader;
    }

    public Peminjaman setReader(Reader reader) {
        this.reader = reader;
        return this;
    }

    public Petugas getPetugas() {
        return petugas;
    }

    public Peminjaman setPetugas(Petugas petugas) {
        this.petugas = petugas;
        return this;
    }

    public int getTotal() {
        return total;
    }

    public Peminjaman setTotal(int total) {
        this.total = total;
        return this;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public Peminjaman setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
        return this;
    }

    public ArrayList<DetilPeminjaman> getDetilPeminjamans() {
        return detilPeminjamans;
    }

    public Peminjaman setDetilPeminjamans(ArrayList<DetilPeminjaman> detilPeminjamans) {
        this.detilPeminjamans = detilPeminjamans;
        return this;
    }

}