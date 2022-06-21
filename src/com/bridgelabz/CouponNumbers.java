package com.bridgelabz;

import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {
    public static void main(String[] args) {
        Scanner input_random = new Scanner(System.in);
        System.out.println("Total Number Of Coupons To Generate: ");
        int number = input_random.nextInt();
        Random random = new Random();
        for (int i=0; i<number; i++){
            int r = random.nextInt(10000-1000) + 1000;
            System.out.println(r);
        }
    }
}
