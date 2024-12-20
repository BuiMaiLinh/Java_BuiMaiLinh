package com.trungtamjava.model;

public class Table {
    String tenBan;
    String loaiBan;
    String maBan;
    double giaBan;

    public Table() {
    }

    public Table(String tenBan, String loaiBan, String maBan, double giaBan) {
        this.tenBan = tenBan;
        this.loaiBan = loaiBan;
        this.maBan = maBan;
        this.giaBan = giaBan;
    }

    public String getTenBan() {
        return tenBan;
    }

    public void setTenBan(String tenBan) {
        this.tenBan = tenBan;
    }

    public String getLoaiBan() {
        return loaiBan;
    }

    public void setLoaiBan(String loaiBan) {
        this.loaiBan = loaiBan;
    }

    public String getMaBan() {
        return maBan;
    }

    public void setMaBan(String maBan) {
        this.maBan = maBan;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public void inban(){
        System.out.printf("Thong tin ban \n\t ten ban: "+tenBan+"\n\t loai ban: "+loaiBan+"\n\t ma ban: "+maBan+"\n\t gia ban: %.3f",giaBan);
    }
}
