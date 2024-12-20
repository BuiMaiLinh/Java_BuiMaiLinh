package com.trungtamjava.model;

public class Chair {
    String tenChair;
    String loaiChair;
    String maChair;
    double giaChair;
    Double soChair;

    public Chair() {
    }

    public Chair(String tenChair, String loaiChair, String maChair, double giaChair, Double soChair) {
        this.tenChair = tenChair;
        this.loaiChair = loaiChair;
        this.maChair = maChair;
        this.giaChair = giaChair;
    }

    public String getTenChair() {
        return tenChair;
    }

    public void setTenChair(String tenChair) {
        this.tenChair = tenChair;
    }

    public String getLoaiChair() {
        return loaiChair;
    }

    public void setLoaiChair(String loaiChair) {
        this.loaiChair = loaiChair;
    }

    public String getMaChair() {
        return maChair;
    }

    public void setMaChair(String maChair) {
        this.maChair = maChair;
    }

    public double getGiaChair() {
        return giaChair;
    }

    public void setGiaChair(double giaChair) {
        this.giaChair = giaChair;
    }

    public void inChair(){
        System.out.printf("Thong tin ghe \n\t Ten ghe: " + tenChair + "\n\t loai ghe: "+tenChair +"\n\t ma ghe "+maChair+"\n\t gia ghe: %.3f",giaChair);
    }

}
