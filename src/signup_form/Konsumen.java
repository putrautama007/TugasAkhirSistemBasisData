/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package signup_form;

/**
 *
 * @author DBSS075
 */
public class Konsumen {
    private int no_antre;
    private String nama_konsumen;
    private String alamat_konsumen;
    private String no_resep;
    private int no_cabang;
    
    public Konsumen(int no_antre,String nama_konsumen,String alamat_konsumen,String no_resep,int no_cabang){
        this.no_antre= no_antre;
        this.nama_konsumen = nama_konsumen;
        this.alamat_konsumen = alamat_konsumen;
        this.no_resep = no_resep;
        this.no_cabang = no_cabang;
    }

    public int getNo_antre() {
        return no_antre;
    }

    public void setNo_antre(int no_antre) {
        this.no_antre = no_antre;
    }

    public String getNama_konsumen() {
        return nama_konsumen;
    }

    public void setNama_konsumen(String nama_konsumen) {
        this.nama_konsumen = nama_konsumen;
    }

    public String getAlamat_konsumen() {
        return alamat_konsumen;
    }

    public void setAlamat_konsumen(String alamat_konsumen) {
        this.alamat_konsumen = alamat_konsumen;
    }

    public String getNo_resep() {
        return no_resep;
    }

    public void setNo_resep(String no_resep) {
        this.no_resep = no_resep;
    }

    public int getNo_cabang() {
        return no_cabang;
    }

    public void setNo_cabang(int no_cabang) {
        this.no_cabang = no_cabang;
    }
    
}
