package com.pratik;
import java.util.Scanner;
public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Total ArmStrong Numbers find : - 153
        for(int i = 100; i < 1000; i++){
            if(isArmstrong(i)){
                System.out.println(i + " ");
            }
        }
    }
    static boolean isArmstrong(int n){
        int original = n ;
        int sum = 0;
        while( n > 0){
            int rem = n % 10;
            n = n/10;
            sum = sum + rem * rem * rem;
        }
        return sum ==original;

    }
}
