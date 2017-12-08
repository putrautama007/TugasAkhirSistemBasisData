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
public class Supplier {
    private int id_supplier;
    private String nama_supplier;
    private String alamat_supplier;
    private String no_tlp_supplier;
    
    public Supplier(int id_supplier, String nama_supplier, String alamat_supplier, String no_tlp_supplier){
        this.id_supplier= id_supplier;
        this.nama_supplier= nama_supplier;
        this.alamat_supplier = alamat_supplier;
        this.no_tlp_supplier = no_tlp_supplier;
    }

    public int getId_supplier() {
        return id_supplier;
    }

    public void setId_supplier(int id_supplier) {
        this.id_supplier = id_supplier;
    }

    public String getNama_supplier() {
        return nama_supplier;
    }

    public void setNama_supplier(String nama_supplier) {
        this.nama_supplier = nama_supplier;
    }

    public String getAlamat_supplier() {
        return alamat_supplier;
    }

    public void setAlamat_supplier(String alamat_supplier) {
        this.alamat_supplier = alamat_supplier;
    }

    public String getNo_tlp_supplier() {
        return no_tlp_supplier;
    }

    public void setNo_tlp_supplier(String no_tlp_supplier) {
        this.no_tlp_supplier = no_tlp_supplier;
    }
            
    
}
