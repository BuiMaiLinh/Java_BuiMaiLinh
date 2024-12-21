package com.trungtamjava.main;
import com.trungtamjava.model.Student;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println(" So luong sinh vien can nhap: ");
        int n=scanner.nextInt();

        Student[] students=new Student[n];
        for (int i = 0; i < n; i++) {
            Student student = new Student();
            System.out.println(" Nhap thong tin cho sinh vien thu " + (i+1));
            student.input();
            students[i]= student;
        }

        System.out.println(" thong tin cua sinh vien vua nhap: ");
        for (int i = 0; i < n; i++) {
            students[i].info();
        }


    }
}
