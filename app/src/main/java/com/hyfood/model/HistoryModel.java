package com.hyfood.model;

public class HistoryModel {
    String noOrder;
    String status;
    String noHp;
    String alamat;

    public HistoryModel(String noOrder, String status, String noHp, String alamat) {
        this.noOrder = noOrder;
        this.status = status;
        this.noHp = noHp;
        this.alamat = alamat;
    }

    public String getNoOrder() {
        return noOrder;
    }

    public void setNoOrder(String noOrder) {
        this.noOrder = noOrder;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
