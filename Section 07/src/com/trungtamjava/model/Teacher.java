package com.trungtamjava.model;

import java.util.Scanner;

public class Teacher  extends Person{
    String maGv;
    String khoa;
    String mon;

    public Teacher() {
    }

    public Teacher(String maGv, String khoa, String mon) {
        this.maGv = maGv;
        this.khoa = khoa;
        this.mon=mon;
    }

    public String getMaGv() {
        return maGv;
    }

    public void setMaGv(String maGv) {
        this.maGv = maGv;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    // Phương thức input() để nhập dữ liệu
    public void input() {
        Scanner scanner = new Scanner(System.in);
        super.input();

        System.out.print("Nhap ma giang vien: ");
        this.maGv = scanner.nextLine();

        System.out.print("Nhap khoa cho giang vien : ");
        this.khoa = scanner.nextLine();
    }

    // Phương thức info() để hiển thị thông tin
    public void info() {
        System.out.println("\n\t Ma giang vien: " + maGv );
        super.info();
        System.out.println("\t Khoa: " + khoa );

    }

}
