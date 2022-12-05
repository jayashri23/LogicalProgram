package com.logicalprograms;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        int m, flag = 0;
        System.out.println("Enter the number :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + " is Prime Number");
        }else {
            for (int i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is Prime Number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0){
                System.out.println(n+ " is Prime Number");
            }
        }
    }
}