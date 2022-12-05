package com.logicalprograms;

import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter 1 to start stopwatch");
        int watch = scanner.nextInt();
        long startMillis = System.currentTimeMillis();
        System.out.println("StopWatch Starts");
        System.out.println("StopWatch Started at :" +startMillis);
        System.out.println("Enter '0 ' to  StopWatch ");
        watch =scanner.nextInt();
        scanner.close();
        long stopMillis = System.currentTimeMillis();
        System.out.println("StopWatch Stop at " +stopMillis);
        elapseCount(startMillis,stopMillis);
    }

    public static void elapseCount(long startMills,long stopMills){
        double elapse =stopMills -startMills;
        double seconds =elapse/1000;
        System.out.println("Time elapse in second :" +elapse);
        }
    }

