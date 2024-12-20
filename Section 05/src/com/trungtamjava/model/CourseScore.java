package com.trungtamjava.model;

import java.util.Scanner;

public class CourseScore {
    int id;
    double score;
    String name;

    public CourseScore() {
    }

    public CourseScore(int id, double score, String name) {
        this.id = id;
        this.score = score;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void  input(){
        Scanner scanner=new Scanner(System.in);
        System.out.println(" nhap id cua khoa hoc: ");
        this.id=scanner.nextInt();
        System.out.println(" nhap diem cua khoa hoc: ");
        this.score = scanner.nextDouble();
        scanner.nextLine();
        System.out.println(" nhap ten cua khoa hoc: ");
        this.name= scanner.nextLine();
    }

    public void info(){
        System.out.println(" thong tin diem cua khoa hoc: \n\t id khoa hoc "+id+"\n\t diem khoa hoc: "+score+"\n\t ten khao hoc: "+name);
    }

    public void classify(){
        if (score<5){
            System.out.println("\t Khoa hoc xep loai yeu.");
        } else if (score >=5 && score < 7) {
            System.out.println("\t Khoa hoc xep loai trung binh.");
        }else if (score >=7 && score < 8) {
            System.out.println("\t Khoa hoc xep loai kha.");
        }else if (score >=8 && score < 9) {
            System.out.println("\t Khoa hoc xep loai gioi.");
        }else if (score >=9) {
            System.out.println("\t Khoa hoc xep loai xuat sac.");
        }else {
            System.out.println("\t so diem ban nhap khong hop ly.");
        }
    }
}
