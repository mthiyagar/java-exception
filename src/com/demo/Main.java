package com.demo;

public class Main {

    private String name;
    private static String staticName;

    public static void main(String[] args) {
	// write your code here
        Month month = Month.JANUARY;
        Main mainObject = new Main();
        mainObject.printMonth(month);

    }


    public void printMonth(Month month){
        switch (month){
            case JANUARY:
                System.out.println("This is January");
                break;
            default:
                System.out.println("This is not January");
        }
    }


}
