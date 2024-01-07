//Muhammad Galuh Gumelar
//J0403221017
//TPLB1

package com.example.project.models;

public class Admin {
    private String kode;
    private String nama;
    private Integer harga;

    public Admin() {

    }

    public Admin(String kode, String nama, Integer harga){
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getKode() {
        return kode;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    public Integer getHarga() {
        return harga;
    }


}
