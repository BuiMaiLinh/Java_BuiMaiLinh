package com.trungtamjava.main;
import com.trungtamjava.model.Student;

public class MainStudent {
    public static void main(String[] args) {
        Student mainStudent= new Student();
        System.out.println(" nhap thong tin cho sinh vien");
        mainStudent.input();
        System.out.println(" thong tin sinh vien vua nhap: \n");
        mainStudent.info();
    }
}
