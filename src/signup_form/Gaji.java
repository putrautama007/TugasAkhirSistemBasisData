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
public class Gaji {
    private String nama;
    private String jabatan;
    private int gaji_pokok;
    private int tunjangan;
    private String id_karyawan;
    
    public Gaji(String nama,String jabatan,
            int gaji_pokok,int tunjangan,String id_karyawan){
        this.nama = nama;
        this.jabatan = jabatan;
        this.gaji_pokok = gaji_pokok;
        this.tunjangan = tunjangan;
        this.id_karyawan = id_karyawan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public int getGaji_pokok() {
        return gaji_pokok;
    }

    public void setGaji_pokok(int gaji_pokok) {
        this.gaji_pokok = gaji_pokok;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    public String getId_karyawan() {
        return id_karyawan;
    }

    public void setId_karyawan(String id_karyawan) {
        this.id_karyawan = id_karyawan;
    }
    
}
