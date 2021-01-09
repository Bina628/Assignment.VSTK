package com.company;

import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        boolean love=true;
        while(love){
            System.out.println("Enter the most use number in love : ");
           int ageF=input.nextInt();
           if(ageF==143){
               System.out.println("yay! Your love is true");

           }

        }

    }
}
