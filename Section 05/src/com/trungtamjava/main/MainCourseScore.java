package com.trungtamjava.main;
import com.trungtamjava.model.CourseScore;
public class MainCourseScore {
    public static void main(String[] args) {
        CourseScore courseScore=new CourseScore();
        System.out.println(" nhap thong tin ket qua cho khoa hoc:");
        courseScore.input();
        System.out.println("\n thong tin ket qua khoa hoc: ");
        courseScore.info();
        System.out.println(" Ket qua xep loai khoa hoc: ");
        courseScore.classify();
    }
}
