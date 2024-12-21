package com.trungtamjava.model;

import java.util.Scanner;

public class Person {
        int id;
        String name;
        String address;
        double age;

    public Person() {
    }

    public Person(int id, String name, String address, double age) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    // Phương thức input() để nhập dữ liệu
    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" nhap id cho Person: ");
        this.id= scanner.nextInt();

        scanner.nextLine();

        System.out.print("Nhap ten: ");
        this.name = scanner.nextLine();

//        scanner.nextInt();

        System.out.print("Nhap tuoi: ");
        this.age = scanner.nextInt();

        scanner.nextLine(); // Đọc ký tự xuống dòng

        System.out.print("Nhap dia chi: ");
        this.address = scanner.nextLine();
    }

    // Phương thức info() để hiển thị thông tin
    public void info() {
        System.out.println("\n\t id : "+id+"\n\t Ten: " + name + "\n\t Tuoi: " + age + "\n\t Dia chi: " + address );

    }
}
