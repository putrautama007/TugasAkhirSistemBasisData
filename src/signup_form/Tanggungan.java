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
public class Tanggungan {
    private String nama;
    private Date ttl;
    private String JK;
    private String hubungan;
    private String id_karyawan;
    
    public Tanggungan(String nama,
     Date ttl,
     String JK,
     String hubungan,
     String id_karyawan){
        this.nama= nama;
        this.ttl = ttl;
        this.JK =JK;
        this.hubungan = hubungan;
        this.id_karyawan = id_karyawan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getTtl() {
        return ttl;
    }

    public void setTtl(Date ttl) {
        this.ttl = ttl;
    }

    public String getJK() {
        return JK;
    }

    public void setJK(String JK) {
        this.JK = JK;
    }

    public String getHubungan() {
        return hubungan;
    }

    public void setHubungan(String hubungan) {
        this.hubungan = hubungan;
    }

    public String getId_karyawan() {
        return id_karyawan;
    }

    public void setId_karyawan(String id_karyawan) {
        this.id_karyawan = id_karyawan;
    }
    
}
