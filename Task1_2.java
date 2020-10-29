package com.company;
import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;

        Scanner numA = new Scanner(System.in);
        System.out.print("Enter first number - a:");
        a = numA.nextInt();
        Scanner numB = new Scanner(System.in);
        System.out.print("Enter second number - b:");
        b = numA.nextInt();
        Scanner numC = new Scanner(System.in);
        System.out.print("Enter third number - c:");
        c = numA.nextInt();
        double z = (((b + Math.sqrt(b * b + 4 * a * c))) / (2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println("Result is " + z);
    }
}

