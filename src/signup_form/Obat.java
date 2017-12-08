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
public class Obat {
   private String kode_obat;
   private String nama_obat;
   private String dosis;
   private Date kadaluarsa;
   private int harga;  
   private int id_supplier; 
   
   public Obat( String kode_obat,
    String nama_obat,
    String dosis,
    Date kadaluarsa,
    int harga,  
    int id_supplier ){
       this.kode_obat =kode_obat;
       this.nama_obat = nama_obat;
       this.dosis = dosis;
       this.kadaluarsa = kadaluarsa;
       this.harga = harga;
       this.id_supplier = id_supplier;       
   }

    public String getKode_obat() {
        return kode_obat;
    }

    public void setKode_obat(String kode_obat) {
        this.kode_obat = kode_obat;
    }

    public String getNama_obat() {
        return nama_obat;
    }

    public void setNama_obat(String nama_obat) {
        this.nama_obat = nama_obat;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public Date getKadaluarsa() {
        return kadaluarsa;
    }

    public void setKadaluarsa(Date kadaluarsa) {
        this.kadaluarsa = kadaluarsa;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getId_supplier() {
        return id_supplier;
    }

    public void setId_supplier(int id_supplier) {
        this.id_supplier = id_supplier;
    }
   
}
