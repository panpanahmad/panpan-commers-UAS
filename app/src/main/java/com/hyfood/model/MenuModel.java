package com.hyfood.model;

public class MenuModel {
    private String nama;
    private int harga;
    private String deksripsi;
    private int jml;

    public MenuModel(String nama, int harga, String deksripsi, int jml) {
        this.nama = nama;
        this.harga = harga;
        this.deksripsi = deksripsi;
        this.jml = jml;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getDeksripsi() {
        return deksripsi;
    }

    public void setDeksripsi(String deksripsi) {
        this.deksripsi = deksripsi;
    }

    public int getJml() {
        return jml;
    }

    public void setJml(int jml) {
        this.jml = jml;
    }
}
