package com.company;

public class Student {
    int id;
    int Math;
    int phy;
    int chem;

    Student(int i,int M,int p,int c){
        id=i;
        Math=M;
        phy=p;
        chem=c;
        System.out.println("constructor code is being executed");
    }
     double percentage(int sum){
         return(sum/3);

     }
     int total (){
         return phy+Math+chem;
     }
}
