package com.trungtamjava.model;

public class Laptop {
    String tenLaptop;
    String loaiLaptop;
    String maLaptop;
    double giaLaptop;
    Double soLaptop;


    public Laptop() {
    }

    public Laptop(String tenLaptop, String loaiLaptop, String maLaptop, double giaLaptop, Double soLaptop) {
        this.tenLaptop = tenLaptop;
        this.loaiLaptop = loaiLaptop;
        this.maLaptop = maLaptop;
        this.giaLaptop = giaLaptop;
        this.soLaptop = soLaptop;
    }

    public String getTenLaptop() {
        return tenLaptop;
    }

    public void setTenLaptop(String tenLaptop) {
        this.tenLaptop = tenLaptop;
    }

    public String getLoaiLaptop() {
        return loaiLaptop;
    }

    public void setLoaiLaptop(String loaiLaptop) {
        this.loaiLaptop = loaiLaptop;
    }

    public String getMaLaptop() {
        return maLaptop;
    }

    public void setMaLaptop(String maLaptop) {
        this.maLaptop = maLaptop;
    }

    public double getGiaLaptop() {
        return giaLaptop;
    }

    public void setGiaLaptop(double giaLaptop) {
        this.giaLaptop = giaLaptop;
    }

    public Double getSoLaptop() {
        return soLaptop;
    }

    public void setSoLaptop(Double soLaptop) {
        this.soLaptop = soLaptop;
    }
}
