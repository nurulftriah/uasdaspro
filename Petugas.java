package model;
public class Petugas extends Akun{
    private String idPetugas;

    public Petugas setIdPetugas(String idPetugas){
        this.idPetugas = idPetugas;
        return this;
    }
    public String getIdPetugas(){
        return this.idPetugas;
    }
    
}
