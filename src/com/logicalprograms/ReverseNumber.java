package com.logicalprograms;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        int reverse = 0, reminder;
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while (number > 0) {
            reminder = number % 10;
            reverse = (reverse * 10) + reminder;
            number = number / 10;
        }
        System.out.println("Reverse Number :" + reverse);
    }
}
