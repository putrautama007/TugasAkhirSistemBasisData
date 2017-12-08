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
public class Cabang {
    private int no_cabang;
    private String nama_cabang;
    private String alamat;
    
    public Cabang(int no_cabang,String nama_cabang, String alamat){
        this.no_cabang = no_cabang;
        this.nama_cabang= nama_cabang;
        this.alamat = alamat;
    }

    public int getNo_cabang() {
        return no_cabang;
    }

    public void setNo_cabang(int no_cabang) {
        this.no_cabang = no_cabang;
    }

    public String getNama_cabang() {
        return nama_cabang;
    }

    public void setNama_cabang(String nama_cabang) {
        this.nama_cabang = nama_cabang;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
}
