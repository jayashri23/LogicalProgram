package com.logicalprograms;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int i,sum =0;
        System.out.println("Enter the Number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for ( i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        if(sum == number){
            System.out.println(number+ " is Perfect Number");
        }else {
            System.out.println(number+ " is not Perfect Number");
        }
    }
}
