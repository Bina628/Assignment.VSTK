package com.company;

import java.util.Scanner;

public class Methoddemo2 {
//creating methos with zero argument
    public void licensenum(){
        Scanner object=new Scanner(System.in);
        System.out.println("Enter your license number : ");
        int num=object.nextInt();
        System.out.println("Your license number is "+num);
    }
    public void age(){
        System.out.println("Enter your age: ");
        Scanner input=new Scanner(System.in);
        int age= input.nextInt();
        System.out.println("Your age is "+age);

    }


    public static void main(String[] args){
        Methoddemo2 name=new Methoddemo2();
        name.licensenum();
        name.age();



    }
}
