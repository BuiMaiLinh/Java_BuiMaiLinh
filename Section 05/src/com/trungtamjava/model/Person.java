package com.trungtamjava.model;

public class Person {
    String tenPerson;
    String loaiPerson;
    String maPerson;
    double giaPerson;
    Double soPerson;

    public Person() {
    }

    public Person(String tenPerson, String loaiPerson, String maPerson, double giaPerson, Double soPerson) {
        this.tenPerson = tenPerson;
        this.loaiPerson = loaiPerson;
        this.maPerson = maPerson;
        this.giaPerson = giaPerson;
        this.soPerson = soPerson;
    }

    public String getTenPerson() {
        return tenPerson;
    }

    public void setTenPerson(String tenPerson) {
        this.tenPerson = tenPerson;
    }

    public String getLoaiPerson() {
        return loaiPerson;
    }

    public void setLoaiPerson(String loaiPerson) {
        this.loaiPerson = loaiPerson;
    }

    public String getMaPerson() {
        return maPerson;
    }

    public void setMaPerson(String maPerson) {
        this.maPerson = maPerson;
    }

    public double getGiaPerson() {
        return giaPerson;
    }

    public void setGiaPerson(double giaPerson) {
        this.giaPerson = giaPerson;
    }

    public Double getSoPerson() {
        return soPerson;
    }

    public void setSoPerson(Double soPerson) {
        this.soPerson = soPerson;
    }
}
