package com.company;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[]args){
        int ticket_price[]={100,150,500,20};
        int[] discounted_price=new int[ticket_price.length];
        int new_price;
        int i;
        int j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter percentage discount:");
        int discount=sc.nextInt();

        for (i=0, i<ticket_price.length,i++){
            System.out.println(ticket_price[i]);
            new_price=(ticket_price[i]-(ticket_price[i]*discount)/100);
        }


    }
}
