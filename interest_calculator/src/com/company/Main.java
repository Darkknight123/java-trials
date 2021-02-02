package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	  double p,n,r,si;
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the principal amount");
        p=sc.nextFloat();

        System.out.println("enter the number of years");
        n=sc.nextFloat();

        System.out.println("enter the rate of interest");
        r=sc.nextFloat();

        si=(p*r*n)/100;
        System.out.println("The interest amount is "+si);


    }
}
