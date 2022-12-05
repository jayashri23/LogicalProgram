package com.logicalprograms;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n1=0,n2=1,n3,i;
        System.out.println("Enter the value :");
        Scanner scanner =new Scanner(System.in);
        int n =scanner.nextInt();
        System.out.print("Fibonacci Series = " );
        System.out.print(n1+" " +n2);
        for ( i =2 ;i < n; i++){
                                //n1 n2 n3
            //fibonacci series = 0    1  1   2   3  5  8  13  21  34
         n3 =n1+n2;
         n1 =n2;
         n2 =n3;
         System.out.print(" "  +n3 );
       }
    }
}
