package com.company;

import java.util.Scanner;

public class Criteria {

    public static void main(String[]args){
        int age;
        int X;
        double height;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        age=sc.nextInt();
        X=16-age;

        System.out.println("enter your height in (cms)");
        height= sc.nextDouble();
        if (age>=16 && height>167){
            System.out.println("you are qualified to play");
        }
        else if(age>=16 && height<167){
            System.out.println("You are not qualified to play");
        }else{
            System.out.println("You are not qualified as of now come back in" + X + "years");
        }



    }
}
