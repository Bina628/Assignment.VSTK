package com.company;


import java.util.Scanner;

public class ForloopPrac {
    public static void main (String[] args){
        Scanner object=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=object.nextInt();
        int sum=0;

        for(int i=2; i<=n;i++){
            sum=sum+i;
            System.out.println(i);
        }
        System.out.println("Sum of the number is : " +sum);
        System.out.println("Exited");

    }



}
