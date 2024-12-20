package com.trungtamjava.main;

import com.trungtamjava.model.School;

import java.util.Scanner;

public class MainSchool {
    public static void main(String[] args) {

//        School[i] school=new School();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n So luong thong tin cua school can nhap = ");
        int n = scanner.nextInt();
        scanner.nextLine();

        School[] schools = new School[n];
        for(int i=0; i<n;i++){
            School school=new School();
            System.out.println("\n nhap thong tin cho school thu "+ (i+1));
            school.input();
            schools[i]=school;
        }

        System.out.println(" thong tin cua cac school vua nhap: ");
        for (int i=0; i<n;i++){
            schools[i].info();
        }

        // tim kiem
        System.out.println(" nhap tu can tim kiem: ");
        String Search=scanner.nextLine();
        System.out.println("\n cac thong tin truong tim kiem duoc: \n");
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (schools[i].getSchoolName().toLowerCase().contains(Search.toLowerCase())){
                schools[i].info();
            }
        }



    }
}
