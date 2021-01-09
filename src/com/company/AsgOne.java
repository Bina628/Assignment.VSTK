package com.company;

import java.util.Scanner;

//write a program your introduction in three lines
public class AsgOne {
    public static void main(String[] args){
      Scanner simpleInt=new Scanner(System.in);

        System.out.println("Enter the P:");
        int p= simpleInt.nextInt();

        System.out.println("Enter the T:");
        int t= simpleInt.nextInt();

        System.out.println("ENter the R:");
        int r=simpleInt.nextInt();

        float total =(p*t*r);
        float simple=total/100;
        System.out.println(simple);










    }
}
