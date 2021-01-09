package com.company;

import javax.swing.*;

public class JOptPractice {
    public static void main (String[] args){
        int a= Integer.parseInt(JOptionPane.showInputDialog("Enter the number: "));
        int b=Integer.parseInt(JOptionPane.showInputDialog("Enter another number: "));

        int sum=a+b;
        int average=sum/2;

        System.out.println("Sum is: "+sum);
        System.out.println("Average is :"+average);




    }
}
