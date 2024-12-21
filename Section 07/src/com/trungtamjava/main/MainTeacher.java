package com.trungtamjava.main;

import com.trungtamjava.model.Teacher;

import java.util.Scanner;

public class MainTeacher {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" so giang vien can nhap thonhg tin: ");
        int n= scanner.nextInt();

        Teacher[] teachers= new Teacher[n];
        for (int i = 0; i < n; i++) {
            Teacher teacher=new Teacher();
            System.out.println(" nhap thong tin cho giang vien thu "+(i+1));
            teacher.input();
            teachers[i] =teacher;
        }

        System.out.println("thong tin cua giang vien vua nhap; ");
        for (int i = 0; i < n; i++) {
            teachers[i].info();
        }
    }
}
