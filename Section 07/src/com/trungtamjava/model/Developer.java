package com.trungtamjava.model;

import java.util.Scanner;

public class Developer extends Person  {
    String programLanguage;

    public Developer() {
    }

    public Developer(String programLanguage) {
        this.programLanguage = programLanguage;
    }

    public String getProgramLanguage() {
        return programLanguage;
    }

    public void setProgramLanguage(String programLanguage) {
        this.programLanguage = programLanguage;
    }

    public void input(){
        Scanner scanner=new Scanner(System.in);
//        System.out.println("Tong so nhan vien Developer can nhap thong tin: ");
//        int n=scanner.nextInt();
//        for (int i = 0; i <n ; i++) {
//
//        }

//            System.out.println(" thong tin nhan vien thu "+(i+1));
            super.input();
            System.out.println(" Ngon ngu lap trinh: ");
            programLanguage=scanner.nextLine();

    }

    public void info(){
        super.info();
        System.out.println("\t Ngon ngu lap trinh: "+programLanguage);
    }
}
