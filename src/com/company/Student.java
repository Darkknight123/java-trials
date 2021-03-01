package com.company;

public class Student {
    int id;
    int Math;
    int phy;
    int chem;

    Student(int id,int Math,int phy,int chem){
        this.id=id;
        this.Math=Math;
        this.phy=phy;
        this.chem=chem;
        System.out.println("constructor code is being executed");
    }
     double percentage(int sum){
         return(sum/3);

     }
     int total (){
         return phy+Math+chem;
     }
}
