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
public class Jabatan {
    private String id_krw;
    private String jabatan;
    
    public Jabatan(String id_krw,String jabatan){
        this.id_krw = id_krw;
        this.jabatan = jabatan;
    }

    public String getId_krw() {
        return id_krw;
    }

    public void setId_krw(String id_krw) {
        this.id_krw = id_krw;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    
}
