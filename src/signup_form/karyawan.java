/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package signup_form;

import java.sql.Date;

/**
 *
 * @author DBSS075
 */
public class karyawan {
    private String id_karyawan;
    private String nama_karyawan;
    private String JK;
    private String alamat_karyawan;
    private Date tanggal_lahir;
    private String kota_lahir;
    private String no_tlp_karyawan;
    private int no_cabang;
    
    public karyawan( String id_karyawan,String nama_karyawan,String JK,
            String alamat_karyawan,Date tanggal_lahir,String kota_lahir,
            String no_tlp_karyawan, int no_cabang){
        this.id_karyawan = id_karyawan;
        this.nama_karyawan = nama_karyawan;
        this.JK= JK;
        this.alamat_karyawan= alamat_karyawan;
        this.tanggal_lahir= tanggal_lahir;
        this.kota_lahir= kota_lahir;
        this.no_tlp_karyawan= no_tlp_karyawan;
        this.no_cabang= no_cabang;
        
    }

    public String getId_karyawan() {
        return id_karyawan;
    }

    public void setId_karyawan(String id_karyawan) {
        this.id_karyawan = id_karyawan;
    }

    public String getNama_karyawan() {
        return nama_karyawan;
    }

    public void setNama_karyawan(String nama_karyawan) {
        this.nama_karyawan = nama_karyawan;
    }

    public String getJK() {
        return JK;
    }

    public void setJK(String JK) {
        this.JK = JK;
    }

    public String getAlamat_karyawan() {
        return alamat_karyawan;
    }

    public void setAlamat_karyawan(String alamat_karyawan) {
        this.alamat_karyawan = alamat_karyawan;
    }

    public Date getTanggal_lahir() {
        return tanggal_lahir;
    }

    public void setTanggal_lahir(Date tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public String getKota_lahir() {
        return kota_lahir;
    }

    public void setKota_lahir(String kota_lahir) {
        this.kota_lahir = kota_lahir;
    }

    public String getNo_tlp_karyawan() {
        return no_tlp_karyawan;
    }

    public void setNo_tlp_karyawan(String no_tlp_karyawan) {
        this.no_tlp_karyawan = no_tlp_karyawan;
    }

    public int getNo_cabang() {
        return no_cabang;
    }

    public void setNo_cabang(int no_cabang) {
        this.no_cabang = no_cabang;
    }
    
    
}
