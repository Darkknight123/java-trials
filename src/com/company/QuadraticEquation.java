package com.company;

import java.util.Scanner;

import static java.lang.Math.E;

public class QuadraticEquation {
    public static void main(String[]args){
        double a;
        double b;
        double c;
        double x1;
        double x2;
        Scanner sc =new Scanner(System.in);
        System.out.println("Input a");
        a=sc.nextInt();

        System.out.println("Input b");
        b=sc.nextInt();

        System.out.println("Input c");
        c=sc.nextInt();

        x1=-b+Math.sqrt(b*b-4*a*c)/2*a;
        x2=b+Math.sqrt(b*b-4*a*c)/2*a;

        System.out.println(x1);
        System.out.println(x2);
    }
}
