package com.trungtamjava.model;

import java.util.Scanner;

public class Student extends Person {
    String maSv;
    String lop;
    String khoa;

    public Student() {
    }

    public Student(String maSv, String lop, String khoa) {
        this.maSv = maSv;
        this.lop = lop;
        this.khoa = khoa;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    // Phương thức input() để nhập dữ liệu
    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ma sinh vien: ");
        this.maSv = scanner.nextLine();
        super.input();
        System.out.print("Nhap lop sinh vien hoc: ");
        this.lop = scanner.nextLine();
        scanner.nextLine(); // Đọc ký tự xuống dòng

        System.out.print("Nhap khoa sinh vien hoc: ");
        this.khoa = scanner.nextLine();
    }

    // Phương thức info() để hiển thị thông tin
    public void info() {
        System.out.println("\n\t Ma sinh vien: " + maSv );
        super.info();
        System.out.println( "\n\t Lop sinh vien: " + lop + "\n" + "\t Khoa: " + khoa );

    }

}
