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
class FakturPenjualan {
    private String id_faktur;
    private String kode_obat;
    private int jml_obat;
    private Date tgl_jual;
    private String id_karyawan;
    
    public FakturPenjualan(String id_faktur,String kode_obat,int jml_obat,Date tgl_jual,String id_karyawan){
        this.id_faktur = id_faktur;
        this.kode_obat = kode_obat;
        this.jml_obat = jml_obat;
        this.tgl_jual = tgl_jual;
        this.id_karyawan = id_karyawan;
    }

    public String getId_faktur() {
        return id_faktur;
    }

    public void setId_faktur(String id_faktur) {
        this.id_faktur = id_faktur;
    }

    public String getKode_obat() {
        return kode_obat;
    }

    public void setKode_obat(String kode_obat) {
        this.kode_obat = kode_obat;
    }

    public int getJml_obat() {
        return jml_obat;
    }

    public void setJml_obat(int jml_obat) {
        this.jml_obat = jml_obat;
    }

    public Date getTgl_jual() {
        return tgl_jual;
    }

    public void setTgl_jual(Date tgl_jual) {
        this.tgl_jual = tgl_jual;
    }

    public String getId_karyawan() {
        return id_karyawan;
    }

    public void setId_karyawan(String id_karyawan) {
        this.id_karyawan = id_karyawan;
    }
     
}
