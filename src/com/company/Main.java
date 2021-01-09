package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        //convert celcius to farenheight and farenheight to cel

        Scanner convert=new Scanner(System.in);

        System.out.println("Enter your celsius number and I will convert into Farenheight: ");
        int celNum=convert.nextInt();

        float finalFar= (float) (celNum*1.8);
        float finalFaren=finalFar+32;
        System.out.println("Your Final celsious into Fahrenheight is: " +finalFaren);


        //now its time to change fahrenheight to celsius
        System.out.println("Enter your Fahrenheit number:  ");
        int farenNum= convert.nextInt();

        float finalNum=(float)((farenNum-32)*5/9);
        System.out.println("Your final Fahrenheit into celsius is"+finalNum);


    }


}
