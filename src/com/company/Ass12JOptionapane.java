package com.company;

import javax.swing.*;

public class Ass12JOptionapane {
    public static void main(String[] args){

        int a= Integer.parseInt(JOptionPane.showInputDialog("Enter number:"));
        System.out.println("Your Roll number "+a);
        String name=JOptionPane.showInputDialog("Your name: ");
        System.out.println("Full Name: "+name);
        String nationality=JOptionPane.showInputDialog("Nationality:");
        System.out.println("Nationality: "+nationality);

        int age=Integer.parseInt(JOptionPane.showInputDialog("Your age:"));
        System.out.println("Your Age: "+age);

    }
}

