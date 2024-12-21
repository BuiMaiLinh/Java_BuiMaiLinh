package com.trungtamjava.main;

import java.util.Scanner;

import com.trungtamjava.model.Leader;
import com.trungtamjava.model.Developer;
import com.trungtamjava.model.Tester;

public class MainCompany {
    public static void main(String[] args) {
        int count=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println(" 1. Developer");
        System.out.println(" 2. Leader");
        System.out.println(" 3. Tester");
        System.out.println("nhap bo phan can quan ly : ");
        int chon=scanner.nextInt();
        System.out.println("Tong so nhan vien can nhap thong tin: ");
        int n=scanner.nextInt();
        Developer[] developers= new Developer[n];

        Tester[] testers=new Tester[n];

        if (chon==1){
            Developer developer=new Developer();
            for (int i = 0; i < n; i++) {
                System.out.println(" thong tin nhan vien thu "+(i+1));
                developer.input();
                developers[i]=developer;

                System.out.println("\n thong tin nhan vien thu "+(i+1));
                developers[i].info();

                if (developer.getProgramLanguage().toLowerCase().contains("java")){
                    System.out.println("\n nhan vien co ngon ngu lap trinh la java tong la: "+i);
                    developers[i].info();
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.println("\n thong tin nhan vien thu "+(i+1));
                developers[i].info();

                // Kiểm tra ngôn ngữ lập trình

            }
            for (int i = 0; i < n; i++) {
                if (developer.getProgramLanguage().equals("java")) {
                    count++ ; // Tăng biến đếm nếu có ngôn ngữ lập trình "Java"
                }
            }

            System.out.println("Tong so nhan vien cos ngon ngu lap trinh java la: "+count);
            System.out.println();
            for (int i = 0; i < n; i++) {
                developers[i].info();
            }


        }
        else if (chon==2) {
            Leader leader=new Leader();
            Leader[] leaders=new Leader[n];
            for (int i = 0; i < n; i++) {
                System.out.println(" thong tin nhan vien thu "+(i+1));
                leader.input();
                leaders[i]=leader;
            }

            for (int i = 0; i < n; i++) {
                System.out.println(" thong tin nhan vien thu "+(i+1));
                leaders[i].info();
            }
            leader.bonus();

            // Tìm và in các Leader có teamSize > 10
            System.out.println("\nLeader co teamSize > 10:");
            for ( Leader Templeader : leaders){
                if (Templeader.size()){
                    Templeader.info();
                }
            }
        }else if (chon==3) {
            Tester tester=new Tester();
            for (int i = 0; i < n; i++) {
                System.out.println(" thong tin nhan vien thu "+(i+1));
                tester.input();
                testers[i]=tester;
            }

            for (int i = 0; i < n; i++) {
                System.out.println("\n thong tin nhan vien thu "+(i+1));
                testers[i].info();
            }
        }
        else{
            System.out.println("yeu cau khong hop le vui long nhap cac lua chon 1,2,3");
        }




    }
}
