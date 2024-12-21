package com.trungtamjava.model;

import java.util.Scanner;

public class Tester extends Person {
    String testTool;

    public Tester(String testTool) {
        this.testTool = testTool;
    }

    public Tester() {
    }

    public String getTestTool() {
        return testTool;
    }

    public void setTestTool(String testTool) {
        this.testTool = testTool;
    }

    public void input() {
        super.input();
        Scanner scanner=new Scanner(System.in);
        System.out.println("cong cu thuc hien Test: ");
        testTool = scanner.nextLine();
    }

    public void info(){
        super.info();
        System.out.println("\t Cong cu thuc hien test: "+testTool);
    }
}
