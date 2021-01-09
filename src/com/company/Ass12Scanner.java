package com.company;

import java.util.Scanner;

public class Ass12Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Your Name: ");
        String name=input.nextLine();

        System.out.println("Enter your roll number :");
        int roll = input.nextInt();

        System.out.println("Nationality:");
        String nationality=input.next();

        System.out.println("Your Roll number is:  "+roll+"Your name is:  "+name+"Your nationality:  "+nationality);


    }
}
