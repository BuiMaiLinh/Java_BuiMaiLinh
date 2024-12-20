package com.trungtamjava.main;
import com.trungtamjava.model.Teacher;

public class MainTeacher {
    public static void main(String[] args) {
        Teacher mainTeacher= new Teacher();
        System.out.println(" nhap thong tin cho giang vien");
        mainTeacher.input();
        System.out.println(" thong tin giang vien vua nhap: \n");
        mainTeacher.info();
    }
}
