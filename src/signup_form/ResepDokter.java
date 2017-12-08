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
public class ResepDokter {
    private String no_resep;
    private String nama_dokter;
    private String kode_obat;
    private String aturan_minum;
    
    public ResepDokter(String no_resep, String nama_dokter, String kode_obat, String aturan_minum) {
        this.no_resep = no_resep;
        this.nama_dokter = nama_dokter;
        this.kode_obat = kode_obat;
        this.aturan_minum = aturan_minum;
    }

    public String getNo_resep() {
        return no_resep;
    }

    public void setNo_resep(String no_resep) {
        this.no_resep = no_resep;
    }

    public String getNama_dokter() {
        return nama_dokter;
    }

    public void setNama_dokter(String nama_dokter) {
        this.nama_dokter = nama_dokter;
    }

    public String getKode_obat() {
        return kode_obat;
    }

    public void setKode_obat(String kode_obat) {
        this.kode_obat = kode_obat;
    }

    public String getAturan_minum() {
        return aturan_minum;
    }

    public void setAturan_minum(String aturan_minum) {
        this.aturan_minum = aturan_minum;
    }
    
    
}
