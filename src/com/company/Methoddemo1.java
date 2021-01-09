package com.company;

import java.util.Scanner;

public class Methoddemo1 {
    //creating method with zero argument
    public void movieName(){
        System.out.println("OverDoze");
        System.out.println("Garima");

    }

    //creating method with any type any arguments
    public void identity(String name,int num){
        System.out.println("Your name is "+name);
        System.out.println("your number is "+num);
    }

    public static void main(String[] args){
        Methoddemo1 obj=new Methoddemo1();
        obj.movieName();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=input.next();
        System.out.println("Enter your phone number ");
        int num=input.nextInt();


        obj.identity(name,num);
    }
}
