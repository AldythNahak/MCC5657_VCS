/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training_mcc_java;

/**
 *
 * @author Aldyth M. V. Nahak (672017081)
 */
public class Employee {
    private String id, nama, jabatan;

    public Employee(){
        
    }
    
    public Employee(String id, String nama, String jabatan) {
        this.id = id;
        this.nama = nama;
        this.jabatan = jabatan;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", nama=" + nama + ", jabatan=" + jabatan + '}';
    }
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    
    
}
