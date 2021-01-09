package com.company;

import javax.swing.*;
import java.sql.SQLOutput;

public class DaySix {
    public static void main (String[] args){
        int a= Integer.parseInt(JOptionPane.showInputDialog("Enter your first grade (a): "));

        if (a>=90){
            System.out.println("Grade A");
        }
        else if (a>=80 && a<=89){
            System.out.println("Grade B");

        }
        else if (a>=70 && a<=79) {
            System.out.println(" Grade c");
        }
        else if (a>=60 && a<=69){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }

    }
}
