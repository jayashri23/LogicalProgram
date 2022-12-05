package com.logicalprograms;

import java.util.Random;
import java.util.Scanner;

public class CouponNumber {
    public static void main(String[] args) {
        System.out.println("  How Many Random Number :");
        Scanner scanner =new Scanner(System.in);
        int size = scanner.nextInt();
      //  scanner.close();
        Random random =new Random();
        int randomNum = 0;
        int arr[] =new int[size];
        boolean flag;
        for (int i=0; i <size; i++) {
            randomNum = random.nextInt(20);
            flag = isPresent(arr, randomNum);
            if (flag != true) {
                arr[i] = randomNum;
            } else{
                i--;
            }
        }
            System.out.println("Random Number Generated are: ");
        for (int i=0 ;i <arr.length;i++){
            System.out.println(" " +arr[i]);
        }
    }
        public static boolean isPresent(int[] arr, int randomNum){
            for (int i =0; i <arr.length ;i++){
                if (arr[i] == randomNum){
                    return true;
                }
            }
            return false;
        }
    }
