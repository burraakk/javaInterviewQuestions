package calisma01;

import java.util.Scanner;

public class Q03_Fibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many fibonacci number do you want to see : ");
        int number = scanner.nextInt();

        int num1 = 1;
        int num2 = 1;
        int num3;
        System.out.print(num1 + " " + num2 + " ");

        for (int i = 1; i < number-1; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(num3 + " ");
        }
    }
}
