package com.pratik;

import java.util.Scanner;

public class Funnction_Program {
    public static void main(String[] args){
        int addition = sum();
       System.out.println( "The sum of two Numbers is : " + addition);
    }
    static int sum( /* We can add pramenters  here */){     // return_type name()
        Scanner in = new Scanner(System.in); //body
        System.out.println(" Enter Number 1: ");
        int num1 = in.nextInt();
        System.out.println(" Enter Number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;

    }
  //return statement
}
//What is return type : When we call the function what is the value of that function