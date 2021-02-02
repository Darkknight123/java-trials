package com.company;

import java.util.Scanner;

public class marks {
    public static void main(String[]args){

        System.out.println("Enter your marks ranged from 0-100");
        Scanner sc =new Scanner(System.in);
        int marks;
        marks= sc.nextInt();
        if (marks>=35){
            System.out.println("you passed");
        }else{
            System.out.println("you failed");
        }

    }
}
