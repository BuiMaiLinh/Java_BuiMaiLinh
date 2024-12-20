package com.trungtamjava.model;

import java.util.Scanner;

public class Teacher {
    int id;
    String name;
    String facility;
    String address;

    public Teacher() {
    }

    public Teacher(int id, String name, String facility, String address) {
        this.id = id;
        this.name = name;
        this.facility = facility;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap id cho giang vien: ");
        this.id= scanner.nextInt();
        scanner.nextLine();
        System.out.println(" nhap ten cho giang vien: ");
        this.name=scanner.nextLine();
        System.out.println(" nhap dia chi cho giang vien: ");
        this.address= scanner.nextLine();
        System.out.println(" nhap chuyen nganh cho giang vien: ");
        this.facility= scanner.nextLine();
    }

    public void info(){
        System.out.println(" thong tin giang vien: \n\t id giang vien: "+id+"\n\t ten giang vien: "+name+"\n\t dia chi giang vien: "+address+"\n\t chuyen nganh giang vien: "+facility);
    }

}
