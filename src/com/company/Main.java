package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        int year;
        System.out.println("enter year");
        year = sc.nextInt();
        if(year%100==0 && year%400==0){
            System.out.println(" this is leap");
        }
        else if(year%4==0 && year%100!=0){
            System.out.println("this is leap");
        }
        else {
            System.out.println("this is not leap");
        }
    }
}
