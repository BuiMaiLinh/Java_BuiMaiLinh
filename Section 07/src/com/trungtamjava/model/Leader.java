package com.trungtamjava.model;

import java.util.Scanner;

public class Leader extends  Person{
    int teamSize;
    private static final double luongCoBan = 10000000; // Hằng số lương cơ bản

    public Leader() {
    }

    public Leader(int teamSize) {
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public void input(){
        super.input();
        Scanner scanner=new Scanner(System.in);
        System.out.println("So thanh vien trong nhom: ");
        teamSize= scanner.nextInt();
    }

    public void info(){
        super.info();
        System.out.println("\t So thanh vien trong nhom: "+teamSize);
    }

    public void bonus(){

        if (this.getTeamSize()>=10){
            double luong= luongCoBan * 0.5;
            System.out.println("\nLuong cua Leader la : " + luong);
        }else{
            double luong= luongCoBan * 0.1;
            System.out.println("\nLuong cua Leader la : " + luong);
        }

    }

    public boolean size(){
        return this.teamSize >10;
    }
}
