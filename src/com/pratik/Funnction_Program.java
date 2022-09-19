package com.pratik;

import java.util.Scanner;

public class Funnction_Program {
    public static void main(String[] args){
        sum();
    }
    static void sum(){     // return_type name()
        Scanner in = new Scanner(System.in); //body
        System.out.println(" Enter Number 1: ");
        int num1 = in.nextInt();
        System.out.println(" Enter Number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The Sum = " + sum);

    }
  //return statement
}
