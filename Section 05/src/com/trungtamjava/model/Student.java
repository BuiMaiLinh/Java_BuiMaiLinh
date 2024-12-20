package com.trungtamjava.model;

import java.util.Scanner;

public class Student {
    int id;
    String name;
    String major;
    String address;

    public Student() {
    }

    public Student(int id, String name, String major, String address) {
        this.id = id;
        this.name = name;
        this.major = major;
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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap id cho sinh vien: ");
        this.id= scanner.nextInt();
        scanner.nextLine();
        System.out.println(" nhap ten cho sinh vien: ");
        this.name=scanner.nextLine();
        System.out.println(" nhap dia chi cho sinh vien: ");
        this.address= scanner.nextLine();
        System.out.println(" nhap chuyen nganh cho sinh vien: ");
        this.major= scanner.nextLine();
    }

    public void info(){
        System.out.println(" thong tin sinh vien: \n\t id sinh vien: "+id+"\n\t ten sinh vien: "+name+"\n\t dia chi sinh vien: "+address+"\n\t chuyen nganh sinh vien: "+major);
    }
}























